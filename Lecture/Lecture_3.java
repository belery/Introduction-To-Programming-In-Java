import java.util.Random;


public class Lecture_3 {

    // public static void main (String[] arguemnts){
    //     System.out.println(arguemnts.length);
    //     System.out.println(arguemnts[0]);
    //     System.out.println(arguemnts[1]);
    // }

    // public static void main (String[] arguments){
    //     int [] value = new int [5];

    //     // for (int i = 0; i < value.length; i++){
    //     //     value[i] = i;
    //     //     int y = value[i] * value[i];
    //     //     System.out.println(y);
    //     // }

    //     // int i = 0;
    //     // while (i < value.length) {
    //     //     value[i] = i;
    //     //     int y = value[i] * value[i];
    //     //     System.out.println(y);
    //     //     i++;
    //     // }


    // }


    public static void main (String[] arg){
        Random random = new Random();
        int [] scord = new int [20];
        for (int i=0; i<scord.length; i++){
            int min = 20;
            int max = 60;
            scord[i] = random.nextInt(max - min) + min;
            System.out.print(scord[i]+" ");
        }
            System.out.println("");
            int firstScord = getMinIndex(scord);
            System.out.println("the first is " + firstScord + "min");
            int secScord = getSecIndex(scord);
            System.out.println("the second is " + secScord + "min");
    }

    static int getMinIndex (int[] values){

        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i=0; i<values.length; i++){
            if (values[i] < minValue) {
                minValue = values[i];
                minIndex = i;
            }
        }
        return minValue;
    }

    static int getSecIndex (int[] value){
        int secMinValue = Integer.MAX_VALUE;
        int minValue = getMinIndex(value);
        for (int i=0; i<value.length; i++){
            if (value[i] == minValue){
                continue;
            }
            if (value[i] < secMinValue) {
                secMinValue = value[i];
            }
        }
        return secMinValue;
    }
}
