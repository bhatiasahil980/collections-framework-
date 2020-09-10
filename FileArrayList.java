import java.util.*;
import java.io.*;
 
public class FileArrayList {
 
        public static void main(String[] args) throws IOException {
                
                File text = new File("C:\\Users\\DELL\\Desktop\\text.txt");
                Scanner b1 = new Scanner(text);
                ArrayList<String> list1 = new ArrayList<>();
                while (b1.hasNext()) {
                        String word = b1.next();
                        word = word.replaceAll("[^a-zA-Z0-9]", "");
                        list1.add(word);
                }
                System.out.println("Display list:");
                ListIterator<String> itr = list1.listIterator();
                while (itr.hasNext()) {
                        System.out.println(itr.next());
                }
 
                System.out.println("Reverse list:");
                while (itr.hasPrevious()) {
                        System.out.println(itr.previous());
                }
               
                System.out.println("Displaying words ending with s ");
                while (itr.hasNext()) {
                        String word = itr.next();
                        if (word.endsWith("s") == true) {
                                System.out.println(word);
                        }
                }
               
               
                ListIterator<String> itr2 = list1.listIterator();
                while (itr2.hasNext()) {
                        String word = itr2.next();
                        if (word.endsWith("s") == true) {
                                itr2.remove();
                        }
                }
                System.out.println("Removing words ending with s ");
                ListIterator<String> itr1 = list1.listIterator();
                while (itr1.hasNext()) {
                        System.out.println(itr1.next());
                }
 
        }
}