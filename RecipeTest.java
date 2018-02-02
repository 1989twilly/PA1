import static org.junit.Assert.*;

import org.junit.Test;

public class RecipeTest {

    @Test
    public void testDefaultConstructor( ) {
    
        Recipe recipe = new Recipe();
    
        String expected = "unknown";
        String actual = recipe.toString();
        
        assertEquals( expected, actual );
        
    }
    
    @Test
    public void testExplicitConstructor( ) {
        
        Recipe recipe;
        
        recipe = new Recipe("Collard Greens");
        
        String expected = "Collard Greens";
        String actual = recipe.getName();
        
        assertEquals( expected, actual );
        
    }
    
    @Test
    public void testNullName( ) {
        
        Recipe recipe;
        
        recipe = new Recipe( "Buffalo Wings" );
        recipe.setName( null );
        
        String expected = "Buffalo Wings";
        String actual = recipe.getName( );
        
        assertEquals( expected, actual );
        
    }
    
    @Test
    public void testNullFallbackName( ) {
        
        Recipe recipe;
        
        recipe = new Recipe( null );
        recipe.setName( "io" );
        
        String expected = "unknown";
        String actual = recipe.getName( );
        
        assertEquals( expected, actual );
        
    }
    
    @Test
    public void testFallBackGreaterThanThree( ) {
        
        Recipe recipe;
        
        recipe = new Recipe( "Grandma's Famous Cookies." );
        recipe.setName( "io" );
        
        String expected = ( "Grandma's Famous Cookies." );
        String actual = recipe.getName( );
        
        assertEquals( expected, actual );
    }
    
    @Test
    public void testAddGetIngredient( ) {
        
        Recipe recipe;
        Ingredient ingredient;
        Ingredient expectedIngredient;
        Ingredient actualIngredient;
        
        ingredient = new Ingredient( "relish", 1, "tablespoon" );
        recipe = new Recipe( "Deviled Eggs" );
        
        recipe.addIngredient( ingredient );
        
        actualIngredient = recipe.getIngredient( 0 );
        expectedIngredient = ingredient;
        
        assertEquals( expectedIngredient, actualIngredient );
        
    }
    
    @Test
    public void testAddIngredient2( ) {
        
        Recipe recipe;
        Ingredient relish;
        Ingredient dijon;
        Ingredient expectedIngredient;
        Ingredient actualIngredient;
        
        relish = new Ingredient( "relish", 1, "tablespoon" );
        dijon = new Ingredient( "dijon", 1/2, "tablespoon" );
        recipe = new Recipe( "Deviled Eggs" );
        
        recipe.addIngredient( relish );
        recipe.addIngredient( dijon );
        
        actualIngredient = recipe.getIngredient( 0 );
        expectedIngredient = relish;
        
        assertEquals( expectedIngredient, actualIngredient );
        
        actualIngredient = recipe.getIngredient( 1 );
        expectedIngredient = dijon;
        
        assertEquals( expectedIngredient, actualIngredient );
        
    }

}
