package reqresIn.get;
import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Test;



public class reqresIngetRunner {
    @Test
    @Karate.Test
    Karate userGet() {
        return Karate.run().relativeTo(getClass()).outputCucumberJson(true);
    }

}
