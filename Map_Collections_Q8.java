import java.util.*;
import java.util.Map.Entry;
public class Map_Collections_Q8 {
        public static void main(String[] args) {
 
                TreeMap<String, String> students = new TreeMap<String, String>();
                int choice;
                Scanner b1 = new Scanner(System.in);
                do {
                        System.out.println("\n **** STUDENT RECORD **** \n");
                        System.out.println(
                                        " 1 - Add Student \n 2 - Remove Student \n 3 - Modify Student \n 4 - Print Students \n 5 - Exit \n");
                        System.out.print("\n Your Option: ");
                        choice = b1.nextInt();
 
                        switch (choice) {
                        case 1:
                                AddStudent(students);
                                break;
                        case 2:
                                removeStudent(students);
                                break;
                        case 3:
                                ModifyStudent(students);
                                break;
                        case 4:
                                printStudent(students);
                                break;
                        case 5:
                                return;
                        default:
                                System.out.println("\n Invalid  \n");
                                break;
                        }
 
                } while (choice != 5);
        }
 
        public static void AddStudent(TreeMap<String, String> students) {
                String name, grade;
                Scanner b1 = new Scanner(System.in);
 
                System.out.print("\n  Student Name: ");
                name = b1.nextLine();
 
                System.out.print("\n  Student Grade: ");
                grade = b1.nextLine();
 
                students.put(name, grade);
                System.out.println("\n Student added.... \n");
        }
 
        public static void removeStudent(TreeMap<String, String> students) {
                String name;
                Scanner b1 = new Scanner(System.in);
 
                System.out.print("\n Enter Student Name: ");
                name = b1.nextLine();
                if (students.containsKey(name)) {
                        students.remove(name);
                        System.out.println("\n Student removed ...... \n");
                } else {
                        System.out.println("\n  given name does not exist... \n");
                }
        }
 
        public static void ModifyStudent(TreeMap<String, String> students) {
                String name, grade;
                Scanner b1 = new Scanner(System.in);
 
                System.out.print("\n Enter Student Name: ");
                name = b1.nextLine();
 
                if (students.containsKey(name)) {
 
                        System.out.print("\n Enter Student's New Grade: ");
                        grade = b1.nextLine();
                        System.out.println("\n Student modified .... \n");
                        students.put(name, grade);
                } else {
                        System.out.println("\n  given name doesn't exist... \n");
                }
        }
 
        public static void printStudent(TreeMap<String, String> students) {
 
                Iterator<Entry<String, String>> itr = students.entrySet().iterator();
                while(itr.hasNext()) {
                        System.out.println(itr.next());
                }
                System.out.println();
        }
}