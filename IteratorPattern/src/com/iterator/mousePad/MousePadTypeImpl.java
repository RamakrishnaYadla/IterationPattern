package com.iterator.mousePad;

import com.iterator.implementation.Iterator;

public class MousePadTypeImpl implements MousePadCollection {

	String MousePadTypes[] = {"Pattern","Shape","WhistRest"};
	
	@Override
	public Iterator getIterator() {
		return new Iter();
	}
	
	private class Iter implements Iterator{

		int i = 0;
		
		@Override
		public boolean hasNext() {
			if(i<MousePadTypes.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return MousePadTypes[i++];
			}
			return null;
		}
	}
}