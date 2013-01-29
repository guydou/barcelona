package guy.doulberg.problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TreeNodeTest {

	TreeNode x,y,z,w,v,u;
	/**
	 * 
	 *     			x
	 *             / \
	 *            y   z
	 *               / \
	 *               w  v
	 *               
	 *               u
	 * 
	 * 			
	 */
	@Before
	public void createTree(){
		
		x = new TreeNode();
		y = new TreeNode();
		z= new TreeNode();
		w = new TreeNode();
		v = new TreeNode();
		u= new TreeNode();
		
		w.parent=z;
		z.parent=x;
		y.parent=x;
		v.parent=z;
		
	}
	
	@Test
	public void testfindFirstCommonAncestor() {
		TreeNode findFirstCommonAncestor = v.findFirstCommonAncestor(y);
		assertEquals(x, findFirstCommonAncestor);
		findFirstCommonAncestor = v.findFirstCommonAncestor(w);
		assertEquals(z, findFirstCommonAncestor);
		findFirstCommonAncestor = v.findFirstCommonAncestor(u);
		assertNull(findFirstCommonAncestor);
		
		
	}

}
