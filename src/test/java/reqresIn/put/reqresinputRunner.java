package reqresIn.put;

import com.intuit.karate.junit5.Karate;

public class reqresinputRunner {
    @Karate.Test
    Karate userPut() {
        return Karate.run().relativeTo(getClass());
    }
}
