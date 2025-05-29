public class Main {
    public static void main (String[] arguments){
    Student Stu1 = new Student();
    Stu1.setName("Belery");
    Stu1.setAddress("ShenZhen");
    Stu1.setMajor("CS");
    Stu1.setScord(Stu1.Averagescord(3.4, 4.2, 3.1)); 
    String name = Stu1.showname();
    System.out.println(name);
    double scord = Stu1.showScord();
    System.out.println(scord);
    }
}