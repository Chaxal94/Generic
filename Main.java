import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book5 = new Book();
        Library<Book> bookLibrary = new Library<>();
        bookLibrary.add(book1);
        bookLibrary.add(book3);
        bookLibrary.add(book4);
        bookLibrary.add(book5);
        System.out.println( bookLibrary.size());
        bookLibrary.delete();
        System.out.println(bookLibrary.size());
        Library<Video> videos= new Library<>();
        Video video = new Video(2.7,new Date(),"2e2e2e","okdok");
        Video video1 = new Video(2.7,new Date(),"2e2e2e","okdok");
        Video video2= new Video(2.7,new Date(),"2e2e2e","okdok");
        Video video3= new Video(2.7,new Date(),"2e2e2e","okdok");
        Video video4= new Video(2.7,new Date(),"2e2e2e","okdok");
        Video video5= new Video(2.7,new Date(),"2e2e2e","okdok");
        Video video6= new Video(2.7,new Date(),"2e2e2e","okdok");

        videos.add(video1);
        videos.add(video2);
        videos.add(video3);
        videos.add(video4);
        videos.add(video5);
        System.out.println(videos.size());
        videos.delete(2);
        System.out.println(videos.size());


    }


}
