package org.purl.rvl.interpreter.rvl.manual;

import org.ontoware.rdf2go.exception.ModelRuntimeException;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.Resource;
import org.ontoware.rdf2go.model.node.URI;
import org.purl.rvl.interpreter.rvl.Property_to_Graphic_AttributeMapping;

public class Mapping extends org.purl.rvl.interpreter.rvl.Mapping {

	static final String NL =  System.getProperty("line.separator");

	
	public Mapping(Model model, BlankNode bnode, boolean write) {
		super(model, bnode, write);
		// TODO Auto-generated constructor stub
	}

	public Mapping(Model model, boolean write) {
		super(model, write);
		// TODO Auto-generated constructor stub
	}

	public Mapping(Model model, Resource instanceIdentifier, boolean write) {
		super(model, instanceIdentifier, write);
		// TODO Auto-generated constructor stub
	}

	public Mapping(Model model, String uriString, boolean write)
			throws ModelRuntimeException {
		super(model, uriString, write);
		// TODO Auto-generated constructor stub
	}

	protected Mapping(Model model, URI classURI, Resource instanceIdentifier,
			boolean write) {
		super(model, classURI, instanceIdentifier, write);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1457148355972827796L;

	public String toString() {
		String s = "################################################" + NL;
		String label = this.getAllLabel_as().firstValue();
		Boolean includeInLegend = this.getAllIncludeinlegend_as().firstValue();
		
		// label
		if (null != label) {
			s += "from M(m):" + label + NL;
		} else {
			s += "from M(m):Mapping without label (" + super.toString() + ")" + NL;
		}
		// legends
		if (null!=includeInLegend && includeInLegend) {
			s += "	from M(m):Mapping will be included in legends." + NL;
		}
		
		return s;
	}

}
