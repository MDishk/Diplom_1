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

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
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
    public void getBunsNameTest() {
        Bun bun = new Bun(name, price);
        Assert.assertEquals("У булки должно быть другое наименование", name, bun.getName());
    }

    @Test
    public void getBunsPriceTest() {
        Bun bun = new Bun(name, price);
        Assert.assertEquals("Цена у этой булки другая", price, bun.getPrice(), 0.001);
    }
}
