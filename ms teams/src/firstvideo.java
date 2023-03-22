class base1 {
	base1() {
		System.out.print("i m a constructor");
	}

	public int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}

class derived extends base1 {
	public int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}

public class firstvideo {
	public static void main(String[] args) {
		base1 b = new base1();
		derived d = new derived();

	}
}
