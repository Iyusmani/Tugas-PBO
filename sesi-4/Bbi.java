class Manusia {
    private double tb;

    protected Manusia(double tb) {
        this.tb = tb;
    }

    protected double getTb() {
        return this.tb;
    }

    protected double BbIdeal() {
        return 0.0;
    }
}

class Pria extends Manusia {
    protected Pria(double tb) {
        super(tb);
    }

    @Override
    protected double BbIdeal() {
        return ((super.getTb() - 100) - ((super.getTb() - 100) * 0.10));
    }
}

class Wanita extends Manusia {
    protected Wanita(double tb) {
        super(tb);
    }

    @Override
    protected double BbIdeal() {
        return (super.getTb() - 100) - ((super.getTb() - 100) * 0.15);
    }
}

public class Bbi {
    public static void main(String[] args) {
        Pria ucup = new Pria(178);
        System.out.println("Berat badan ideal ucup : " + ucup.BbIdeal());
        Wanita ningsih = new Wanita(155);
        System.out.println("Berat badan ideal ningsih : " + ningsih.BbIdeal());
    }

}
