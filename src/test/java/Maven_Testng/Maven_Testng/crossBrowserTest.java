package Maven_Testng.Maven_Testng;

        import org.testng.annotations.Test;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.AfterClass;

public class crossBrowserTest {
    @Test
    public void f() {
        System.out.println("This is my sample test to run with Jenkins");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("PreConditions");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("PostConditions");
    }

}