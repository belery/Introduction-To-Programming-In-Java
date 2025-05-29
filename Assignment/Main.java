class Libraries{
    static String[] allTitel = new String[100];
    static int i = 0;
    public Libraries (){
        Libraries jiangMengLib = new Libraries();
        jiangMengLib.addBook("xiyaouji");
        jiangMengLib.addBook("shuihuzhuang");
        jiangMengLib.addBook("sanguoyanyi");
        jiangMengLib.addBook("hongloumeng");
        jiangMengLib.addBook("hongxing");

    }

    public void addBook(String title){
        Book book = new Book(title);
        System.out.println("Scuessce to add " + Book.bookName);
        allTitel[i] = title;
        i++;

    }

    public void seekBook(String title){
        for (int a = 0; a < i; a++){
            if (allTitel[a] == title){
                System.out.println("we have " + allTitel[a]);
            }
        }
    }
}

// Created on iPad.

class Book {

    static String bookName;
    boolean isBorrowed = false;
    boolean isReturn = true;

    public Book (String name){
        this.bookName = name;
    }
    
    public void wantToBorrow(String bookName){
        if (isBorrowed == false && isReturn == true){
        System.out.println("you borrowed " + bookName);
        isBorrowed = true;
        isReturn = false;
        } else {
            System.out.println("you can't borrowed is");
        }
    }

    
    public void wantToReturn(String bookName){
        if (isBorrowed == true && isReturn == false){
        System.out.println("you return " + bookName);
        isBorrowed = false;
        isReturn = true;
        } else {
            System.out.println("This book was been return");
        }
    }
}



public class Main {
    public static void main (String[] arg){
        Book.wantToBorrow("xiyouji");
    }
}