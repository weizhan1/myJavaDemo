package algoJava;

public class comparable {

}

public interface Comparable {
	int compareTo(Object obj);
}

public static Comparable max(Comparable[] A){
	if (A.length == 0) return null;
	Comparable result;
	result = A[0];
	
	for (int i=1; i<A.length; i+=1)
		if (result.compareTo(A[i] < 0)) result = A[i];
	return result;
}

class IntSequence implements Comparable {
	private int[] myValues;
	private int myCount;
	
	public int get(int k) { return myValues[k]; }
	
	@Override
	public int compareTo(Object obj) {
		IntSequence x = (IntSequence) obj;
		for (int i=0; i<myCount && i<x.myCount; i+=1)
			if (myValues[i] < x.myValues[i])
				return -1;
			else if (myValues[i] > x.myValues[i])
				return 1;
		return myCount - x.myCount;
			
	}
}

public abstract class AbstractReader implements Reader {
	public abstract void close();
	public abstract int read(char[] buf, int off, int len);
	
	public int read(char[] buf) { return read(buf, 0, buf.length);
	public int read() { return (read(buf1)==-1?-1:buf1[0]); }
	prvate char[] buf1 = new char[1];
	}
}

public class StringReader extends AbstractReader {
	private String str;
	private int k;
	
	public StringReader(String str) { this.str=str; k=0; }
	public void close() {str=null;}
	public int read(char[] buf, int off, int len) {
		if (k==str.length()) return -1;
		len = Math.min(len, str.length()-k);
		str.getChars(k, k+len,  buf,  off);
		k+=len;
		return len;
	}
}
}