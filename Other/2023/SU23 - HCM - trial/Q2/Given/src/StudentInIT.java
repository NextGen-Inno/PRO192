/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class StudentInIT extends Student {

    private double basic;
    private double specialized;
    private double internship;

    public StudentInIT() {
        basic = 0;
        specialized = 0;
        internship = 0;
    }
    public StudentInIT(double basic, double specialized, double internship) {
        this.basic = basic;
        this.specialized = specialized;
        this.internship = internship;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        if (basic >= 0 && basic <= 10) {
            this.basic = basic;
        }else {
            System.out.println("Incorrect");
        }
    }

    public double getSpecialized() {
        return specialized;
    }

    public void setSpecialized(double specialized) {
        if (specialized >= 0 && specialized <= 10) {
            this.specialized = specialized;
        }else {
            System.out.println("Incorrect");
        }
    }

    public double getInternship() {
        return internship;
    }

    public void setInternship(double internship) {
        if (internship >= 0 && internship <= 10) {
            this.internship = internship;
        }else {
            System.out.println("Incorrect");
        }
    }

    @Override
    public double mediumScore() {
        return (basic + specialized + internship) / 3;
    }

    @Override
    public String classification() {
        double average= mediumScore();
        if (average < 5) {
            return "Weak student";
        } else if (average < 7) {
            return "Average academic";
        } else if (average < 8.5) {
            return "Good academic";
        } else {
            return "Excellent Student";
        }
    }
}
