package ir.mini.endpoint;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("test")
public class TestEndpoint {

    @GET
    @Path("ping")
    public String ping () {
        return "ping...";
    }
}
