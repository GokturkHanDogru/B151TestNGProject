package techproed.tests.day23_Anotation;

import org.testng.annotations.*;

public class C01_Anotation {

    @BeforeSuite
    public void suite(){

        System.out.println("Her seyden önce bir kez BeforeSuite calisir");

    }

    @BeforeTest
    public void beforeTest(){

        System.out.println("Testlerden önce bir kez e calisir");

    }

    @BeforeClass
    public void beforeClass(){

        System.out.println("Her classtan önce bir kez calisir");

    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Junitteki @Before notasyonu gibi her methottan once calisir");
    }

    @Test
    public void test01() {
        System.out.println("Test1 calisti ");
    }

    @Test
    public void test02() {
        System.out.println("Test2 calisti ");
    }

    @Test
    public void test03() {
        System.out.println("Test3 calisti ");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Her seyden sonra bir kez AfterSuite calisir");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("Bütün testlerden sonra bir kez AfterTest calisir");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Her class'tan sonra bir kez AfterClass calisir");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Junit'teki @After notasyonu gibi her method'dan sonra çalışır");
    }
}
