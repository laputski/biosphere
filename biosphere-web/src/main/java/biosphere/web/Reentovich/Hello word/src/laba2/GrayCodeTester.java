package laba2;

public class GrayCodeTester {

    static class TestNestedChromosomeCode {
        public int incode(int n) {
            return n ^ (n >> 1);
        }

        public int decode(int n) {
            int bin = 0;
            for (; n != 0; n >>= 1) {
                bin ^= n;
            }
            return bin;
        }
    }

    public static void main(String[] args) {
        ChromosomeCode TestAnonymousChromosomeCode = new ChromosomeCode() {
            public int incode(int n) {
                return n ^ (n >> 1);
            }

            public int decode(int n) {
                int bin = 0;
                for (; n != 0; n >>= 1) {
                    bin ^= n;
                }
                return bin;
            }
        };

//        class TestInnerChromosomeCode {
//            public int incode(int n) {
//                return n ^ (n >> 1);
//            }
//
//            public int decode(int n) {
//                int bin = 0;
//                for (; n != 0; n >>= 1) {
//                    bin ^= n;
//                }
//                return bin;
//            }
//        }

        int n = 4;

//          ChromosomeCode a = new ChromosomeCode();
//        TestInnerChromosomeCode b = new TestInnerChromosomeCode();
//        TestNestedChromosomeCode c = new TestNestedChromosomeCode();
//
//        System.out.println(TestAnonymousChromosomeCode.incode(3));
//        System.out.println(b.incode(3));
//        System.out.println(c.incode(3));
//
//        System.out.println(a.equals(a));
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
//        System.out.println(a.equals(TestAnonymousChromosomeCode));

//        for(int i=0; i<Math.pow(2,n); i++)
//        {
//            for(int j=n-1; j>0; j--)
//            {
//                if(i< Math.pow(2, j))
//                    System.out.print('0');
//            }
//            System.out.println(Integer.toString(a.incode(i), 2));
//        }
//
//        for(int i=0; i<Math.pow(2,n); i++)
//        {
//            System.out.println(a.decode(a.incode(i)));
//        }

    }

    static int factorial(int n) {
        return n == 1 ? 1 : n * factorial(n - 1);
    }
}
