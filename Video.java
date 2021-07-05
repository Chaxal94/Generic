import java.util.Date;

public class Video extends Media  {
    private Double duration;
    public Video(){};
    public Video(Double duration, Date creationDate,String title,String owner){
        super(creationDate, title, owner);
        this.duration = duration;
    }

    public Double getDuration() {

        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

}
