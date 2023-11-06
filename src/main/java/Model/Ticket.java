package Model;

import exceptions.LowerThanZeroException;

public class Ticket {
    static final double priceKm = 0.21;
    static final double over65Discount = 0.04;
    static final double under18Discount = 0.02;
    private int km;
    private int eta;
    private double total;

    public Ticket(int km, int eta) throws LowerThanZeroException {
        if(km <= 0 || eta <= 0){
            throw new LowerThanZeroException();
        }
        this.km = km;
        this.eta = eta;
        total = km * priceKm;
        if(eta < 18){
            total = total * under18Discount;
        }
        if(eta > 65){
            total = total * over65Discount;
        }
    }

    public int getKm() {
        return km;
    }

    public int getEta() {
        return eta;
    }

    public double getTotal() {
        return total;
    }
}
