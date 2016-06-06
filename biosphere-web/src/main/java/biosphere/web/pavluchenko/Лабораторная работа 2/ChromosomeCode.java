import java.util.*;

public class ChromosomeCode implements IChromosomeCode{
	//a
    public GrayCode temp = new GrayCode();

    @Override
    public int encodeGray(int n) {
        return temp.encodeGray(n);
    }

    @Override
         public int decodeGray(int n) {
        return temp.decodeGray(n);
    }

   
    //b
    class GrayCodeInner extends GrayCode{
    }

    public GrayCodeInner test = new GrayCodeInner();


    //c

    static class GrayCodeNested extends GrayCode{
    }
    
    
    int varA;
	int varB;
	
	ChromosomeCode(int varA, int varB){
		this.varA = varA;
		this.varB = varB;
	}

	public ChromosomeCode() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + varA;
		result = prime * result + varB;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChromosomeCode other = (ChromosomeCode) obj;
		if (varA != other.varA)
			return false;
		if (varB != other.varB)
			return false;
		return true;
	}
}
