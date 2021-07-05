import java.util.Date;

public class Book extends Media   {
    private int pageCount;
    public Book(){}
    public  Book(int pageCount, Date creationDate,String title,String owner) {
        super(creationDate,title,owner);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }


}
