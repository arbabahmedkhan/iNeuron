
public class pattern_3 {

	public static void main(String[] args) {
		int i;
		int j;
		int n = 14;
		for (i=0;i<n;i++) {
			for (j=0;j<n;j++) {
				if (i==n-1 || j==0 && i>=n/2 || j==n-1 && i>=n/2|| j+i>=3*n/2 - 2 || i-j>=n/2 - 1) 
				System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
