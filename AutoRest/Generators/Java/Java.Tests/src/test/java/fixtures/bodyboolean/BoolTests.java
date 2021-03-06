package fixtures.bodyboolean;

import com.fasterxml.jackson.core.JsonParseException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BoolTests {
    private static AutoRestBoolTestService client;

    @BeforeClass
    public static void setup() {
        client = new AutoRestBoolTestServiceImpl("http://localhost:3000");
    }

    @Test
    public void getNull() throws Exception {
        Assert.assertNull(client.getBool().getNull().getBody());
    }

    @Test
    public void getInvalid() throws Exception {
        try {
            client.getBool().getInvalid();
            Assert.assertTrue(false);
        } catch (Exception exception) {
            // expected
            Assert.assertEquals(JsonParseException.class, exception.getClass());
        }
    }

    @Test
    public void getTrue() throws Exception {
        boolean result = client.getBool().getTrue().getBody();
        Assert.assertTrue(result);
    }

    @Test
    public void getFalse() throws Exception {
        boolean result = client.getBool().getFalse().getBody();
        Assert.assertFalse(result);
    }

    @Test
    public void putTrue() throws Exception {
        client.getBool().putTrue(true);
    }

    @Test
    public void putFalse() throws Exception {
        client.getBool().putFalse(false);
    }
}
