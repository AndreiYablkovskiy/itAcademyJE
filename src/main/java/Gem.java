public abstract class Gem {

    private double carat;
    private double clarity; // не наше точной инфы про прозрачность, ввожу рандомные значения
    private double priceForOneCarat; // цена за один карат, для подсчета стоимости, ввожу выдуманые значения
    private double gemPrice; // стоимость камня

    public Gem(double carat, double clarity, double priceForOneCarat) {
        this.carat = carat;
        this.clarity = clarity;
        this.priceForOneCarat = priceForOneCarat;
    }

    public double getCarat() {
        return carat;
    }

    public void setCarat(double carat) {
        this.carat = carat;
    }

    public double getClarity() {
        return clarity;
    }

    public void setClarity(double clarity) {
        this.clarity = clarity;
    }

    public double getPriceForOneCarat() {
        return priceForOneCarat;
    }

    public void setPriceForOneCarat(double priceForOneCarat) {
        this.priceForOneCarat = priceForOneCarat;
    }

    public double getGemPrice() {
        return gemPrice = carat * priceForOneCarat * 1.5; // формула выдуманая
    }

    @Override
    public String toString() {
        return "Gems{" +
                "carat=" + carat +
                ", clarity=" + clarity +
                ", priceForOneCarat=" + priceForOneCarat +
                ", gemPrice=" + gemPrice +
                '}';
    }
}
