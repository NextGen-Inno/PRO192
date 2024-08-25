/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */
public class Comment {

    private String content;
    private int like;

    public Comment() {
    }

    public Comment(String content, int like) {
        this.content = content;
        this.like = like;
    }

    public String getContent() {
        return content;
    }

    public int getLike() {
        return like;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLike(int like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return content + ", " + like ;
    }

 
    

}
