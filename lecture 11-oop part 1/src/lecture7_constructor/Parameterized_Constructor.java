package lecture7_constructor;

class Parameterized {
	int year;
	String name;
	
	Parameterized(int year,String name){//constructor has no return type like{void,int,double....}
		this.year=year;
		this.name=name;
	}
}

class Parameterized_Constructor {
	public static void main(String args[]) {
		Parameterized p1=new Parameterized(2020,"Siddhant");
		System.out.println(p1.year);
		System.out.println(p1.name);
	}

}
