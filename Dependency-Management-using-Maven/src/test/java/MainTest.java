import com.Maven.Main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void TestMain(){
        assertEquals(8 , Main.addition(3,5));
    }
}