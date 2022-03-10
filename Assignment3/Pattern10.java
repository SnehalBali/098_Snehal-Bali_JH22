class Pattern10
{
	public static void main(String args[])
	{char i,j,k;
		for(i='E';i>='A';i--)
		{
			for(j='A';j<i;j++)
			{
				System.out.print(" ");
			}									
			for (k=i;k<='E';k++)
			{
				System.out.print(" "+k);
					
			}
			System.out.println();
		}	
	}	
}
