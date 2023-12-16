package stackInterfaces;
import stackCustomException.stackException;
public interface StackInterface {
	public void push(int data)throws stackException;
	public int pop()throws stackException;
	public int top()throws stackException;
	public int max()throws stackException;
	public boolean isEmpty()throws stackException;
	public boolean isFull()throws stackException;
}
