

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class HelloClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        URI uri =UriBuilder.fromUri("http://localhost:8082/HelloWebService/zenrest").build();
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient();
        
        WebTarget target = client.target(uri);
        String plain= target.path("/zenhello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
        System.out.println(plain);
        
        String plain2= target.path("zenhello/welcome").request().accept(MediaType.TEXT_HTML).get(String.class);
        System.out.println(plain2);
        
        String plain3= target.path("/zenhello/welcomexml").request().accept(MediaType.APPLICATION_XML).get(String.class);
        System.out.println(plain3);
	}

}
