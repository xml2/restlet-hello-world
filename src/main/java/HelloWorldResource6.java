import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class HelloWorldResource6 extends ServerResource {

	@Get("txt")
	public String toText() {
		return "Hello, world!";
	}

	@Get("xml")
	public String toXML() {
		return "<greeting xml:lang=\"en\">Hello, world!</greeting>";
	}

	@Get("html")
	public String toHTML() {
		return "<html><head><title>Hello, world!</title></head><body><p>Hello, world!</p></body></html>";
	}

	@Get("json")
	public String toJSON() {
		return "\"Hello, world!\"";
	}

}