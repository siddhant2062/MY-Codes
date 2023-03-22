//note:- only public and default access modifier can be used for class.
//when the access modifier is public than it is global i.e., if the class is public than the file can be accessible from both inside and outside of the package of that project/directory.

//now we will call this Public_Modifier class in different package named temp....so we have to keep all things public to be accessible in temp package class 
package lecture2_Access_Modifiers;

public class Public_Modifier {
	 public void display() {
		System.out.println("i am display");
	}
}
