/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rkppl.tugasbesar;

public class C extends Math{
	private double n1;
	private double n2;
	
	public C() {
		System.out.println("Ctor C");
	}
	
	public void add(){
		A a = new A();
		System.out.println(a.add((int)getN1(),(int)getN2()));
	}

	public void sub(){
		A a = new A();
		System.out.println(a.sub((int)getN1(),(int)getN2()));
	}
	
	public void mul(){
		B b = new B();
		System.out.println(b.mul(getN1(), getN2()));
	}
	
	public void div(){
		B b = new B();
		System.out.println(b.div(getN1(), getN2()));
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "toString C";
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}
}

