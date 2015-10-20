package biosphere.web.paseishvili;

/**
 * Created by UNBREAKING on 25.09.2015.
 */
import java.util.Scanner;

public class GrayCodeTester {
    public static void main_(String [] args){
        int P=1;
        int k;
        Scanner in=new Scanner(System.in);
        System.out.println("this is test factorial program");
        System.out.println("Write down the number");
        k= in.nextInt();
        if(k>0){
        for(int i=1;i<=k;i++)
            P=P*i;
            System.out.println("factorial of your number is:");
            System.out.println(P);
        }else{
            System.out.println("ERROR");
        }

    }
}
