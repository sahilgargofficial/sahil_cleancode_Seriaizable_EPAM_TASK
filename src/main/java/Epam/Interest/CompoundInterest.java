package Epam.Interest;

public class CompoundInterest extends SimpleInterest {
    CompoundInterest(long p, double r, int t) {
        setPrinciple(p);
        setRate(r);
        setTime(t);
    }

    public double interest() {
        return principle * (Math.pow(1 + rate / 100, time));
    }
}
