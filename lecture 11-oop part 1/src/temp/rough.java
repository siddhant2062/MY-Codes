package temp;

public class rough {
	private int emp_id;
	public String name;
	
	public void setter(int id) {
		if(id>0) {
			emp_id=id;
		}else {
			System.out.println("invalid id");
		}
	}
	public int getter() {
		return emp_id;
	}
}
