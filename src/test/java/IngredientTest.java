import org.junit.Before;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;
import static org.junit.Assert.assertEquals;

public class IngredientTest {

    private Ingredient ingredient;

    @Before
    public void setUp() {
        ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100.0f);
    }
    @Test
    public void getPriceTest() {
        assertEquals(100.0f, ingredient.getPrice(), 0.001);
    }

    @Test
    public void getNameTest() {
        assertEquals("hot sauce", ingredient.getName());
    }

    @Test
    public void getTypeTest() {
        assertEquals(IngredientType.SAUCE, ingredient.getType());
    }
}
