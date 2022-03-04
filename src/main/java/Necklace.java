import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Necklace extends Jewel implements Sortable, Searchable {

    public Necklace(List<Gem> gemList) {
        super(gemList);
    }

    public void sortLowToHighPrice() {
        Collections.sort(super.getGemsList(), Comparator.comparingDouble(Gem::getGemPrice));
    }

    public void sortHighToLowPrice() {
        Collections.sort(super.getGemsList(), Comparator.comparingDouble(Gem::getGemPrice).reversed());
    }

    public List<Gem> searchByClarity(double minRange, double maxRange) {
        List<Gem> newList = new ArrayList<>();
        for (int x = 0; x < super.getGemsList().size(); x++) {
            if (super.getGemsList().get(x).getClarity() >= minRange && super.getGemsList().get(x).getClarity() <= maxRange) {
                newList.add(super.getGemsList().get(x));
            }
        }
        return newList;
    }

    @Override
    public String toString() {
        return "Necklace{} " + super.toString();
    }
}
