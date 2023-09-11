package th.mfu;

import java.util.Date;

public class Concert {

    //TODO: add attributes
       private long id;
       private String title;
       private String performer;
       private Date date;
       private String description;
       
    public Concert() {
    }
    public Concert(String title, String description) {
        //TODO: set attributes
        this.title = title;
        this.description = description;
        
    }

    //TODO: add getters and setters
     
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPerformer() {
        return performer;
    }
    public void setPerformer(String performer) {
        this.performer = performer;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTitle() {
        //TODO: return title
        return title;
    }
    public String getDescription() {
        //TODO: return description
        return description;
    }

}