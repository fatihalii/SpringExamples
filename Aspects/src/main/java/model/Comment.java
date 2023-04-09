package model;

public class Comment {
    private String text;
    private String author;

    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
    public String getAuhor(){
        return author;
    }
    public void setAuhor(String author){
        this.author = author;
    }
}
