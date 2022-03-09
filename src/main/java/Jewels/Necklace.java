package Jewels;

import Gems.Gem;
import java.util.List;

public class Necklace extends Jewel {

    public Necklace(List<Gem> gemList) {
        super(gemList);
    }

    @Override
    public String toString() {
        return "Jewels.Necklace{} " + super.toString();
    }
}
