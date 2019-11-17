//Unchecked or Runtime exceptions
public class ExceptionHandling {

	public static void main(String[] args) {
		try
		{
			int a = 8, b=0;
			int c= a/b;
			System.out.println(c);
			/*String s = null;
			System.out.println(s.length());
			int [] a = {1,2,3,4};
			System.out.println(a[8]);*/	
		}
		
		catch(ArrayIndexOutOfBoundsException aio)
		{
			System.out.println("aio");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ae");
			ae.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Some Technical error");
		}
		finally {
			System.out.println("Finally");
		}
		
		

	}

}
