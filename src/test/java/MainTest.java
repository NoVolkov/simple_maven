import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void checkConstructors(){
        try {
            new Main();
			System.out.println("Тест: Main без аргументов");
        } catch(Exception e) {
             fail(e.toString());
        }
        try {
            System.out.println(new Main(4,5).getSum());
        } catch(Exception e) {
            fail(e.toString());
        }
    }

    @Test
    public void checkMath(){
        Main.main(null);
        try {

            assertEquals(3, new Main().getSum());
            assertEquals(4+5, new Main(4,5).getSum());
        } catch (Exception e) {
            fail(e.toString());
        }
    }
    }




