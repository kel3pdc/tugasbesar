/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rkppl.tugasbesar;

/**
 *
 * @author ASUS
 * 
 * 
 */


import rkppl.tugasbesar.MulAndDivInterface;

public class B implements MulAndDivInterface {
	
	public B(){
		System.out.println("Ctor B");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "toString B";
	}

	@Override
	public double mul(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1*n2;
	}

	@Override
	public double div(double n1, double n2) {
		// TODO Auto-generated method stub
		if (n1 != 1) {
			return n1+n2;
		} else {
			return 0;
		}
	}
}
