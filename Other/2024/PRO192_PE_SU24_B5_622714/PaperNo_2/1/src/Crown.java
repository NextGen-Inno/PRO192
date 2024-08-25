
import static jdk.nashorn.tools.ShellFunctions.input;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */
public class Crown {
    private String color;
    private int weight;

    public Crown() {
    }

    public Crown(String color, int weight) {
        this.color = color;
        this.weight = this.weight- weight;
    }

    public String getColor() {

        return color.substring(0, 1).toUpperCase() + color.substring(1,color.length() ).toLowerCase() ;
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = this.weight + weight ;
    }
    
    
}
