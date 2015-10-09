/**
 * Created by VD on 25.09.2015.
 */
public class GrayCode {

    //Returns Gray number in decimal system
    //To see expected you must translate it into binary number
    public int getGrayCode(int n) {
        return n ^ (n >> 1);
    }



    /*
    Input: decimal number
    (which is translated into binary automatically
    which is an original Gray code)
    Output: decimal number that matches a Gray code of original
    */
    public int decode(int grayCode) {
        int bin;
        for( bin = 0; grayCode > 0; grayCode >>= 1 )
        {
            bin ^= grayCode;
        }
        return bin;
    }


    //Returns binary number of a decimal one
    public int toBinary(int n) {
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
    public int encode(int n) {
        return toBinary(getGrayCode(n));
    }


}
