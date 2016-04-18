package ebsco.example.dropwizard;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path(value = "/hello")
public class HelloResource {

    private final MessagesConfiguration conf;

    public HelloResource(MessagesConfiguration conf) {
        this.conf = conf;
    }

    @GET
    public String sayHello() {
        return conf.getHello();
    }

}
