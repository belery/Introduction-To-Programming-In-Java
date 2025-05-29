// class Hello {
//     public static void main (String[] arguments){
//         String foo = "IAP 6.092";
//         boolean isJanuary = true;
//         System.out.println(foo);
//         foo = "Something else";
//         System.out.println(foo);
//     }
// }

// class DoMath {
//     public static void main(String[] arguments){
//         double score = 1.0 + 2.0 * 3.0;
//         System.out.println(score);
//         double copy = score;
//         copy = copy / 2;
//         System.out.println(score);
//         System.out.println(copy);
//     }
// }

// class StringConcatenation{
//     public static void main(String[] arguments){
//         String text = "hello" + "world";
//         System.out.println(text);
//         text = text + " number " + 5;
//         System.out.println(text);
        
//     }
// }

class Compute{
    public static void main (String[] arguments){
        double v = 5.0;
        double t = 10.0;
        double a = 10.0;
        double x = 20.0;
        double position = 0.5*a*t*t + v*t + x;
        System.out.println ("An object's position after " + t +" second is "+
        position + " m.");      
    }
}
