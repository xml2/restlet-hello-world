import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class HelloWorldResource1 extends ServerResource {

	@Get("txt")
	public String represent() {
		return "Hello, world!";
	}

}