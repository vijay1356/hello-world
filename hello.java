import java.util.*;
public class hello
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");    
        String name = sc.next();
        System.out.print("hello ");
        System.out.println(name);
        sc.close();
    }
}