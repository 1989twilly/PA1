import java.util.ArrayList;

/**
 * Represents a single recipe.
 * 
 * @author Tim Williams
 * @version /31/17
 */
public class Recipe {
    
    private ArrayList< Ingredient > ingredients;
    private ArrayList< Instruction > instructions;
    private boolean flag;
    private Ingredient ingredient;
    private Instruction instruction;
    private String name;

    
    /**
     * Default constructor.
     */
    public Recipe( ) {
        
        ingredients = new ArrayList< Ingredient >( );
        instructions = new ArrayList< Instruction >( );
        setName( "unknown" );
        
    }
    
    /**
     * Explicit value constructor.
     * 
     * @param n The name of the recipe
     */
    public Recipe( String n ) {
        
        ingredients = new ArrayList< Ingredient >( );
        instructions = new ArrayList< Instruction >( );
        setName( n );
        
    }
    
    /**
     * Adds the ingredient object to the end of the ingredients ArrayList.
     * 
     * @param ingredient The ingredient object to add.
     * @return flag A boolean value for success.
     */
    public boolean addIngredient( Ingredient ingredient ) {
        
        if ( ingredient == null ) {
            flag = false;
        } else {
            ingredients.add( ingredient );
            flag = true;
        }
        
        return flag;
        
    }
    
    /**
     * Adds the instruction object to the end of the instructions ArrayList.
     * 
     * @param instruction
     * @return
     */
    public boolean addInstruction( Instruction instruction ) {
        
        if ( instruction == null ) {
            flag = false;
        } else {
            instructions.add( instruction );
            flag = true;
        }
        
        return flag;
        
    }
    /**
     * Returns the ingredient at the position indicated by the parameter.
     * 
     * @param which The index of an ingredient object in the ArrayList.
     * @return ingredient The ingredient at the index.
     */
    public Ingredient getIngredient( int which ) {
        
        if ( which < 0 || which > ingredients.size( ) -1 ) {
            ingredient = null;
        } else {
            ingredient = ingredients.get( which ); 
        }
        
        return ingredient;
        
    }
    /**
     * Returns the instruction at the position indicated by the parameter.
     * 
     * @param which The index of an instruction object in the ArrayList.
     * @return The instruction at the index.
     */
    public Instruction getInstruction( int which ) {
        
        if ( which < 0 || which > instructions.size( ) - 1 ) {
            instruction = null;
        } else {
            instruction = instructions.get( which );
        }
        
        return instruction;
    }
    
    /**
     * Returns the value of the name attribute.
     * 
     * @return name The name of the recipe.
     */
    public String getName( ) {
        
        return name;
        
    }
    
    /**
     * Sets the value of the name attribute.
     * 
     * @param name The desired name of the recipe
     */
    public void setName( String newRecipe ) {
        
        String oldRecipe = getName( );
        if ( newRecipe == null ) {
            if (oldRecipe != null ) {
                newRecipe = oldRecipe;
            } else {
                newRecipe = "unknown";
            }
        } else {
            newRecipe = newRecipe.trim();
            newRecipe = newRecipe.replaceAll("\\s+", " ");
            if ( newRecipe.length( ) < 3 ) {
                if ( oldRecipe != null ) {
                    newRecipe = oldRecipe;
                } else {
                    newRecipe = "unknown";
                }
            }
        }
        
        name = newRecipe;
    }
    
    /**
     * Returns the full string for the browse list.
     */
    public String toString( ) {
        
        return name;
        
    }
}
