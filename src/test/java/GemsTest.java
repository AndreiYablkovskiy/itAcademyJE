import org.junit.Assert;
import org.junit.Test;

public class GemsTest {

    @Test
    public void getGemPriceTest (){
        Gem brilliant = new Brilliant(3, 30.5, 150.0);
        Assert.assertEquals(675, brilliant.getGemPrice(), 0);
    }
}
