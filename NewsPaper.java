import java.util.Date;

public class NewsPaper extends Media  {
    private String paragraph;
    public NewsPaper(){};
    public NewsPaper(String paragraph, Date creationDate,String title,String owner){
        super(creationDate, title, owner);
        this.paragraph = paragraph;
    };

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

}
