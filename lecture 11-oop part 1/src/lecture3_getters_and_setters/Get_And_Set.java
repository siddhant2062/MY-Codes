package lecture3_getters_and_setters;

class Get_And_Set {
	private String name = "siddhant";

	void setName(String a) { /* setter method should be a no return and with argument type.......because if
								  the value is not set we have to set it first*/
								  
//	if(a.length()==8) {
//		return;
//	}
		name = a;
	}

	String getName() { /*getter method should be a return and with no argument type.....because by
						  this method we can access value from another class*/					 
		return name;
	}

}
