package guy.doulberg.solution2;

public class CustomerGroup {
	public  int size;  //number of people in the group
	
	private Table seatedTable;
	
	public CustomerGroup(int size){
		this.size = size;
	}

	public Table getSeatedTable() {
		return seatedTable;
	}

	public void setSeatedTable(Table seatedTable) {
		this.seatedTable = seatedTable;
	}
}
