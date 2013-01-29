package guy.doulberg.solution2;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.google.common.collect.TreeMultiset;




public class SeatingManager {
	
	TreeMultiset<Table> tables =  TreeMultiset.create(new Comparator<Table>() {

		@Override
		public int compare(Table o1, Table o2) {
			// TODO Auto-generated method stub
			return o1.size - o2.size;
		}
	});

	LinkedList<CustomerGroup> queue = new LinkedList<CustomerGroup>();

	/* Constructor */
	public SeatingManager(List<Table> tables) {

		this.tables.addAll(tables);

	};

	/* Group arrives and wants to be seated. */
	public void arrives(CustomerGroup group) {
		queue.addLast(group);
		
		
		
		
	};

	/* Whether seated or not, the group leaves the restaurant. */
	public void leaves(CustomerGroup group) {
		if (group.getSeatedTable() != null){
			//The group was seated and the table returns to the poll
			this.tables.add(group.getSeatedTable());
			group.setSeatedTable(null);
		}else {
			//The group was not seated and removed from queue
			queue.remove(group);
		}
		
	};

	/*
	 * Return the table at which the group is seated, or null if they are not
	 * seated (whether they're waiting or already left).
	 */
	public Table locate(CustomerGroup group) {
		
		
		return null;
	};

}
