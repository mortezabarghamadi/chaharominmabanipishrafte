import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MabaniPishrafteTest {
    @Test
    void applicationShould() {
        Application a = new Application();
        boolean isWorking = a.isWorking();
        Assertions.assertEquals(isWorking,true);
    }
}
