package biosphere.web.Vorobey.lab2;

/**
 * Created by VD on 25.09.2015.
 */
public class ChromosomeCode implements IChromosomeCode {

    //Variant A: public class
    public GrayCode ob1 = new GrayCode();

    @Override
    public int encode(int n) {
        return ob1.encode(n);
    }

    @Override
         public int decode(int n) {
        return ob1.decode(n);
    }

    @Override
    public int getGrayCode(int n) {
        return ob1.getGrayCode(n);
    }





    //Variant B: inner class


    class GrayCode_inner extends GrayCode{
    }

    public GrayCode_inner obj2 = new GrayCode_inner();


    //Variant C: nested class

    static class GrayCode_nested extends GrayCode{
    }


}
