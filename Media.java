import java.util.Date;

public class Media  {
    private Date creationDate;
    private String title;
    private String owner;

    public Media(){}
    public Media(Date creationDate,String title,String owner){
        this.creationDate = creationDate;
        this.title = title;
        this.owner = owner;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getTitle() {

        return title;
    }

    public String getOwner()
    {
        return owner;
    }


}
