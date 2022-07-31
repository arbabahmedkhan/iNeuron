
public class pattern_0 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int n = 14;
		int m = 6*n + 1;
		for (i=0;i<n;i++) {
			for (j=0;j<m;j++) {
				if (j==0)
					System.out.print("* ");
				else if (j>0 && j<=n)
				{
					if (j==1 || j==n || j==i+1 )
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				else if (j>n && j<=2*n) 
				{
					if (i==0 || i==n-1 || i== n/2 || j==n+1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				else if (j>2*n && j<=3*n)
				{
					if (i==n-1 || j==2*n+1 || j==3*n)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				else if (j>3*n && j<=4*n)
				{
					if (i==0 || i==n/2 || j==3*n+1 || (j==4*n && i<=n/2) || (i-(j-3*n-1)==0 && i>=n/2))
							System.out.print("* ");
					else 
						System.out.print("  ");
				}
				else if (j>4*n && j<=5*n)
				{
					if (i==0 || i==n-1 || j==4*n+1 || j==5*n)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				else if (j>5*n && j<=6*n)
				{
					if (j==5*n+1 || j==6*n || j-i==5*n+1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				
				
				else
					System.out.print("  ");
			}
			
			System.out.println();
		}
	}

}
