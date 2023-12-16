package stackUtils;

import stackCustomException.stackException;
import stackInterfaces.StackInterface;

public class StackUtils implements StackInterface {
private int size;
private int top;
private int []arr;
public StackUtils(int size) {
	super();
	this.size = size;
	this.top = -1;
	this.arr = new int[size];
}
@Override
public void push(int data)throws stackException
{
	if(isFull())
	{
		throw new RuntimeException("Stack is Full");
	}
	if(isEmpty())
	{
	   top = 0;
	   arr[top] = data;
	   return ;
	}
	top++;
	arr[top] = data;
}
@Override
public int pop()throws stackException {
	int numb;
	if(isEmpty())
	{
		throw new RuntimeException("Stack is Empty");
	}		
	numb = arr[top];
	top--;
	return numb;
}
@Override
public int top()throws stackException
{
	return arr[top];
}
@Override
public int max()throws stackException
{
	if(isEmpty())
	{
		throw new RuntimeException("Stack is Empty");
	}
	int max = arr[0];
	for(int i = 1;i<top+1;i++)
	{
		if(max<arr[i])
		{
			max = arr[i];
		}
	}
	return max;
	
}
@Override
public boolean isEmpty() throws stackException
{
	return top == -1;
}
@Override
public boolean isFull()throws stackException
{
	return top == arr.length-1;
}
}
