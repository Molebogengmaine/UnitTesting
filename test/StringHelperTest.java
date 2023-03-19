import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class StringHelperTest {

    //we use @Test to show that it's a unit test method
    //methods should always be public
    //in a test if you don't test anything it will always fail which is a bad practise
    StringHelper helper;
    @Before
    public void before(){

        helper = new StringHelper();
    }


    @Test
    public void testTruncateAInFirst2Positions() {
        //instance of string helper
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
       // assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }
    @Test
    public void test2TruncateAInFirst2Positions(){  //some frameworks should be able to call it that's why it needs to be public

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