package guy.doulberg.problem1;

import java.util.HashSet;
import java.util.Set;

public class TreeNode {
	TreeNode parent;

	/**
	 * 
	 * Description:
	 * given another TreeNode finds the first (deepest in the tree) common
	 * ancestor of 'this' TreeNode and the one passed to the method. Assume that
	 * each TreeNode is a node in a binary tree
	 * 
	 * Implemantations:
	 * 1. I create a set of all the other ancestors
	 * 2. I look for the first ancestor of this node in this set and return it
	 * 3. if none found null is returned
	 * 
	 * The run time of this solution is O(n) - cause we visit at most one time for each ancestor, and in each visit we perform add or contains on a HashSet which a re geranteed 
	 * to provide O(1) assuming the hash function disperses the elements properly among the buckets.
	 * 
	 * The memory consumption of the solution is O(n) also, since at most all of the nodes (except for the first other and this) would be present in the final set.
	 * 
	 * 
	 * @param other
	 *            - the other tree
	 * @return
	 */
	TreeNode findFirstCommonAncestor(TreeNode other) {
		Set<TreeNode> ancestors = buildOtherAncestor(other,
				new HashSet<TreeNode>());
		return firstNodeInSet(ancestors);
	}

	private TreeNode firstNodeInSet(Set<TreeNode> set){
		
		if (set.contains(this)){
			return this;
		}else if (this.parent != null) {
			return this.parent.firstNodeInSet(set);
		}else {
			return null;
		}
		
	}

	private Set<TreeNode> buildOtherAncestor(TreeNode other,
			Set<TreeNode> ancestors) {

		if (other.parent != null) {
			ancestors.add(other.parent);
			buildOtherAncestor(other.parent, ancestors);
		}
		return ancestors;
	}

}
