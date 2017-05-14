

public class ArrayDeBits {

	private  boolean [] bits;

	public ArrayDeBits(int n) {
		bits = new boolean[n];
	}
	
	public boolean [] getBits() {
		return bits;
	}

	public void setBit(int n, boolean value) {
		this.bits[n] = value;
	}
	
	public ArrayDeBits or(ArrayDeBits a) throws Exception{
		if(a.getBits().length != bits.length)
			throw new Exception("tamanhos diferentes");
		ArrayDeBits r = new ArrayDeBits(bits.length);
		for(int i = 0; i < bits.length; i++)
			r.setBit(i, bits[i] || a.getBits()[i]);
		return r;
	}
	
	//0100
	//1110
	//or
	//1110


	}
	
