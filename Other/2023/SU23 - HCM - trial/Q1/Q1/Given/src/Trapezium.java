
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Trapezium {
    private float firstEdge;
    private float secondEdge;
    private float height;

    public Trapezium() {
    }

    public Trapezium(float firstEdge, float secondEdge, float height) {
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
        this.height = height;
    }

    public float getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(float firstEdge) {
        if (firstEdge > 0) {
            this.firstEdge = firstEdge;
        }else {
            System.out.println("Invalid value");
        }
    }

    public float getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(float secondEdge) {
         if (secondEdge > 0) {
            this.secondEdge = secondEdge;
        }else {
            System.out.println("Invalid value");
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    public float getAcreage() {
        float area = (firstEdge + secondEdge) * height / 2;
        DecimalFormat df = new DecimalFormat("#.##");
        return Float.parseFloat(df.format(area));
    }
    
    public String getInfo() {
        if (firstEdge == secondEdge) {
            return "Isosceles trapezium";
        }else {
            return "Regular trpezium";
        }
    }
}
