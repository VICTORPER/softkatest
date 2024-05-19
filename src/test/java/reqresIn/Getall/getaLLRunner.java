package reqresIn.Getall;

import com.intuit.karate.junit5.Karate;

public class getaLLRunner {
    @Karate.Test
    Karate userGetAll() {
        return Karate.run().relativeTo(getClass());

    }
}
