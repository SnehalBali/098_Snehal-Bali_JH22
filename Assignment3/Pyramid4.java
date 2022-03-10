class Pyramid4
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=i;j<9;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(k);
			}
			for(int l=i;l>=1;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}	
	}	
}