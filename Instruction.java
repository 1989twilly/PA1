
/**
 * Represents a single instruction.
 * 
 * @author Tim Williams
 * @version 1/31/17
 */
public class Instruction {
    
    private String instruction;
    
    /**
     * Default constructor.
     */
    public Instruction( ) {
        
        instruction = "unknown";
        
    }
    
    /**
     * Explicit value constructor.
     * 
     * @param ins The new instruction.
     */
    public Instruction( String ins ) {
        
        setInstruction( ins );
        
    }
    
    /**
     * Returns the instruction.
     * 
     * @return instruction The instruction.
     */
    public String getInstruction( ) {
        
        return instruction;
        
    }
    
    /**
     * Sets the value of the instruction attribute.
     * 
     * @param ins The new instruction.
     */
    public void setInstruction( String ins ) {
        
        ins.trim( );
        
        if ( ins != null && ins.length() > 2 ) {
            instruction = ins;
        } else {
            instruction = "unknown";
        }
        
    }
    
    /**
     * Returns the String for the browse list.
     * 
     * @return string I've no idea yet.
     */
    public String toString( ) {
        
        return instruction;
        
    }
    
}
