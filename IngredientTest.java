import static org.junit.Assert.*;

import org.junit.Test;

public class IngredientTest {

    @Test
    public void testDefaultConstructor( ) {
    
        Ingredient ingredient = new Ingredient();
    
        String expected = "0.0 unknown unknown";
        String actual = ingredient.toString();
        
        assertEquals( expected, actual );
        
    }

    @Test
    public void testNormalExplicitValueConstructor( ) {
        
        Ingredient ingredient = new Ingredient("milk", 2.5, "cups" );
        
        String expected = "2.5 cups milk";
        String actual = ingredient.toString();
        
        assertEquals( expected, actual );
       
    }
    
    @Test
    public void testNullName( ) {
        
        Ingredient ingredient = new Ingredient();
        ingredient = new Ingredient( null, 2.5, "cups" );
        
        String expected = "2.5 cups unknown";
        String actual = ingredient.toString();
        
        assertEquals( expected, actual );
 
    }
    
    @Test
    public void testNullNameFallback( ) {
        
        Ingredient ingredient = new Ingredient();
        ingredient.setName( null );//set name to null
        
        ingredient = new Ingredient( "id", 2.5, "cups" ); //name too short
        
        String expected = "2.5 cups unknown";
        String actual = ingredient.toString();
        
        assertEquals( expected, actual );
        
    }
    
    @Test
    public void testNullNameFallbackLarge( ) {
        
        Ingredient ingredient;
        
        ingredient = new Ingredient( "Happy Days", 2.5, "cups" ); //name too short
        ingredient.setName( "io" );
        
        String expected = "2.5 cups Happy Days";
        String actual = ingredient.toString();
        
        assertEquals( expected, actual );
        
    }
    
    @Test
    public void testNameSpacesAndTabs( ) {
        
        Ingredient ingredient = new Ingredient();
        
        ingredient = new Ingredient( "\tchunky peanut butter    ", 2.5, 
                "tablespoons" ); //tabs and spaces beginning and end of name
        
        String expected = "2.5 tablespoons chunky peanut butter";
        String actual = ingredient.toString();
        System.out.println( actual );
        
        assertEquals( expected, actual );
    }
    
    @Test
    public void testNameSpacesAndTabsBetweenWords( ) {
        
        Ingredient ingredient = new Ingredient();
        
        ingredient = new Ingredient( "chunky\tpeanut  butter  ", 2.5, 
                "tablespoons" ); //tabs and spaces beginning and end of name
        
        String expected = "2.5 tablespoons chunky peanut butter";
        String actual = ingredient.toString();
        System.out.println( actual );
        
        assertEquals( expected, actual );
    }
    
    @Test
    public void testNullUOM( ) {
        
        Ingredient ingredient = new Ingredient( "chunky peanut butter", 2.5,
                null );
        
        String expected = "2.5 unknown chunky peanut butter";
        String actual = ingredient.toString();
        
        assertEquals( expected, actual );
 
    }
    
    @Test
    public void testNullUOMFallback( ) {
        
        Ingredient ingredient = new Ingredient();
        ingredient.setUOM( null ); //set uom to null
        
        ingredient = new Ingredient( "chunky peanut butter", 2.5, "id" );
        //uom too short
        
        String expected = "2.5 unknown chunky peanut butter";
        String actual = ingredient.toString();
        System.out.println( actual );
        
        assertEquals( expected, actual );
    }
    
    @Test
    public void testUOMSpacesAndTabs( ) {
        
        Ingredient ingredient = new Ingredient();
        
        ingredient = new Ingredient( "nutella", 2.5, 
                "\t tablespoons  \t" ); 
        //tabs and spaces beginning and end of uom
        
        String expected = "2.5 tablespoons nutella";
        String actual = ingredient.toString();
        System.out.println( actual );
        
        assertEquals( expected, actual );
    }
    
    @Test
    public void testUOMSpacesAndTabsBetweenWords( ) {
        
        Ingredient ingredient = new Ingredient();
        
        ingredient = new Ingredient( "lemon", 1, 
                "light\t  squeeze" ); 
        //tabs and spaces beginning and end of uom
        
        String expected = "1.0 light squeeze lemon";
        String actual = ingredient.toString();
        System.out.println( actual );
        
        assertEquals( expected, actual );
    }
    
    @Test
    public void testNegativeQuantityExplicitValueConstructor( ) {
        
        Ingredient ingredient = new Ingredient( "bananas", -5 , "whole" );
        //negative value for double
        
        String expected = "0.0 whole bananas";
        String actual = ingredient.toString();
        
        assertEquals( expected, actual );

    }
    
    @Test
    public void testGetQuantity( ) {
        
        Ingredient ingredient = new Ingredient( "ants", 
                1.1111111111111111111111111111111111111111111111111, "army");
        
        String expected = "0.0 army ants";
        String actual =expected 
    }

}
