package com.iterator.main;

import com.iterator.implementation.Iterator;
import com.iterator.mousePad.MousePadDetailsImpl;
import com.iterator.mousePad.MousePadTypeImpl;

public class IteratorTest {

	public static void main(String[] args) {
		MousePadTypeImpl mpci = new MousePadTypeImpl();
		MousePadDetailsImpl mpdi = new MousePadDetailsImpl();
		Iterator i = mpci.getIterator();
		Iterator j = mpdi.createIterator();
		while (i.hasNext()) {
			Object object = i.next();
			String type =(String)object;
			while (j.hasNext()) {
				Object obj = j.next();
				String desc =(String)obj;
				System.out.println("MousePad : "+type +" : "+desc);
				break;
			}
		}
	}
}