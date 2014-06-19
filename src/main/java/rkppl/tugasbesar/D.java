/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rkppl.tugasbesar;

/**
 *
 * @author ASUS
 */
import rkppl.tugasbesar.PowInterface;

public class D implements PowInterface{
	
	public D(){
		System.out.println("Ctor D");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "toString D";
	}

		public double mul(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1+n2;
                
	}

		public double div(double n1, double n2) {
		// TODO Auto-generated method stub
		if (n1 != 0) {
			return n1+n2;
		} else 
                {
			return 0;
		}
	}

	
	public double pow(double n1, double n2) {
		// TODO Auto-generated method stub
		return java.lang.Math.pow(n1, n2);
	}
}

