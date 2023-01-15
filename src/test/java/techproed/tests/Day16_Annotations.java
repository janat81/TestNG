package techproed.tests;
import org.testng.annotations.*;
public class Day16_Annotations {
    /*
    suite > test > group > class > method
    @Test : creates test case
    @Before and @After : 10 before and after annotations. The are used to control FLOW and DESIGN of the tests
     */
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Ignore
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }
    @Test
    public void test4(){
        System.out.println("test4");
    }
    @Test
    public void test5(){
        System.out.println("test5");
    }
}
