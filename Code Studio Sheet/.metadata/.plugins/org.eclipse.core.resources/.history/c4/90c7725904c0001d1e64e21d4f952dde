package Level_1;
import java.util.*;
public class _4_get_maze_paths {
	static ArrayList<String> gmc(int sr,int sc,int dr,int dc){
		if(sc==dc&&sr==dr) {
			ArrayList<String> ans=new ArrayList<>();
			ans.add("");
			return ans;
		}
		ArrayList<String> hpaths=new ArrayList<>();
		ArrayList<String> vpaths=new ArrayList<>();
		if(sc<dc) {
			hpaths=gmc(sr,sc+1,dr,dc);
		}
		if(sr<dr) {
			vpaths=gmc(sr+1,sc,dr,dc);
		}
		ArrayList<String> paths=new ArrayList<>();
		for(int i=0;i<hpaths.size();i++) {
			paths.add("h"+hpaths.get(i));
		}
		for(int i=0;i<vpaths.size();i++){
			paths.add("v"+vpaths.get(i));
		}
		return paths;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		System.out.println(gmc(1,1,row,col));
	}
}
