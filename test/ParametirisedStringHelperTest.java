
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.annotations.Parameters;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ParametirisedStringHelperTest {

    //we use @Test to show that it's a unit test method
    //methods should always be public
    //in a test if you don't test anything it will always fail which is a bad practise
    StringHelper helper = new StringHelper();

    private String input;
    private String expectedOutput;

    public ParametirisedStringHelperTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameters
    public static Collection<String[]> testConditions(){//to create parameters on the method
     String expectedOutputs [][]=   {{"AACD","CD"},
        {"ACD","CD"}};
         return  Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        //instance of string helper
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
       // assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }
    @Test
    public  void test2TruncateAInFirst2Positions(){  //some frameworks should be able to call it that's why it needs to be public

        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_Negative() {
        //ABCD=> false and ABAB=>true and AB=>true A => false

       // assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));//better way to rewrite expected as false
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
       // assertFalse("Dummy String ",true);//to print the reason why the test failed
    }
    @Test
    public void  testAreFirstAndLastTwoCharactersTheSame_Positive(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    //some methods need a setup before we test them

}