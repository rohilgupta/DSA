package linkedlist;

import java.util.Scanner;

public class LinkedlistTester {

	public static void main(String[] args) {
	 LinkedListUtils ll = new LinkedListUtils();
     try(Scanner sc = new Scanner(System.in))
     {
    	 boolean exit = false;
    	 while(!false)
    	 {
    		 System.out.println("1.Add From Front\n2.Add From Last\n3.Remove\n4.Find By Index\n5.IsSorted\n6.Display\n7.Remove By Index\n10.exit");
    	 try {
    		 switch(sc.nextInt())
    		 {
    		 case 1:
    			 ll.AddFront(sc.nextInt());
    			 break;
    		 case 2:
    			 ll.AddLast(sc.nextInt());
    			 break;
    		 case 3:
    			 System.out.println(ll.Remove());
    			 break;
    		 case 4:
    			 ll.Find(sc.nextInt());
    			 break;
    		 case 5:
    			 System.out.println( ll.isSorted());
    			 break;
    		 case 6:
    			 ll.display();
    			 break;
    		 case 7:
    			 ll.removeByIndex(sc.nextInt());
    			 break;
    		 case 8:
    			 break;
    		 case 9:
    			 break;
    		 case 10:
    			 exit = true;
    			 break;
    	     default:
    	    	 System.out.println("Invalid Number");
    	    	 break;
    		 }
    	 }
    	 catch(Exception e)
    	 {
    		 System.out.println(e);
    	 }
       }
     }
	}

}
