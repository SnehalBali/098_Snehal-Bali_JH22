class Starp5
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<5;j++)
			{	
				System.out.print(" ");		
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("*");
			}
			for(int l=i;l>1;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}	
}
