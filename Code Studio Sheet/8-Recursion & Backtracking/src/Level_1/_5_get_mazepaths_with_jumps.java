package Level_1;
import java.util.*;
public class _5_get_mazepaths_with_jumps {
	static ArrayList<String> gmc(int sr,int sc,int dr,int dc){
		if(sr==dr&&sc==dc) {
			ArrayList<String> ans=new ArrayList<>();
			ans.add("");
			return ans;
		}
		ArrayList<String> paths=new ArrayList<>();
		for(int size=1;size<=dc-sc;size++) {
			ArrayList<String> hpaths=gmc(sr,sc+size,dr,dc);
			for(int i=0;i<hpaths.size();i++) {
				paths.add("h"+size+hpaths.get(i));
			}
		}
		for(int size=1;size<=dr-sr;size++) {
			ArrayList<String> vpaths=gmc(sr+size,sc,dr,dc);
			for(int i=0;i<vpaths.size();i++) {
				paths.add("v"+size+vpaths.get(i));
			}
		}
		for(int size=1;size<=dc-sc&&size<=dr-sr;size++) {
			ArrayList<String> dpaths=gmc(sr+size,sc+size,dr,dc);
			for(int i=0;i<dpaths.size();i++) {
				paths.add("d"+size+dpaths.get(i));
			}
		}
		return paths;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(gmc(1,1,m,n));
				
	}
}
