// public class Lectuen_2 {
//     public static void newLine(){
//         System.out.println("");
//     }

//     public static void threeLine(){
//         newLine();newLine();newLine();
//     }

//     public static void main (String[] arguments){
//         System.out.println("Line 1");
//         threeLine();
//         System.out.println("Line 2");
//     }
// }

// class Square {
//     public static void printSquare(int x){
//         System.out.println(x*x);
//     }
//     public static void main (String[] arguments) {
//         int value = 2;
//         printSquare(value);
//         printSquare(3);
//         printSquare(value*2);
//     }
// }

// class Square2 {
//     public static void printSquare(double x){
//         System.out.println(x*x);
//     }

//     public static void main(String[] arguments){
//         printSquare(5);
//     }
// }

// class Multiply{
//     public static void times (double a, double b){
//         System.out.println(a * b);
//     }

//     public static void main(String[] arguments){
//         times (2, 2);
//         times(3, 4);
//     }
// }

// class Square3{
//     public static double printSquare(double x){
//         return x*x;
//     }

//     public static void main (String[] arguments){
//         System.out.println(printSquare(5.0));
//         System.out.println(printSquare(2.0));
//     }
// }

// class SquareChange {
//     public static void printSquare(int x){
//         System.out.println("printsquare x =" + x);
//         x = x * x;
//         System.out.println("printSquare x= " + x);
//     }

//     public static void main (String[] arguments){
//         int x = 5;
//         System.out.println("main x = " + x);
//         printSquare(x);
//         System.out.println("main x = "  + x);
//     }
// }

// class Scope{
//     public static void main (String[] argumenets){
//         int x = 5;
//         int y = 0;
//         if (x==5){
//             x = 6;
//             y = 72;
//             System.out.println("x = " + x + "y = " + y);
//         }
//         System.out.println("x = " + x + " y = " + y);
//     }
// }


// public static void test(int x){
//     if (x > 5){
//         System.out.println(x + " is > 5");    
//     } else {
//         System.out.println(x + " is not > 5");
//     }
    
// }

// public static void main (String[] arguments){
//     test(6);
//     test(5);
//     test(4);
// }


public class Lectuen_2 {
    public static void pay (double time, double basePay){
        if (basePay > 8){
            System.out.println("you can't get so much pay");
        } else if (time > 60){
            System.out.println("you can't work so mach time");
        } else if (time > 40 && time < 60) {
            basePay = 40 * basePay + (time - 40) * basePay * 1.5 ;
            System.out.println("you can get " + basePay + "$");
        } else {
            basePay = time * basePay;
            System.out.println("you can get " + basePay + "$");
        }

    }

    public static void main (String[] arguemnts){
        pay (65, 7.8);
        pay (56, 8.4);
        pay (34, 7.8);
    }
}