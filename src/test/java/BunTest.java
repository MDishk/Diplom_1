import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BunTest {

    private String name;
    private float price;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"black bun", 100.0f},
                {"", 10.0f},
                {"pupipupipupipupipupipupipupipu", 100.0f},
                {null, 100.0f},
                {"@#%^&", 100.0f},
                {"black bun", -250.0f},
                {"black bun", 0.0f},
                {"black bun", 300.0f}
        });
    }

    @Test
    public void getBunAndPriceTest() {
        Bun bun = new Bun(name, price);
        Assert.assertEquals(name, bun.getName());
        Assert.assertEquals(price, bun.getPrice(), 0.001);
    }
}
