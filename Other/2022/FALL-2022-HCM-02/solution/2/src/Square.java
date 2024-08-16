/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Square extends Rectangle {
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }
    
    @Override
    public void output() {
        System.out.println(edge);
    }
}
