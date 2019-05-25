import org.junit.ClassRule;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.net.URI;
import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class BowlingServerTest {
    @Test
    public void testSparkServerRule_HealthcheckRequest() {
        Client client = ClientBuilder.newBuilder().build();
        Response response = client.target(URI.create("http://localhost:4567/hello"))
                .request()
                .get();
        assertEquals(response.getStatus(), 200);
        assertEquals(response.readEntity(String.class), "Hello World");
    }
}
