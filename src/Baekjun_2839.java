import java.io.*;

public class Baekjun_2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a = 5;
		int b = 3;
		int c = 0;
		int e = 0;
		int i = 1;

		while (n % e == 0) {
			int x = n % (a * i);
			c = a * i;

			for (int j = 1; j < n; j++) { 
				x = x % (b * j);
				if (x == 0) {
					System.out.println(c + b);
					break;
				}
			}

		}
		i++;
	}

}