import java.io.IOException;

import org.restlet.data.MediaType;

import org.restlet.representation.Representation;

import org.restlet.ext.xml.DomRepresentation;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class HelloWorldResource4 extends ServerResource {

	@Get("xml")
	public Representation represent() throws IOException {
		DomRepresentation rep = new DomRepresentation(MediaType.APPLICATION_XML);
		Document doc = rep.getDocument();
		Element root = doc.createElement("greeting");
		root.setAttribute("xml:lang", "en");
		root.setTextContent("Hello, world!");
		doc.appendChild(root);
		return rep;
	}

}