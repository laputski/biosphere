package laba2;

public class GrayCode implements IChromosomeCode
{
    public int incode(int n)
    {
        return n^(n>>1);
    }

    public int decode(int n)
    {
        int bin=0;
        for(; n!=0; n>>=1)
        {
            bin^=n;
        }
        return bin;
    }
}