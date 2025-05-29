//创建一个baby的类
    class Baby{
        //设置一些变量
        static int numBabiesMade = 0;
        String name;
        boolean isMale;
        double weight;
        double decibels;
        int numPoops = 0;
        Baby [] siblings;
        //设置一些方法
        Baby(String myname, boolean maleBaby, double myWeight){
            name = myname;
            isMale = maleBaby;
            weight = myWeight;
            numBabiesMade += 1;
        }
        void sayHi(){
            System.out.println("Hi my name is " + name);
        }
        void poop(){
            int numPoop = numPoops + 1;
            System.out.println("dear mother, "+ "I have pooped. Ready the diaper");
        }
        void eat(double incerasWeight){
            if (incerasWeight >= 0 &&
                incerasWeight < weight){
                    weight += incerasWeight;
            }
        }



    static void doSomething(int x, int [] ys, Baby b){
        x = 99;
        ys [0] = 99;
        b.name = "99";
    }
    public static void main(String[] arg){
        Baby Belery = new Baby("Belery",true, 83.5);
        Baby Eric = new Baby("Eric", true, 60);
        System.out.println(Baby.numBabiesMade);

        

        // int i = 0;
        // int[] j = {0};
        // Baby k = new Baby("5", true, 90);
        // doSomething(i, j, k);
        // System.out.println(i);
        // System.out.println(k);
        // System.out.println(j);
    }

}

