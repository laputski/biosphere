package com.company;

/**
 * Created by youhy
 */
public class ChromosomeCode extends GrayCode implements IChromosomeCode {
    @Override
    public int decode(int gray){
        int bin;
        for (bin = 0; gray!=0; gray >>= 1) {
            bin ^= gray;
        }
        return Integer.parseInt(Integer.toString(gray),10);
    }

    @Override
    public int encode(int inLine) {
        int gray=Integer.parseInt(new String(String.valueOf(inLine)),2);
        return gray ^ (gray >> 1);
    }

}
