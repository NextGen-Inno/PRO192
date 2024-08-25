/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */
public class SpecComment extends Comment {

    private String status;
    public SpecComment() {
    }

    public SpecComment(String status, String content, int like) {
        super(content, like);
        this.status = status;
    }

    public String getValue() {
        if (super.getLike() >= n) {
            return n+status;
        } else {
            return n;
        }
    }

    public void setData() {
    }

    @Override
    public String toString() {
        return super.toString() + status;
    }

}
