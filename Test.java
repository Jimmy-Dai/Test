public class Test
{
	public static void main(String[] args)
	{
		for(int j=1;j<=9;j++)
		{
			for(int i=1;i<=j;i++)
			{
				System.out.print(j+"x"+i+"="j*i);
				if(i==j)
					System.out.print("\n");
			}
		}
	}
}