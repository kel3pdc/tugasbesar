/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rkppl.tugasbesar;

/**
 *
 * @author ASUS
 */

import rkppl.tugasbesar.AddAndSubInterface;

public class A implements AddAndSubInterface{

	public A() {
		System.out.println("Ctor A");
	}
	
	@Override
	public String toString() {
		return "toString A";
	}

	@Override
	public int add(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}

	@Override
	public int sub(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}
}
