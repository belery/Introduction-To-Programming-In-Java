class Libraries{
    int i = 0;
    Book[] books = new Book[20];

    public Libraries (){
        
    }

    public void addBook(String title){
        books[i] = new Book(title);
        System.out.println("Scuessce to add " + title);
        i++;
    }

    public void seekBook(String title){
        boolean test = false;
        for (int a = 0; a < i; a++){
            if (books[a].bookName.equals(title)){
                test = true;
                break;
            }
        }
        if (test) {
            System.out.println("we have " + title);
        } else {
            System.out.println("we don't have " + title);
        }
    }
    public void wantToBorrow(String title){
        int index = -1;
        for (int a = 0; a < i; a++){
            index += 1;
            if (books[a].bookName.equals(title)){
                break;
            }
        }
        if (books[index].isBorrowed == false) {
            System.out.println("you borrow " + title);
            books[index].isBorrowed = true;
        } else {
            System.out.println("the book was be borrowed");
        }
    }

    public void wantToReturn(String title){
        int index = -1;
        for (int a = 0; a < i; a++){
            index += 1;
            if (books[a].bookName.equals(title)){
                break;
            }
        }
        if (books[index].isBorrowed == true) {
            System.out.println("you return " + title);
            books[index].isBorrowed = false;
        } else {
            System.out.println(title + "isn't been borrowed");
        }
    }
}


// Created on iPad.

class Book {

    String bookName;
    boolean isBorrowed = false;

    public Book (String name){
        this.bookName = name;
    }
    
}



public class Main {
    public static void main (String[] arg){
        Libraries jiangLib = new Libraries();
        jiangLib.addBook("xiyouji");
        jiangLib.addBook("hongloumeng");
        jiangLib.addBook("shuihuzhuang");
        jiangLib.addBook("sangouyanyi");
        jiangLib.addBook("halibote");
        jiangLib.seekBook("xiyouji");
        jiangLib.seekBook("nihao");
        jiangLib.wantToBorrow("hongloumeng");
        jiangLib.wantToBorrow("hongloumeng");
        jiangLib.wantToReturn("xiyouji");
        jiangLib.wantToReturn("xiyouji");
        jiangLib.wantToReturn("hongloumeng");
        jiangLib.wantToReturn("hongloumeng");
        
        
    }
}