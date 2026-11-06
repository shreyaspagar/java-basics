//Inverted Triangle
// public class ZoomPatternAdvanced {
//     public static void main(String[] args) {
//        int n=10;
//         for(int i=n; i>=1; i--) {
//             int stars = i;
//             int spaces = n-stars;
            
//         for(int j=1; j<=spaces; j++) {
//             System.out.print(" ");
//         }
//         for(int j=1; j<=stars; j++) {
//             System.out.print("*");
//         }
//             System.out.println("");  
//         }
//     }

// }

//Kite Pattern
// public class ZoomPatternAdvanced {
//      public static void main(String[] args) {
//         int n = 10;

//          for(int i=1; i<=n; i++) {
//             int stars = 2*i-1;
//             int spaces = n-i;

//             for(int j=1; j<=spaces; j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=stars; j++) {
//                 System.out.print("*");
//             }

//             System.out.println(" ");
//          }

//          for(int i=n; i>=1; i--) {
//             int stars = 2*i-1;
//             int spaces = n-i;

//             for(int j=1; j<=spaces; j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=stars; j++) {
//                 System.out.print("*");
//             }

//             System.out.println(" ");
//          }
//      }
// }

//Palindroming Pattern
// public class ZoomPatternAdvanced {
//     public static void main(String[] args) {
//         int n = 10;

//         for(int i=1; i<=n; i++) {
//             int spaces = n-i;
        
//         for(int j=1; j<=spaces; j++) {
//             System.out.print(" ");
//         }
//         for(int j=1; j<=i; j++) {
//             System.out.print(j);
//         }
//         for(int j=i-1; j>=1; j--) {
//             System.out.print(j);
//         }
        
//         System.out.println("");
//         }
//         for(int i=n; i>=1; i--) {
//             int spaces = n-i;
        
//         for(int j=1; j<=spaces; j++) {
//             System.out.print(" ");
//         }
//         for(int j=1; j<=i; j++) {
//             System.out.print(j);
//         }
//         for(int j=i-1; j>=1; j--) {
//             System.out.print(j);
//         }
        
//         System.out.println("");
//         }
//     }
// }

//R - Class Pattern
// public class ZoomPatternAdvanced {
//     public static void main(String[] args) {
//         int n = 5;

//         for(int i=n; i>=1; i--) {
//             int stars = 2*i;
//             int spaces = n-i;

//             for(int j=1; j<=spaces; j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=stars; j++) {
//                 System.out.print("*");
//             }

//             System.out.println(" ");
//          }
        
// for(int i=1; i<=n; i++) {
//             int stars = 2*i;
//             int spaces = n-i;

//             for(int j=1; j<=spaces; j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=stars; j++) {
//                 System.out.print("*");
//             }

//             System.out.println(" ");
//          }

//     }
// }

//Butterfly Pattern
// public class ZoomPatternAdvanced {
//     public static void main(String[] args) {
//     int n = 5;
//     for(int i=1; i<=n; i++) {
//         int stars = i;
//         int spaces  = 2*(n-i);

//         for(int j=1; j<=stars; j++) {
//             System.out.print("*");
//         }
//         for(int j=1; j<=spaces; j++) {
//             System.out.print("");
//         }
//         for(int j=1; j<=stars; j++) {
//             System.out.print("*");
//         }
//         System.out.println("");
//     }
//     for(int i=n; i>=1; i--) {
//         int stars = i;
//         int spaces  = 2*(n-i);

//         for(int j=1; j<=stars; j++) {
//             System.out.print("*");
//         }
//         for(int j=1; j<=spaces; j++) {
//             System.out.print("");
//         }
//         for(int j=1; j<=stars; j++) {
//             System.out.print("*");
//         }
//         System.out.println("");
//     }
// }
// }

//
public class ZoomPatternAdvanced {
    public static void main(String[] args) {
         int n = 4;
         int m = 5; 
        int count = 1;
        for(int i=1; i<=n; i++) {
            int spaces = n-i;

            for(int j=1; j<=spaces; j++) {
                System.out.print("");
            }
            for(int j=1; j<=spaces; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println("");
        }
    }
}