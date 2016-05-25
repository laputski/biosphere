import java.util.*;



public class GrayCodeTester{

	public static void main(String[] args) {
		  int n;
	        do {
	            Scanner scan = new Scanner(System.in);
	            System.out.print("Enter the factorial of natural n : ");
	            n = scan.nextInt();
	            int result = 1;
	            for (int i = 2; i <= n; i++)
	                result *= i;
	            System.out.println(result);
	            if (n == 0 || n == 1)
	                System.out.println(result);
	            if (n < 0)
	                System.out.println("You enter negative number");
	        } while (n < 0);
	        {
	            System.out.println("that's all");
	        }
	        ChromosomeCode t1 = new ChromosomeCode();
	        int x = 0;
	        System.out.println("\nTest of public class");
	        x = t1.encodeGray(5);
	        System.out.println(x);
	        x = t1.decodeGray(3);
	        System.out.println(x);


	        ChromosomeCode t2 = new ChromosomeCode();
	        int y = 0;
	        System.out.println("\nTest of inner class");
	        y = t2.test.encodeGray(9);
	        System.out.println(y);
	        y = t2.test.decodeGray(11);
	        System.out.println(y);


	        ChromosomeCode.GrayCodeNested t3 = new ChromosomeCode.GrayCodeNested();
	        int z = 0;
	        System.out.println("\nTest of nested class");
	        z = t3.encodeGray(5);
	        System.out.println(z);
	        z = t3.decodeGray(12);
	        System.out.println(z);
	        
	        ChromosomeCode b, d;
	        b=new ChromosomeCode();
	        d=b;
	        System.out.println(d.equals(b));
	        System.out.println(d.hashCode()==b.hashCode());
	}



}
