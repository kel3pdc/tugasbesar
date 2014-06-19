/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rkppl.tugasbesar;

/**
 *
 * @author ASUS
 */

import java.util.List;
import java.util.ArrayList;

import rkppl.tugasbesar.C;
import rkppl.tugasbesar.D;

public class MainApp {
   
public static void main(String[] arr) {
	C cindou = new C();
	D lua = new D();
		
		
	cindou.setN1(7);
	cindou.setN2(8);
		
                
        cindou.sub();
	cindou.add();
	cindou.mul();
	cindou.div();
                
                
	System.out.println(cindou.sqrt(10));
                
	System.out.println(cindou.mod(6, 7));
		
	System.out.println(lua.div(7, 5));
                
	System.out.println(lua.mul(9, 9));
                
	System.out.println(lua.pow(3, 3));
		
		
}

}
