package rough;

//import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.util.HashSet;
//import java.util.Set;
import java.util.*;
import java.io.*;
public class New_class {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		while (T > 0) {
			if ((s = br.readLine().trim()) != null) {
				st = new StringTokenizer(s);
				int N = Integer.parseInt(st.nextToken());
				int M = Integer.parseInt(st.nextToken());
				Set<Long> arr = new HashSet<Long>();
				StringBuilder ans = new StringBuilder();

				if ((s = br.readLine().trim()) != null) {
					st = new StringTokenizer(s);
					for (int i = 0; i < N; i++) {
						long num = Long.parseLong(st.nextToken());
						arr.add(num);
					}
					for (int i = 0; i < M; i++) {
						long num = Long.parseLong(st.nextToken());
						if (arr.contains(num)) {

							ans.append("YES\n");
						} else {
							arr.add(num);
							ans.append("NO\n");
						}

					}
					out.print(ans);
					T--;
				}
			}
		}
		out.close();

	}

}
