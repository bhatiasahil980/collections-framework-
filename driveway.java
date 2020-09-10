import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class driveway {

			public static void main(String[] args) {
			
			Stack<Integer> driveway = new Stack<Integer>();
			Queue<Integer> street = new LinkedList<>();
			
			Scanner sc= new Scanner(System.in);
					
			System.out.println("Enter cars License plate number : ");
					
					
			for(int i = 1; i <= 10; i++){
						
					int input = sc.nextInt();
					driveway.push(input);
						
			}
					
			System.out.println("Enter the car's License plate number to be retrieve : ");
					
			int retrieve = sc.nextInt();
					
			while(driveway.peek() != retrieve){
				
				street.add(driveway.peek());
				driveway.pop();
				
			}
			
			driveway.pop();
			
			System.out.println();
			System.out.println(" Removed status ");
			System.out.println(street);
			System.out.println(driveway);
			
			
			
			while(!street.isEmpty()) {
				
				driveway.push(street.peek());
				street.remove(street.peek());
			}
			
			System.out.println();
			System.out.println(" Final status ");
			System.out.println(street);
			System.out.println(driveway);
				
			      

		}

	}