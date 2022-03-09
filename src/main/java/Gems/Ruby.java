package Gems;

public class Ruby extends Gem {

    public Ruby(double carat, double clarity, double priceForOneCarat) {
        super(carat, clarity, priceForOneCarat);
    }

    @Override
    public String toString() {
        return "Gems.Ruby{} " + super.toString();
    }
}
