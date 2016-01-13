public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<80; i++ )
		{
			if ( i%9 == 0 )
				System.out.print(" Mr. Mitchell is c. \r");
			else if (i%9 == 1)
				System.out.print(" Mr. Mitchell is co. \r");
			else if (i%9 == 2)
				System.out.print(" Mr. Mitchell is coo. \r");
			else if (i%9 == 3)
				System.out.print(" Mr. Mitchell is cool. \r");
			else if (i%9 == 4)
				System.out.print(" Mr. Mitchell is s cool. \r");
			else if (i%9 == 5)
				System.out.print(" Mr. Mitchell is su cool. \r");
			else if (i%9 == 6)
				System.out.print(" Mr. Mitchell is sup cool. \r");
			else if (i%9 == 7)
				System.out.print(" Mr. Mitchell is supe cool. \r");
			else if (i%9 == 8)
				System.out.print(" Mr. Mitchell is super cool. \r");

			Thread.sleep(200);
		}
		
	}
}