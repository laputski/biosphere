import java.util.*;

public class GrayCode implements IChromosomeCode{

	@Override
	public int encodeGray(int natural) {
		 return natural ^ natural >>> 1;
	}

	@Override
	public int decodeGray(int gray) {
		 int natural = 0;
	        while (gray != 0) {
	            natural ^= gray;
	            gray >>>= 1;
	        }
	        return natural;
	}

}
