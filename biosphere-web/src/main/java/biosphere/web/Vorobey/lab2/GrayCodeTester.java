package biosphere.web.Vorobey.lab2;

/**
 * Created by VD on 25.09.2015.
 */

public class GrayCodeTester {
    public static void main_LB2_VorobeyV(String[] args) {

        System.out.println(factorial(5));
        System.out.println(GrayCode(14));
        System.out.println(myencode(14));
        System.out.println(mydecode(4));


        ChromosomeCode example1 = new ChromosomeCode();
        int x = 0;
        System.out.println("\nTest of public class");
        x = example1.encode(14);
        System.out.println(x);
        x = example1.decode(4);
        System.out.println(x);


        ChromosomeCode example2 = new ChromosomeCode();
        int y = 0;
        System.out.println("\nTest of inner class");
        y = example2.obj2.encode(14);
        System.out.println(y);
        y = example2.obj2.decode(4);
        System.out.println(y);


        ChromosomeCode.GrayCode_nested example3 = new ChromosomeCode.GrayCode_nested();
        int z = 0;
        System.out.println("\nTest of nested class");
        z = example3.encode(14);
        System.out.println(z);
        z = example3.decode(4);
        System.out.println(z);

        ChromosomeCode example4 = new ChromosomeCode(){
            @Override
            public int getGrayCode(int n)
            {
                System.out.println("Anonymous class method works");
                return n^(n >> 1);
            }
        };
        int u = 0;
        System.out.println("\nTest of anonymous class");
        u = example4.encode(14);
        System.out.println(u);
        u = example4.decode(4);
        System.out.println(u);
        u = example4.getGrayCode(14);
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



    public static int factorial(int n) {
        if (n > 0) return factorial(n - 1) * n;
        return 1;
    }

    //Returns Gray number in decimal system
    //To see expected you must translate it into binary number
    public static int GrayCode(int n) {
        return n ^ (n >> 1);
    }


    //Returns binary number of a decimal one
    public static int toBinary(int n) {
        int []tempArray = new int[32];
        int position = 0;
        int result = 0;
        while( n!=0 ) {
            tempArray[position] = n % 2;
            position++;
            n = n/2;
        }
        for( int i = 0; i < position; i++) {
            result += tempArray[position-i-1] * Math.pow(10,position-i-1);
        }
        System.out.println("Here is your binary number");
        return result;
    }



    //Returns GrayCode of number n in binary form
    public static int myencode(int n) {
        return toBinary(GrayCode(n));
    }

    /*
    Input: decimal number
    (which is translated into binary automatically
    which is an original Gray code)
    Output: decimal number that matches a Gray code of original
    */
    public static int mydecode(int grayCode) {
        int bin;
        for( bin = 0; grayCode > 0; grayCode >>= 1 )
        {
            bin ^= grayCode;
        }
        return bin;
    }
}

/*
Table of corresponding
0    0000    0000
1    0001    0001
2    0010    0011
3    0011    0010
4    0100    0110
5    0101    0111
6    0110    0101
7    0111    0100
8    1000    1100
9    1001    1101
10   1010    1111
11   1011    1110
12   1100    1010
13   1101    1011
14   1110    1001
15   1111    1000


1-st row - decimal number
2-nd row - binary number
3-rd row - Gray code
 */

/*
Copyright@Vorobey Vlad:)
*/
