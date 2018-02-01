import java.util.ArrayList;

/**
 * Represents a collection of recipes.
 * 
 * @author Tim Williams
 * @version 1/31/17
 */
public class RecipeCollection {
    
    private ArrayList< Recipe > recipes;
    private boolean flag;
    private Recipe recipe;
    
    /**
     * Default constructor.
     */
    public RecipeCollection( ) {
        
        recipes = new ArrayList< Recipe >( );
        
    }
    
    /**
     * Adds a recipe to the end of the ArrayList.
     * 
     * @param recipe The recipe to add to the collection.
     * @return flag Verification of addition.
     */
    public boolean add( Recipe recipe ) {
        
        if ( recipe == null ) {
            flag = false;
        } else {
            recipes.add( recipe );
            flag = true;
        }
        
        return flag;
    }
    
    /**
     * Returns the recipe object found at an index.
     * 
     * @param which Index for which to look for a recipe.
     * @return recipe The recipe at the index.
     */
    public Recipe get( int which ) {
        
        if ( which < 0 || which > recipes.size( ) - 1 ) {
            recipe = null;
        } else {
            recipe = recipes.get( which );
        }
        
        return recipe;
    }
    
    /**
     * Removes the last recipe object added to the array.
     * 
     * @param which Disregard this parameter for PA1a
     * @return flag Verification of deletion.
     */
    public boolean remove( int which ) {
        
        flag = false;
        
        if ( recipes.size( ) > 0 ) {
            recipes.remove( recipes.size( ) - 1 );
            flag = true;
        }
        
        return flag;
        
    }
    
    /**
     * Returns the number of elements in the RecipeCollection.
     * 
     * @return the size of the recipe collection.
     */
    public int size( ) {
        
        return recipes.size( ) + 1;
        
    }
}
