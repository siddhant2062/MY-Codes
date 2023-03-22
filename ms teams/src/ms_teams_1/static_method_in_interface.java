package ms_teams_1;

interface Drawable{
	void Draw();
	static int cube(int x) {
		return x*x*x;
	}
}
class Rectangle implements Drawable{
	public void Draw() {
		System.out.println("Drawing Rectangle");
	}
}

class static_method_in_interface {
	public static void main(String args[]) {
		Drawable d=new Rectangle();
		d.Draw();
		System.out.println(Drawable.cube(3));
	}

}
