import org.junit.Test;
import sw.functional.BootApplication;

import static org.junit.Assert.assertNotNull;

public class ApplicationTest {
    @Test
    void appHasAGreeting() {
        BootApplication classUnderTest = new BootApplication();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
