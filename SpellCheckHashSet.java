import java.util.*;
import java.io.*;
 
public class SpellCheckHashSet
{
    public static void main(String[] args) throws IOException
    {
        File text = new File("C:\\Users\\DELL\\Desktop\\dictionary.txt");
        Scanner sc = new Scanner(text);
 
        HashSet<String> dictionary =  new HashSet<String>();
 
        while( sc.hasNext() ) dictionary.add(sc.next());
        sc.close();
 
        sc = new Scanner( new File("C:\\Users\\DELL\\Desktop\\words.txt") );
        System.out.println("Printing words with wrong spellings:");
        System.out.println();
        while( sc.hasNextLine() )
        {
            String[] tokens = sc.nextLine().split("\\W");
            for(String token : tokens)
                if (token.length() > 1 && !dictionary.contains(token.toLowerCase()))
                    System.out.println(token);
        }
    }
}