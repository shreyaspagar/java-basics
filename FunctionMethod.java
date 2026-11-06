//Syntax
// public class FunctionMethod {
//     public static void printHelloWorld() {
//      System.out.println("Hello World");
//      System.out.println("Hello World");
//      System.out.println("Hello World");
//      return;
//     }
// public static void main(String args[]) {
//         printHelloWorld(); //Function Call
//     } 
// }

//Syntax With Parameter
// import java.util.*;
// public class FunctionMethod {
//     public static void printHelloWorld() {
//      System.out.println("Hello World");
//      System.out.println("Hello World");
//      System.out.println("Hello World");
//      return;
//     }

//     public static int calculateSum(int num1, int num2) { //parameters or formal parameters
//         // Scanner sc = new Scanner(System.in);
//         // int a = sc.nextInt();
//         // int b = sc.nextInt();
//         int sum = num1 + num2;
//         return sum;
//         // System.out.println("sum is : " + sum);
//     }
// public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();    
//     int sum = calculateSum(a, b); //arguments or actual parameters
//     System.out.println("sum is : " + sum);
//     } 
// }

//Call By Value
// public class FunctionMethod {
//     public static void printHelloWorld() {
//      System.out.println("Hello World");
//      System.out.println("Hello World");
//      System.out.println("Hello World");
//      return;
//     }

// public static int calculateSum(int num1, int num2) { //parameters or formal parameters
//         int sum = num1 + num2;
//         return sum;
//     }

//     public static void swap(int a, int b) {
//         //swap
//     int temp = a;
//     a = b;
//     b = temp;
    
//     // System.out.println("a = " + a);
//     // System.out.println("b = " + b);
//     }
    
// public static void  main(String args[]) {
//     //swap - values exchange
//     int a = 5;
//     int b = 10;
//     swap(a, b);
//     System.out.println("a = " + a);
//     System.out.println("b = " + b);
//     }    
// }

//Product Of a & b
// public class FunctionMethod {
//     public static int multiply(int a, int b) {
//         int product  = a * b;
//         return product;
//     }

//     public static void main(String[] args) {
//         int a = 3;
//         int b = 5;
//         int prod = multiply(a, b);
//         System.out.println("a * b = " + prod);
//         prod = multiply(10, 20);
        // System.out.println("a * b = " + prod);
//     }
// }

//Factroial Of A Number
// public class FunctionMethod {
//     public static int factroial(int n) {
//         int f = 1;

//         for(int i=1; i<=n; i++) {
//             f = f * i;
//         }

//         return f;
//     }

//     public static void main(String[] args) {
//         System.out.println(factroial(7));
//     }
// }

//Binomial Coefficient
// public class FunctionMethod {
//     public static int factroial(int n) {
//         int f = 1;

//         for(int i=1; i<=n; i++) {
//             f = f * i;
//         }

//         return f; //Factorial Of n
//     }

//     public static int binCoeff(int n, int r) {
//         int fact_n = factroial(n);
//         int fact_r = factroial(r);
//         int fact_nmr = factroial(n-r);

//         int binCoeff = fact_n / (fact_r * fact_nmr);
//         return binCoeff;
//     }

//     public static void main(String[] args) {
//         System.out.println(binCoeff(5, 2));
//     }
// }

//Function Overloading - Cal Sum Of 2 nums Parameters
// public class FunctionMethod {
//     public static int sum(int a, int b) {
//         return a + b;
//     }
    
//     //Func To Cal Sum Of 3 Nums
//     public static int sum(int a, int b, int c) {
//         return a + b +  c; 
//     }

//     public static void main(String args[]) {
//         System.out.println(sum(3,5));
//         System.out.println(sum(4,8,9));
//     } 
//     }

//Function Overloading - To Cal Int Sum
// public class FunctionMethod {
//     //func to cal int sum
//     public static int sum(int a, int b) {
//         return a+b;
//     }

//     //func to cal float sum
//     public static float sum(float a, float b) {
//         return a+b;
//     }

//     public static void main(String args[]) {
//         System.out.println(sum(3,5));
//         System.out.println(sum(5.2f, 4.8f));
//     }
// }    

//Prime or Not
// public class FunctionMethod {
//     //only for n>=2
//     public static boolean isPrime(int n) {
//         //corner cases
//         //2
//         if(n == 2) {
//             return true;
//         }
//         for(int i=2; i<=n-1; i++) {
//             if(n % i == 0) {//completely dividing
//                 return false;
//             }
//         }

//         return true;
//     }
//     public static void main(String args[]) {
//         System.out.println(isPrime(2));
//     }

// } 

//Optimized Approach 
// public class FunctionMethod {
//     public static boolean isPrime(int n) {
//         if(n == 2) {
//             return true;
//         }
//         for(int i=2; i<=Math.sqrt(n); i++) {
//             if(n %  i == 0) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String args[]) {
//         System.out.println(isPrime(4));
//     }
// }

//Prime In Range
// public class FunctionMethod {
//     public static void primesInRange(int n) {
//         for(int i=2; i<=n; i++) {
//             if(isPrime(i)) {  //true
//                System.out.print(i+" ");
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         primesInRange(16); //2 to 20
//     } 
// }

//Binary To Decimal
// public  class FunctionMethod {
//     public static void binToDec(int binNum) {
//        int myNum = binNum;
//        int pow = 0;
//        int decNum = 0;

//        while(binNum > 0) {
//         int lastDigit = binNum % 10;
//         decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

//          pow++;
//          binNum = binNum / 10;
//        }

//          System.out.println("decimal of " + myNum +" = " + decNum);
//        }

// public static void main(String args[]) {
//         binToDec(100);
//        }
//     }

//Decimal To Binary
public class FunctionMethod {
    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }

        System.out.println("binary form of " + myNum + " = "+ binNum);
    }
     
    // public static void printS() {
    //     int s = 45;
    // }
    public static void main(String args[]) {
        //Main Function   
        // int s = 45;
        // System.out.println(s);
        // decToBin(7);
        // int p = 10; //Function Scope
        // {
        //     int s = 45;
        //     System.out.println(p);
        // }
        // System.out.println(s);
        // System.out.println(p);
        for(int i=1; i<=5; i++) {
            // System.out.println(i);
        }
        int i=4;
        System.out.println(i);
    }
}
    


