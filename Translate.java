import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Greg on 19.02.2017.
 */
public class Translate {
    private Map<String,String> dictionary;

    public Translate(File file) throws FileNotFoundException {
        dictionary = new HashMap<>();
        Scanner sc = new Scanner(new FileInputStream(file));
        while (sc.hasNext()){
            String key = sc.next();
            String val = sc.next();
            dictionary.put(key.toLowerCase(),val.toLowerCase());
        }
        for (String s : dictionary.keySet()){
            System.out.println(s+" "+dictionary.get(s));
        }
    }

    public Translate(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }
    public String go(String text){
        StringBuilder output = new StringBuilder();
        for (String word : text.split(" ")){
            if(dictionary.get(word.toLowerCase())!= null){
                output.append(dictionary.get(word.toLowerCase()) + " ");
            }else {
                output.append(word + " ");
            }
        }
        return output.toString();
    }
}
