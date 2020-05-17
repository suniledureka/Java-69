import java.net.URI;  
import javax.ws.rs.client.Client;  
import javax.ws.rs.client.ClientBuilder;  
import javax.ws.rs.client.WebTarget;  
import javax.ws.rs.core.MediaType;  
import javax.ws.rs.core.UriBuilder;  
import org.glassfish.jersey.client.ClientConfig; 

public class ClientTest
{  
public static void main(String[] args) throws Exception
{  
 ClientConfig config=new ClientConfig();  
 Client client=ClientBuilder.newClient(config);  

 URI baseURI=UriBuilder.fromUri("http://localhost:65535/REST1").build();

 WebTarget target=client.target(baseURI);  

 System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class));

 System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class));  

 System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class));  

 String json_response= target.path("rest").path("hello").request().accept(MediaType.APPLICATION_JSON).get(String.class);

 System.out.println(json_response);

 //java-json.jar	
 org.json.JSONObject obj=new org.json.JSONObject(json_response);
 System.out.println("Emp No = "+obj.getInt("empno"));
 System.out.println("Name   = "+obj.getString("ename"));
 System.out.println("Salary = "+obj.getInt("sal"));
}  
}   
