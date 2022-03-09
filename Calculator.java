package OOP;

public class Calculator {
    int brojA;
    int brojB;
    double pi;
    double radius;
    int n;

    public Calculator(int brojA, int brojB, double pi, double radius) {
        this.brojA = brojA;
        this.brojB = brojB;
        this.pi = pi;
        this.radius = radius;
        this.n = n;
    }

    public double getBrojA() {
        return brojA;
    }

    public void setBrojA(int brojA) {
        this.brojA = brojA;
    }

    public double getBrojB() {
        return brojB;
    }

    public void setBrojB(int brojB) {
        this.brojB = brojB;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    int sabiranje() {
        return this.brojA + this.brojB;
    }

    int oduzimanje() {
        return this.brojA - this.brojB;
    }

    double mnozenje() {
        return this.brojA * this.brojB;
    }

    double dijeljenje() {
        return this.brojA / this.brojB;
    }


    double povrsinaKruga(){
        return this.radius * this.radius * this.pi;
    }


}
