package ms_teams_1;
class ABCIceCream {
	@Override
    public void icecream() {
        System.out.println("Default Vanilla Icecream");
    }
}

class XIceCream extends ABCIceCream {
    public void icecream() {
        System.out.println("Default Vanilla Icecream");
    }
}

class YIceCream extends ABCIceCream { 
	@Override
    public void icecream() {
        System.out.println("Vanilla with Chocolate Icecream");
    } 
}

public class Icecream {
	public static void main(String args[]) {
		
		YIceCream y1=new YIceCream();
		y1.icecream();
//		y1.icecream();
	}

}
