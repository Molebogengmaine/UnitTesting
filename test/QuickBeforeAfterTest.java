import org.junit.*;

public class QuickBeforeAfterTest {

    @BeforeClass //gets executed only once it can be used for DB connections
    //it has to a static method
    public static  void beforeClassTest(){
        System.out.println("Before Class");
    }

    @Before    //runs before every test method
    public void setup(){
        System.out.println("Before Test");
    }

    @Test
    public  void test1(){
        System.out.println("test1 excecuted");
    }

    @Test
    public  void test2(){
        System.out.println("test2 excecuted");
    }
    @After  //runs after every test method
    public void tearDown(){
        System.out.println("After test");
    }
    @AfterClass
    public static void afterClassTest(){
        System.out.println("After Class");

    }


}