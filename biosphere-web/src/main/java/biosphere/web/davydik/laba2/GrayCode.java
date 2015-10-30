package biosphere.web.davydik.laba2;

/**
 * Created by daniildavydik on 31.10.15.
 */
public class GrayCode {
    public  int enCode(int N){
        return N ^ (N >> 1);
    }
    public  int deCode(int N){
        int M;
        for(M=0; N!=0 ;N>>=1){
            M^=N;
        }
        return M;
    }
}
