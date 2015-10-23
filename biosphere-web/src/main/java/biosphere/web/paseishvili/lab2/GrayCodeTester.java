package biosphere.web.paseishvili.lab2;

/**
 * Created by UNBREAKING on 25.09.2015.
 */
import java.util.Scanner;

public class GrayCodeTester {
    public static void main_LB2_Paseishvili_Alexey(String [] args){
        int P=1;
        int k;
        Scanner in=new Scanner(System.in);
        System.out.println("this is test factorial program");
        System.out.println("Write down the number");
        k= in.nextInt();
        int Op=enCode(k);
    System.out.println(Op);
        int K=deCode(Op);
        System.out.println(K);


        ChromosomeCode example1 = new ChromosomeCode();
        int x;
        System.out.println("\nTest of public class");
        x = example1.encode(k);
        System.out.println(x);
        x = example1.decode(Op);
        System.out.println(x);


        ChromosomeCode example2 = new ChromosomeCode();
        int y;
        System.out.println("\nTest of inner class");
        y = example2.obj2.enCode(k);
        System.out.println(y);
        y = example2.obj2.deCode(Op);
        System.out.println(y);


        ChromosomeCode.GrayCode_nested example3 = new ChromosomeCode.GrayCode_nested();
        int z;
        System.out.println("\nTest of nested class");
        z = example3.enCode(k);
        System.out.println(z);
        z = example3.deCode(Op);
        System.out.println(z);

        ChromosomeCode example4 = new ChromosomeCode(){
            @Override
            public int encode(int n)
            {
                System.out.println("Anonymous class is working");
                return n^(n >> 1);
            }
        };
        int u ;
        System.out.println("\nTest of anon class");
        u = example4.encode(k);
        System.out.println(u);
        u = example4.decode(Op);
        System.out.println(u);


        System.out.println("\nComparing objects of one class");
        ChromosomeCode ex1,ex2;
        ex1 = new ChromosomeCode();
        ex2 = ex1;
        boolean state = ( ex1 == ex2 );
        System.out.println(state);
        state = ex1.equals(ex2);
        System.out.println(state);
    }


    public static void fac(int N){
        if(N>0){
            int O= factorial(N);
            System.out.println(O);

        }else{
            System.out.println("ERROR");
        }
    }
    public static int factorial(int N){
        if (N== 1) return 1;
        return N*factorial(N-1);
    }


    public static int enCode(int N){
        return N ^ (N >> 1);
    }
    public static int deCode(int N){
        int B;
        for(B=0; N!=0 ;N>>=1){
            B^=N;
        }
        return B;
    }

}
