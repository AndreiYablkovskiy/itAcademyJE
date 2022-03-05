import org.junit.Assert;
import org.junit.Test;

public class GemsTest {

    @Test
    public void getGemPriceTest (){
        Gem brilliant = new Brilliant(3, 30.5, 150.0);
        Gem ruby = new Ruby(5, 15, 10);
        Gem topaz = new Topaz(4, 24, 15);
        Assert.assertEquals(675,brilliant.getGemPrice(),0);
        Assert.assertEquals(75,ruby.getGemPrice(),0);
        Assert.assertEquals(90,topaz.getGemPrice(),0);
    }
}
