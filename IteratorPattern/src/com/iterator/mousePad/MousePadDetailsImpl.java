package com.iterator.mousePad;

import java.util.ArrayList;
import java.util.List;

import com.iterator.implementation.Iterator;
import com.iterator.implementation.Container;

public class MousePadDetailsImpl implements Container {
	List<String> MousePadDesc = new ArrayList();
	
	public MousePadDetailsImpl() {
		MousePadDesc.add("with lively feel");
		MousePadDesc.add("with Modernistic Design");
		MousePadDesc.add("which provides resting spot for your wrist");
	}
	
	public Iterator createIterator() {
		MousePadDetailsIterator Iter = new MousePadDetailsIterator();
		return Iter;
	}
	
	private class MousePadDetailsIterator implements Iterator{

		int i = 0;
		
		@Override
		public boolean hasNext() {
			if(MousePadDesc.size()>0) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				String mousePadDesc = MousePadDesc.get(i);
				MousePadDesc.remove(i);
				return mousePadDesc;
			}
			return null;
		}
	}
}