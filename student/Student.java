public class Student {
    private String name;
    private String address;
    private String major;
    private double scord;

    public void setName (String name){
        this.name = name;
    }

    public void setAddress (String address){
        this.address = address;
    }

    public void setMajor (String major){
        this.major = major;
    }

    public void setScord (double scord){
        this.scord = scord;
    }

    public double Averagescord (double sub1, double sub2, double sub3){
        double averagescord = (sub1 + sub2 + sub3)/3.0;
        return averagescord;
    }

    public String showname (){
        return this.name;
    }

    public double showScord (){
        return this.scord;
    }

    public String showAdress (){
        return this.address;
    }

    public String showMajor (){
        return this.major;
    }
}