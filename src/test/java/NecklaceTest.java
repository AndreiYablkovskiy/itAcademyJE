import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NecklaceTest {
    private Gem brilliant;
    private Gem ruby;
    private Gem topaz;
    private Necklace necklace;

    @Before
    public void init() {
        brilliant = new Brilliant(3, 30.5, 150.0);
        ruby = new Ruby(5, 15, 10);
        topaz = new Topaz(4, 24, 15);
        List<Gem> list = new ArrayList<>();
        list.add(brilliant);
        list.add(ruby);
        list.add(topaz);
        necklace = new Necklace(list);
    }

    @Test
    public void necklaceGemsListTest(){
        Assert.assertEquals(3,necklace.getGemsList().size());
        Assert.assertEquals(brilliant,necklace.getGemsList().get(0));
        Assert.assertEquals(ruby,necklace.getGemsList().get(1));
        Assert.assertEquals(topaz,necklace.getGemsList().get(2));
    }

    @Test
    public void getJewelPriceTest() {
        Assert.assertEquals(840, necklace.getJewelPrice(), 0);
    }

    @Test
    public void getJewelCaratValueTest() {
        Assert.assertEquals(12, necklace.getJewelCaratValue(), 0);
    }

    @Test
    public void sortLowToHighPriceTest() {
        necklace.sortLowToHighPrice();
        Assert.assertEquals(ruby, necklace.getGemsList().get(0));
        Assert.assertEquals(topaz, necklace.getGemsList().get(1));
        Assert.assertEquals(brilliant, necklace.getGemsList().get(2));
    }

    @Test
    public void sortHighToLowPriceTest() {
        necklace.sortHighToLowPrice();
        Assert.assertEquals(brilliant, necklace.getGemsList().get(0));
        Assert.assertEquals(topaz, necklace.getGemsList().get(1));
        Assert.assertEquals(ruby, necklace.getGemsList().get(2));
    }

    @Test
    public void searchByClarityTest() {
        List<Gem> list = necklace.searchByClarity(12, 25);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals(ruby, list.get(0));
        Assert.assertEquals(topaz, list.get(1));
    }
}
