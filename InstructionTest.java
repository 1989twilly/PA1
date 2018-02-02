import static org.junit.Assert.*;

import org.junit.Test;

public class InstructionTest {

    @Test
    public void testDefaultConstructor( ) {
    
        Instruction instruction = new Instruction();
    
        String expected = "unknown";
        String actual = instruction.toString();
        
        assertEquals( expected, actual );
        
    }

    @Test
    public void testNormalExplicitValueConstructor( ) {
        
        Instruction instruction = new Instruction("Broil until golden brown." );
        
        String expected = "Broil until golden brown.";
        String actual = instruction.toString();
        
        assertEquals( expected, actual );
       
    }
    
    @Test
    public void testNullName( ) {
        
        Instruction instruction = new Instruction( );
        instruction = new Instruction( null );
        
        String expected = "unknown";
        String actual = instruction.toString();
        
        assertEquals( expected, actual );
 
    }
    
    @Test
    public void testNullNameFallback( ) {
        
        Instruction instruction = new Instruction( );
        instruction.setInstruction( null );//set instruction to null
        
        instruction = new Instruction( "ok" ); //instruction too short
        
        String expected = "unknown";
        String actual = instruction.toString();
        
        assertEquals( expected, actual );
        
    }
    
    @Test
    public void testNullNameFallbackGreaterThan3( ) {
        
        Instruction instruction = new Instruction( );
        instruction.setInstruction( "Mix thouroughly!" );//set instruction to null
        
        instruction = new Instruction( "Mi" ); //instruction too short
        
        String expected = "Mix thorughly!";
        String actual = instruction.toString();
        
        assertEquals( expected, actual );
        
    }
    
    @Test
    public void testInstructionSpacesAndTabs( ) {
        
        Instruction instruction = new Instruction();
        
        instruction = new Instruction( "\tDon't overcook it!      " ); 
        //tabs and spaces beginning and end of name
        
        String expected = "Don't overcook it!";
        String actual = instruction.toString();
        
        assertEquals( expected, actual );
        
    }
    
    @Test
    public void testNameSpacesAndTabsBetweenWords( ) {
        
        Instruction instruction = new Instruction();
        
        instruction = new Instruction( "Kick\t it \tup a notch!" ); //tabs and spaces beginning and end of name
        
        String expected = "Kick it up a notch!";
        String actual = instruction.toString();
        System.out.println( actual );
        
        assertEquals( expected, actual );
        
    }

}
