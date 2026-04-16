import java.util.*;
public class javaBascis {    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        boolean isPrime = true;

        if (n == 2) {
            isPrime = true;
        } else {
           
            for (int k = 2; k <=n; k++) { 
                if (n % k == 0) { 
                    isPrime = false;
                    break; 
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        sc.close();
    }
}
