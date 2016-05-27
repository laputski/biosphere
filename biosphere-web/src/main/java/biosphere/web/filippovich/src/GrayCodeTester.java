/**
 * Created by Acer on 22.10.2015.
 */
public class GrayCodeTester {
    public int test(int n){
        return 1;

    }

    public static void main(String[] args) {
        int result;
        for (int i=11; i!=0;i=i-1)
            result=i*GrayCodeTester(i);
        sout(result);
    }
}

