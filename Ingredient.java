/**
 * Represents a single ingredient.
 * 
 * @author Tim Williams
 * @version 1/31/17
 */
public class Ingredient {
    
    private double quantity;    //quantity required
    private String name;        //name of ingredient
    private String uom;         //unit of measurement
    
    /**
     * Default constructor.
     */
    public Ingredient( ) {
        
        name = "unknown";
        quantity = 0.0;
        uom = "unknown";
        
    }
    
    /**
     * Explicit value constructor.
     * 
     * Use the various set() methods to handle the assignments.
     * 
     * @param name The quantity required.
     * @param quantity The name of ingredient.
     * @param uom The unit of measurement.
     */
    public Ingredient( String name , double quantity , String uom ) {
        
        setName( name );
        setQuantity( quantity );
        setUOM( uom );
        
    }
    
    /**
     * Returns the name of the ingredient.
     * 
     * @return name The name of the ingredient.
     */
    public String getName( ) {
        
        return name;
        
    }
    
    /**
     * Returns the quantity of the ingredient.
     * 
     * @return quantity The quantity of the ingredient.
     */
    public double getQuantity( ) {
        
        return quantity;
        
    }
    
    /**
     * Returns the unit of measurement.
     * 
     * @return uom The unit of measurement.
     */
    public String getUOM( ) {
        
        return uom;
        
    }
    
    /**
     * Sets the value of the name attribute.
     * 
     * @param n The name of the ingredient.
     */
    public void setName( String n ) {
        
        //if name is null, all spaces, or if the incoming parameter has a 
        //length less than three (excluding leading and trailing spaces,
        //maintain the prior value. If no prior value, then name should be
        //set to "unknown".
        
        n.trim( );
        
        if ( n != null && n.length( ) > 2 ) {
            name = n;
        } else {
            name = "unknown";
        }
    }
    
    /**
     * Sets the value of the quantity attribute.
     * 
     * @param q The quantity of the ingredient.
     */
    public void setQuantity( double q ) {
        
        //if q is less than zero or null, the prior value should be retained.
        if ( q > 0 ) {
            quantity = q;
        }
    }
    
    /**
     * Sets the value of the unit of measure attribute.
     * 
     * @param um The unit of measurement.
     */
    public void setUOM( String um ) {
        
        //if name is null, all spaces, or if the incoming parameter has a 
        //length less than three (excluding leading and trailing spaces,
        //maintain the prior value. If no prior value, then name should be
        //set to "unknown". ISNT IT ALREADY SET TO UNKNOWN?
        um.trim( );
        
        if ( um != null && um.length( ) > 2 ) {
            uom = um;
        } else {
            uom = "unknown";
        }
        
    }
    
    /**
     * Don't quite know yet.
     * 
     * @return String Of what I do not know.
     */
    public String toString( ) {
        
        return quantity + " " + uom + " " + name;

    }
}
