import org.junit.Test;
import praktikum.IngredientType;
import static org.junit.Assert.assertEquals;

public class IngredientTypeTest {

    @Test
    public void ingredientTypeValuesTest() {
        assertEquals(IngredientType.SAUCE, IngredientType.valueOf("SAUCE")); //вельюОф
        assertEquals(IngredientType.FILLING, IngredientType.valueOf("FILLING"));
    }

    @Test
    public void ingredientTypeSizeTest() {
        assertEquals(2, IngredientType.values().length);
    }
}
