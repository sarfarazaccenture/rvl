package org.purl.rvl.interpreter.rvl.manual;

import org.ontoware.aifbcommons.collection.ClosableIterator;
import org.ontoware.rdf2go.exception.ModelRuntimeException;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.Resource;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdfreactor.schema.rdfs.Property;

public class PropertyMapping extends
		org.purl.rvl.interpreter.rvl.PropertyMapping {

	static final String NL =  System.getProperty("line.separator");
	
	public PropertyMapping(Model model, URI classURI,
			Resource instanceIdentifier, boolean write) {
		super(model, classURI, instanceIdentifier, write);
		// TODO Auto-generated constructor stub
	}

	public PropertyMapping(Model model, Resource instanceIdentifier,
			boolean write) {
		super(model, instanceIdentifier, write);
		// TODO Auto-generated constructor stub
	}

	public PropertyMapping(Model model, String uriString, boolean write)
			throws ModelRuntimeException {
		super(model, uriString, write);
		// TODO Auto-generated constructor stub
	}

	public PropertyMapping(Model model, BlankNode bnode, boolean write) {
		super(model, bnode, write);
		// TODO Auto-generated constructor stub
	}

	public PropertyMapping(Model model, boolean write) {
		super(model, write);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		String s ="";
		
		// try to get the string description from the (manual) Mapping class, which is not in the super-class hierarchy
		Mapping m = (Mapping) this.castTo(Mapping.class);
		s += m.toString();
		
		Property sp = this.getAllSourceproperty_as().firstValue();
		//Property tgr = this.getAllTargetgraphicrelation_abstract__as().firstValue();
		s += "from PM(m): source property: " + sp.getAllLabel_as().firstValue() + NL;
		s += "from PM(m): target graphic relation: " + this.getAllTargetgraphicrelation_abstract__as().firstValue() + NL ;
		return s;
	}
	

}
