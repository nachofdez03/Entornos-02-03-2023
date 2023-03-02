package operaciones;

public class OperacionesAritmeticas {

	private int a;
	private int b;
	
	
	
	public OperacionesAritmeticas(int a, int b) {
	
		this.a = a;
		this.b = b;
		
		
	}


	public int suma() {
		
		return a+b;
			
	}
	
	public int resta() {
		
		return a-b;
			
	}
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int producto() {
		
		return a*b;
			
	}
	
	public double division() throws Exception {
		
		if (b==0) {
			
			throw new Exception ("Division entre 0 NO");
			
		}else {
			return (double) (a/b);
		}
	
			
		
	}
	
	
	
	
	
	
	
	
	
}
