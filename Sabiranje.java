package OOP;

public class Sabiranje {
    int brojA;
    int brojB;
    int rezultatAB;

    public Sabiranje(int brojA, int brojB, int rezultatAB) {
        this.brojA = brojA;
        this.brojB = brojB;
        this.rezultatAB = rezultatAB;
    }

    public void setBrojA(int brojA) {
        this.brojA = 5;
    }

    public void setBrojB(int brojB) {
        this.brojB = 2;
    }

    public int getRezultatAB(int brojA, int brojB) {
        rezultatAB=brojA+brojB;
        return rezultatAB;
    }
}
