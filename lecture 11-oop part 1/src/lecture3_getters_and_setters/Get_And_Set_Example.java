package lecture3_getters_and_setters;

class Employee {
	String name;
	private int emp_id;

	void set_id(int id) {
		if (id > 0)
			emp_id = id;
		else
			System.out.println("Invalid id");
	}

	int get_id() {
		return emp_id;
	}

	void set_name(String n) {
		name = n;
	}
}

class Get_And_Set_Example {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.set_id(10);
		e.set_name("Siddhant");
		System.out.println(e.get_id() + " " + e.name);
	}
}
