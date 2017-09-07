/**
 * 
 */
package com.madhu.LinkedList;

/**
 * @author Madhu
 *
 */
public class Node implements Comparable <Integer>{
	private Integer value;
	private Node nextRef;
	
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}

	public Node getNextRef() {
		return nextRef;
	}
	public void setNextRef(Node nextRef) {
		this.nextRef = nextRef;
	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		if (o==this.value)
			return 0;
		else
			return 1;
	}

}
