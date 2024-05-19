package reqresIn.post;

import com.intuit.karate.junit5.Karate;

public class reqresinpostRunner {
    @Karate.Test
    Karate userAdd() {
        return Karate.run().relativeTo(getClass());

    }
}