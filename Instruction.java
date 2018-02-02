
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
    public void setInstruction( String newInstruction ) {
        
        String oldInstruction = getInstruction( );
        
        if ( newInstruction == null ) {
            if (oldInstruction != null ) {
                newInstruction = oldInstruction;
            } else {
                newInstruction = "unknown";
            }
        } else {
            newInstruction = newInstruction.trim();
            newInstruction = newInstruction.replaceAll("\\s+", " ");
            if ( newInstruction.length( ) < 3 ) {
                if ( oldInstruction != null ) {
                    newInstruction = oldInstruction;
                } else {
                    newInstruction = "unknown";
                }
            }
        }
        
        instruction = newInstruction;
       
        
    }
    
    /**
     * Returns the String for the browse list.
     * 
     * @return string I've no idea yet.
     */
    public String toString( ) {
        
        return getInstruction( );
        
    }
    
}
