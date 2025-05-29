//创建一个baby的类
class Baby{
    //设置一些变量
    static int numBabiesMade = 0;
    String name = "admin";
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
    static void init(){
        System.out.println(numBabiesMade);
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
        Belery.poop();

    }

}