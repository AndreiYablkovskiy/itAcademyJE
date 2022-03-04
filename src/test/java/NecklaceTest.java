import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NecklaceTest {

    @Test
    public void getJewelPriceTest () {
        Gem brilliant = new Brilliant(3, 30.5, 150.0);
        Gem ruby = new Ruby(5, 15, 10);
        Gem topaz = new Topaz(4, 24, 15);

        List<Gem> list = new ArrayList<>();
        list.add(brilliant);
        list.add(ruby);
        list.add(topaz);
        Necklace necklace = new Necklace(list);

        Assert.assertEquals(840, necklace.getJewelPrice(), 0);
    }

    @Test
    public void getJewelCaratValueTest (){
        Gem brilliant = new Brilliant(3, 30.5, 150.0);
        Gem ruby = new Ruby(5, 15, 10);
        Gem topaz = new Topaz(4, 24, 15);

        List<Gem> list = new ArrayList<>();
        list.add(brilliant);
        list.add(ruby);
        list.add(topaz);
        Necklace necklace = new Necklace(list);

        Assert.assertEquals(12, necklace.getJewelCaratValue(), 0);
    }

    @Test
    public void sortLowToHighPriceTest (){
        Gem brilliant = new Brilliant(3, 30.5, 150.0);
        Gem ruby = new Ruby(5, 15, 10);
        Gem topaz = new Topaz(4, 24, 15);

        List<Gem> expectedList = new ArrayList<>();
        expectedList.add(ruby);
        expectedList.add(topaz);
        expectedList.add(brilliant);

        List<Gem> list = new ArrayList<>();
        list.add(brilliant);
        list.add(ruby);
        list.add(topaz);
        Necklace necklace = new Necklace(list);
        necklace.sortLowToHighPrice();

        Assert.assertEquals(expectedList,necklace.getGemsList());
    }

    @Test
    public void sortHighToLowPriceTest (){
        Gem brilliant = new Brilliant(3, 30.5, 150.0);
        Gem ruby = new Ruby(5, 15, 10);
        Gem topaz = new Topaz(4, 24, 15);

        List<Gem> expectedList = new ArrayList<>();
        expectedList.add(brilliant);
        expectedList.add(topaz);
        expectedList.add(ruby);

        List<Gem> list = new ArrayList<>();
        list.add(brilliant);
        list.add(ruby);
        list.add(topaz);
        Necklace necklace = new Necklace(list);
        necklace.sortHighToLowPrice();

        Assert.assertEquals(expectedList,necklace.getGemsList());
    }

    @Test
    public void searchByClarityTest (){
        Gem brilliant = new Brilliant(3, 30.5, 150.0);
        Gem ruby = new Ruby(5, 15, 10);
        Gem topaz = new Topaz(4, 24, 15);

        List<Gem> expectedList = new ArrayList<>();
        expectedList.add(ruby);
        expectedList.add(topaz);

        List<Gem> list = new ArrayList<>();
        list.add(brilliant);
        list.add(ruby);
        list.add(topaz);
        Necklace necklace = new Necklace(list);

        Assert.assertEquals(expectedList,necklace.searchByClarity(12,25));
    }

}
