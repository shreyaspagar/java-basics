//Question 2
// public class ZoomFunctionMethod {
//     static boolean isEven(int N) {
//         if(N % 2 == 0) {
//             return true;
//         }
//         else {
//             return false;
//         }
//     }
//      public static void main(String[] args) {
//          boolean result = isEven(15);
//          System.out.println(result);
//      }
// }

//Question 3
// import java.util.*;
// public class ZoomFunctionMethod {
//     static boolean isPalindrome(int N) {
//         int temp = N; //store original number
//         int rev = 0;
        
//         while(N > 0) {
//             int digit = N % 10;
//             rev = rev * 10 + digit;
//             N = N / 10; //last digit is removed
//         }
//         if(temp == rev) {
//             return true;
//         }
//         else {
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         boolean result1 = isPalindrome(125);
//         System.out.println("125 :" + result1);

//         boolean result2 = isPalindrome(13431);
//         System.out.println(result2);
//     }
// }    

//Question 4
// public class ZoomFunctionMethod {
//     static int sumOfDigits(int N) {
//         int sum=0;

//         while(N > 0) {
//             int digit = N % 10;
//             sum = sum + digit;
//             N = N / 10;
//         }
//         return sum;
//     }    
         
//     public static void main(String[] args) {
//         int result1 = sumOfDigits(135);
//         System.out.println("135 sum of digits : " +  result1);

//         int result2 = sumOfDigits(27);
//         System.out.println("279 sum of digits : " + result2);

//     }
// }

//Binary To decimal
public class ZoomFunctinMethod {
    static int binaryToDecimal(int N) {
        int mul=1;
        int sum=0;
        while(N > 0) {
            int digit = N % 10;
            sum = sum + digit * mul;
            N = N / 10;
            mul = mul * 2;
        }
        return sum;
    }
    public static void main(String[] args) {
        int result1 = binaryToDecimal(101);
        System.out.println("101 :" + result1);
        int result2 = binaryToDecimal(111);
        System.out.println("111 :" + result2);
        int result3 = binaryToDecimal(1000);
        System.out.println("1000 :" + result3);
    }
}



