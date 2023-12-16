package stackTester;

import java.util.Scanner;

import stackUtils.StackUtils;

public class StackTesting {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			System.out.println("STACK");
			System.out.println("Enter the Size Of Stack");
			int size = sc.nextInt();
			StackUtils newSatck = new StackUtils(size);
			while(!exit)
			{
				System.out.println();
				System.out.println("Select Your Option From Below");
				System.out.println("1.Push\n2.Pop\n3.Top\n4.Max\n5.exit");
				try {
					switch(sc.nextInt())
					{
					case 1:
						System.out.println("Enter the Element in the Stack");
						newSatck.push(sc.nextInt());
						break;
					case 2:
						System.out.println("The Element Which Is ''Removed'' From The Stack");
						System.out.println(newSatck.pop());
						break;
					case 3:
						System.out.println("The Element  At ''Top'' Of The Stack");
						System.out.println(newSatck.top());
						break;
					case 4:
						System.out.println("The ''Max'' Element In The Stack");
						System.out.println(newSatck.max());
						break;
					case 5:
					    exit = true;
					    System.out.println("Thank You");
						break;
					}
				}catch(Exception e)
				{
					System.out.println("Error = > " + e);
				}
				
			}
			
		}

	}

}
