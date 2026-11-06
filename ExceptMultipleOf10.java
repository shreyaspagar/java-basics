import java.util.*;
public class ExceptMultipleOf10 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    do {
        System.out.print("Enter Your Number : ");
        int n  = sc.nextInt();

        if(n % 10 == 0) {
            continue;
        }

        System.out.println("number was : " + n);
    }   while(true);
    
}
}

