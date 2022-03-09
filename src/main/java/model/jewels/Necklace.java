package model.jewels;

import model.gems.Gem;
import java.util.List;

public class Necklace extends Jewel {

    public Necklace(List<Gem> gemList) {
        super(gemList);
    }

    @Override
    public String toString() {
        return "model.jewels.Necklace{} " + super.toString();
    }
}
