class Pattern2
{
	public static void main(String args[])
	{
		char i,j;
		for(i='A';i<='E';i++)//row
		{
			for(j='A';j<=i;j++)//column
			{
				System.out.print(" "+j);
			}
			System.out.println();
			
		}
	
	}
	
}