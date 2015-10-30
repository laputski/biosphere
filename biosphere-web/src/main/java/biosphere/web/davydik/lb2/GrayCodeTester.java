package biosphere.web.davydik.lb2;
import java.util.Scanner;

/**
 * Created by daniildavydik on 30.10.15.
 */
public class GrayCodeTester {
    public static void main(String[] args) {
        int P=1;
        int k;
        Scanner in=new Scanner(System.in);
        System.out.println(" test factorial program");
        System.out.println("Write down the number");
        k= in.nextInt();
        int Op=enCode(k);
        System.out.println(Op);
        int K=deCode(Op);
        System.out.println(K);


        ChromosomeCode test1 = new ChromosomeCode();
        int x;
        System.out.println("\n public class");
        x = test1.encode(k);
        System.out.println(x);
        x = test1.decode(Op);
        System.out.println(x);


        ChromosomeCode test2 = new ChromosomeCode();
        int y;
        System.out.println("\ninner class");
        y = test2.object.enCode(k);
        System.out.println(y);
        y = test2.object.deCode(Op);
        System.out.println(y);


        ChromosomeCode.GrayCode_nested test3 = new ChromosomeCode.GrayCode_nested();
        int z;
        System.out.println("\nnested class");
        z = test3.enCode(k);
        System.out.println(z);
        z = test3.deCode(Op);
        System.out.println(z);

        ChromosomeCode test4 = new ChromosomeCode(){
            @Override
            public int encode(int n)
            {
                System.out.println("Anonymous class is working");
                return n^(n >> 1);
            }
        };
        int u ;
        System.out.println("\n anon class");
        u = test4.encode(k);
        System.out.println(u);
        u = test4.decode(Op);
        System.out.println(u);


        System.out.println("\nComparing objects of one class");
        ChromosomeCode obj1,obj2;
        obj1 = new ChromosomeCode();
        obj2 = obj1;
        boolean state = ( obj1 == obj2 );
        System.out.println(state);
        state = obj1.equals(obj2);
        System.out.println(state);
    }


    public static void fact(int N){
        if(N>0){
            int O= factorial(N);
            System.out.println(O);

        }else{
            System.out.println("error,N<0");
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
        int M;
        for(M=0; M!=0 ;N>>=1){
            M^=N;
        }
        return M;
    }
}