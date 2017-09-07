/**
 * 
 */
package com.madhu.LinkedList;

import java.util.LinkedList;

/**
 * @author Madhu
 *
 */
public class LinkedListImpl {
	private Node head;
	private Node tail;
	
	protected int size;
	
	public void add(Integer element){
		Node nd = new Node();
		nd.setValue(element);
		if(head==null){
			head=nd;
			tail=nd;
		}else{
			tail.setNextRef(nd);
			tail = nd;
		}
			
	}
	
	public void push(Integer element){
		Node nd = new Node();
		nd.setValue(element);
		if(head==null){
			head=nd;
		}else{
			nd.setNextRef(head);
			head=nd;
		}
		size++;
	}
	
	public Integer pop(){
		Node nd = new Node();
		if(size==0){
			System.out.println("Stack Empty");
		}else{
			Integer element = head.getValue();
			head=head.getNextRef();
			size--;
			return element;
		}
		return null;
	}
	
	public void printList(){
		Node nd = head;
		while(true){
			if(nd==null){
				break;
			}
			System.out.println(nd.getValue());
			nd=nd.getNextRef();
		}
	}
	
	public boolean isEmpty(){
		return head==null;
		
	}
	public void removeFirst(){
		Node nd = head;
		head=nd.getNextRef();
		if(head ==null)
			tail=null;
		
	}
	/**
	 * 
	 */
	public LinkedListImpl() {
		// TODO Auto-generated constructor stub
		size=0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImpl list = new LinkedListImpl();
		
		list.add(1);
		list.add(2);
		list.printList();
		list.removeFirst();
		list.removeFirst();
		list.printList();
		
		System.out.println("-----Stack Demo");
		list = new LinkedListImpl();
		list.push(10);
		list.push(20);
		
		
	

	}

}
