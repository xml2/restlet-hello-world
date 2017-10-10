import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class HelloWorldResource5 extends ServerResource {

	@Get("json")
	public Greeting represent() {
		return new Greeting("Hello, world!", "en");
	}

}