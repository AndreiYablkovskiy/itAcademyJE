package model.gems;

public class Topaz extends Gem {

    public Topaz(double carat, double clarity, double priceForOneCarat) {
        super(carat, clarity, priceForOneCarat);
    }

    @Override
    public String toString() {
        return "model.gems.Topaz{} " + super.toString();
    }
}
