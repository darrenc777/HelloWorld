import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("What's your name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hello, " + name + "!");
        File f = new File("class.txt");
        s = new Scanner(f);
        String course = s.nextLine();
        System.out.println("Welcoime to " + course + "!");
    }
}
