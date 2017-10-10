import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class HelloWorldResource2 extends ServerResource {

	@Get("xml")
	public String represent() {
		return "<greeting xml:lang=\"en\">Hello, world!</greeting>";
	}

}