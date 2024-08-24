/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class ElectricMotor {

    private String name;
    private int voltage;
    private int current;

    public ElectricMotor() {
    }

    public ElectricMotor(String name, int voltage, int current) {
        this.name = name;
        this.voltage = voltage;
        this.current = current;
        if (voltage > 220 || voltage < 110) {
            this.voltage = 120;
        }
        if (current <= 0) {
            this.current = 1;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getPower() {
        return voltage * current;
    }
    
    public void setVoltage(int voltage) {
        if(voltage >= 110 && voltage <= 220) {
            this.voltage = voltage;
        }
    }
    
    @Override
    public String toString() {
        return name.toUpperCase() + ", " + voltage + ", " + current + ", " + getPower();
    }
}
