package stack.controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
import stack.model.Customer;

public class StackController 
{
	private Queue<Customer> nameOfQueue;
	private Stack<String> nameOfStack;
	
	public StackController()
	{
		nameOfQueue = new LinkedList<Customer>();
		nameOfStack = new Stack<String>();
	}
	public  void start()
	{
		Customer Billy = new Customer("Billy");
		Customer Kate = new Customer("Kate");
		Customer Omar = new Customer("Omar");
		nameOfQueue.add(Billy);
		nameOfQueue.add(Kate);
		nameOfQueue.add(Omar);
		nameOfQueue.remove(Billy);
		
		System.out.println(nameOfQueue.peek());
		
		String string1 = "String";
		String string2 = "String1";
		
		nameOfStack.push(string1);
		nameOfStack.push(string2);
		
		nameOfStack.pop();
		
		System.out.println(nameOfStack.peek());
		
	}
}
