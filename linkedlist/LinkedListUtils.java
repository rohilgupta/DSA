package linkedlist;

public class LinkedListUtils {
  class Node{
	  private int data;
	  private Node next;
	  public Node(int data)
	  {
		  this.next = null;
	  }
  }
    private static Node head;
    private static Node tail;
    private static int size = 0;
  public void AddFront(int data)
  {
	  Node newNode = new Node(data);
	  if(head == null)
	  {
		  head = tail = newNode;
		  size++;
		  return;
	  }
	  newNode.next = head;
	  head = newNode;
	  System.out.println(newNode.data);
	  size++;
  }
  public void AddLast(int data)
  {
	  Node newNode = new Node(data);
	  if(head == null)
	  {
		  head = tail = newNode;
		  size++;
		  return;
	  }
	  tail.next = newNode;
	  tail= newNode;
	  size++;
  }
  public int Remove()
  {
	    Node temp = head.next;
	     int counter = 0;
	  while(counter<size-2)
	  {
		  temp = temp.next;
		  counter++;
	  }
	  int numb = tail.data;
	  tail = temp;
	  temp.next = null;
	  size--;
	  return numb;
  }
  public int Find(int index)
  {
	  int numb = -1;
	  Node temp = head;
	     int counter = 0;
	  while(counter<size)
	  {
		  if(index==counter)
		  {
			  numb = temp.data;
		  }
		  temp = temp.next;
		  counter++;
	  }
	  return numb;
  }
  public boolean isSorted()
  {
	  int numb;
	  Node temp = head;
	     int counter = 1;
	  while(counter!=size-1)
	  {
		  if(temp.data>temp.next.data)
		  {
			  return false;
		  }
		  temp = temp.next;
		  counter++;
	  }
	  return true;
  }
  public void display()
  {
	  Node temp = head;
	     int counter = 0;
	  while(counter<size)
	  {
		  System.out.print(temp.data+" -> ");
		  temp = temp.next;
		  counter++;
	  }
	  System.out.print("null");
  }
  public int removeByIndex(int index)
  {
	  int numb;
	  Node temp = head;
	     int counter = 0;
	  if(index == 1)
	  {
		  int header = head.data; 
		  head = head.next;
		  return header;
	  }
	  while(counter<size)
	  {
		  if(index-1==counter)
		  {
			  break;
		  }
		  temp = temp.next;
		  counter++;
	  }
	  numb = temp.next.data;
	  temp.next = temp.next.next;
	  return numb;
  }
}
