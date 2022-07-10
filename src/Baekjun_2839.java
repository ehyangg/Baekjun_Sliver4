import java.io.*;
public class Baekjun_2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a = 5; // 5kg 
		int b = 3; // 3kg
		int c = 0; // 5kg 갯수
		int d = 0; // 3kg 갯수
		int e = 0; // 3, 5 총 갯수
		int i = 1;

		while (n % e == 0) {
			int x = n - (a * i);
			c = a * i;

			for (int j = 1; j < n; j++) { 
				x = x % (b * j);
				if (x == 0) {
					d = b * j;
					System.out.println(c + d);
					break;
				} else { continue; } 
				
			}

		}
		i++;
	}

}