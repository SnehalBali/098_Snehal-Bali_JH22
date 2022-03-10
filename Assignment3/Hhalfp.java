class Hhalfp
{
	public static void main(String main[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=i;j<=6;j++)
			{
				if(i==1||j==i||j==6)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}			
	}
}