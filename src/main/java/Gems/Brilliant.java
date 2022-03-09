package Gems;

public class Brilliant extends Gem {

    public Brilliant(double carat, double clarity, double priceForOneCarat) {
        super(carat, clarity, priceForOneCarat);
    }

    @Override
    public String toString() {
        return "Gems.Brilliant{} " + super.toString();
    }
}
