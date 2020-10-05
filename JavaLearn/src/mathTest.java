import org.junit.jupiter.api.*;

public class mathTest {
    @BeforeEach
    public void init(){
        System.out.println("init...");
    }

    @AfterEach
    public void close(){
        System.out.println("close...");
    }


    @Test
    public void testMath(){
        math test = new math();
        test.Myprint();

    }

}
