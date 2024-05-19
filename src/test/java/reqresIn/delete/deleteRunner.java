package reqresIn.delete;

import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Test;

public class deleteRunner {
    @Test
    @Karate.Test
    Karate deleteUser() {
        return Karate.run().relativeTo(getClass()).outputCucumberJson(true);
    }

}
