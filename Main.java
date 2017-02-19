import java.io.File;
import java.io.IOException;

/**
 * Created by Greg on 19.02.2017.
 */
public class Main {
    public static void main(String args[]){
        try {
            Translate tr = new Translate(new File("dictionary.txt"));
            System.out.println(tr.go("Cat Dog asd cat"));
        }catch (IOException e){

        }

    }
}
