import java.util.Scanner;
import java.util.PriorityQueue;

public class To_Do_List {

	public static void main(String[] args) {
		
		int n,i;
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Task> pqueue = new PriorityQueue<Task>();
		
		System.out.println("No. of tasks: ");
		n = sc.nextInt();
		for(i=0;i<n;i++) {
			pqueue.add(new Task(sc));
		}
		while(!pqueue.isEmpty()) {
			pqueue.remove();
		}
		
	}

	static class Task {
		
		int priority;
		String description;
		
		public Task(Scanner sc) {
			System.out.println("\nNEW TASK\n");
			System.out.println("Enter priority no.(1-9): ");
		    this.priority = sc.nextInt();
			System.out.println("Enter task description: ");
			this.description = sc.next();
		}
	}
	
}