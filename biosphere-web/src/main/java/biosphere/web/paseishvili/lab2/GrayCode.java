package biosphere.web.paseishvili.lab2;

/**
 * Created by UNBREAKING on 25.09.2015.
 */
public class GrayCode {

    public  int enCode(int N){
        return N ^ (N >> 1);
    }
    public  int deCode(int N){
        int B;
        for(B=0; N!=0 ;N>>=1){
            B^=N;
        }
        return B;
    }

}