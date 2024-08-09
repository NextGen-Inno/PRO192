/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */
public class HinhCN {
    private int d;
    int r; 
    int getD;
        
    public int tinhChuVi(){
        
        return (d+r)*2;
    }

    public int getD() {
        return d;
    }
    
    public int getR() {
        return r;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setR(int r) {
        this.r = r;
    }

    public HinhCN(int d, int r) {
        this.d = d;
        this.r = r;
    }
    
    public int tinhDienTich(){
        
        return (d*r);
    }
}
