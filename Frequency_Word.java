import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class Frequency_Word {
 
        public static void main(String[] args) throws IOException{
                 Map<String, Integer> wordMap = new HashMap<>();
 
                 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\Desktop\\alice_in_wonderland.txt"));
                 String line;
                 while ((line = br.readLine()) != null) {
                         line = line.toLowerCase();
                         String[] words =line.split(" ");
                         
                         for (String word : words) {
                                 word = word.replaceAll("[^a-zA-Z0-9]", "");  
                                 if (wordMap.containsKey(word)) {
                                         wordMap.put(word, (wordMap.get(word) + 1)); }
                                 else {
                                         wordMap.put(word, 1); }
                                 
                               
                         }
                 }
 
                         
 
                 if(!wordMap.isEmpty()) {
                 Iterator it = wordMap.entrySet().iterator();
                 while(it.hasNext()) {
                    Map.Entry obj =(Entry)it.next();
                    System.out.println(obj.getKey()+"="+obj.getValue());
                 }
                       
 
                 
        }
        }
        }