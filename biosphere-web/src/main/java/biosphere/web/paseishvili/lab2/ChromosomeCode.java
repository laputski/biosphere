package biosphere.web.paseishvili.lab2;

/**
 * Created by UNBREAKING on 26.09.2015.
 */
public class ChromosomeCode implements IChromosomeCode {
    public GrayCode ex1 = new GrayCode();


    @Override
    public int encode(int n) {
        return ex1.enCode(n);
    }

    @Override
    public int decode(int n) {
        return ex1.deCode(n);
    }

    class GrayCode_inner extends GrayCode{
    }

    public GrayCode_inner obj2 = new GrayCode_inner();


    static class GrayCode_nested extends GrayCode{
    }
}
