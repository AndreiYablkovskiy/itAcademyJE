package service;

import model.gems.Gem;
import model.jewels.Jewel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NecklaceService {
    private Jewel jewel;

    public NecklaceService(Jewel jewel) {
        this.jewel = jewel;
    }

    public void sortLowToHighPrice() {
        Collections.sort(jewel.getGemsList(), Comparator.comparingDouble(Gem::getGemPrice));
    }

    public void sortHighToLowPrice() {
        Collections.sort(jewel.getGemsList(), Comparator.comparingDouble(Gem::getGemPrice).reversed());
    }

    public List<Gem> searchByClarity(double minRange, double maxRange) {
        List<Gem> newList = new ArrayList<>();
        for (int x = 0; x < jewel.getGemsList().size(); x++) {
            if (jewel.getGemsList().get(x).getClarity() >= minRange && jewel.getGemsList().get(x).getClarity() <= maxRange) {
                newList.add(jewel.getGemsList().get(x));
            }
        }
        return newList;
    }
}
