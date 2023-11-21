package tp6;
//import Math;

public class Mathematique  {
	
	static double f (double n, double x) throws ParametreNullException ,NegatifException{
		/*
		if(n==0) {
			throw new ArithmeticException ();
		}
		*/
		if(n==0) {
			throw new ParametreNullException("on ne peut pas diviser sur 0");
		}
		if(n<0) {
			throw new NegatifException();
		}
		
		return (Math.sqrt(x)/n); 
		
		
	}

}
