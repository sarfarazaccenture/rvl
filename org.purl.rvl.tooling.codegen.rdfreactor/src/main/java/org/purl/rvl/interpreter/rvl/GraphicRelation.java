/*
 * generated by http://RDFReactor.semweb4j.org ($Id: CodeGenerator.java 1895 2013-02-09 17:39:56Z max.at.xam.de@gmail.com $) on 09.11.13 21:01
 */
package org.purl.rvl.interpreter.rvl;

import org.ontoware.aifbcommons.collection.ClosableIterator;
import org.ontoware.rdf2go.exception.ModelRuntimeException;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.Node;
import org.ontoware.rdf2go.model.node.Resource;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;
import org.ontoware.rdfreactor.runtime.Base;
import org.ontoware.rdfreactor.runtime.ReactorResult;

/**
 * This class manages access to these properties:
 * <ul>
 *   <li>Neutralvalue</li>
 * </ul>
 *
 * This class was generated by <a href="http://RDFReactor.semweb4j.org">RDFReactor</a> on 09.11.13 21:01
 */
public class GraphicRelation extends Thing1 {

    private static final long serialVersionUID = 5148253730232887673L;

    /** http://purl.org/viso/graphic/GraphicRelation */
	public static final URI RDFS_CLASS = new URIImpl("http://purl.org/viso/graphic/GraphicRelation", false);

    /** http://purl.org/rvl/neutralValue */
	public static final URI NEUTRALVALUE = new URIImpl("http://purl.org/rvl/neutralValue", false);

    /**
     * All property-URIs with this class as domain.
     * All properties of all super-classes are also available.
     */
    public static final URI[] MANAGED_URIS = {
      new URIImpl("http://purl.org/rvl/neutralValue", false)
    };


	// protected constructors needed for inheritance

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.semweb4j.org
	 * @param classURI URI of RDFS class
	 * @param instanceIdentifier Resource that identifies this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 *
	 * [Generated from RDFReactor template rule #c1]
	 */
	protected GraphicRelation (Model model, URI classURI, Resource instanceIdentifier, boolean write) {
		super(model, classURI, instanceIdentifier, write);
	}

	// public constructors

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param instanceIdentifier an RDF2Go Resource identifying this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 *
	 * [Generated from RDFReactor template rule #c2]
	 */
	public GraphicRelation (Model model, Resource instanceIdentifier, boolean write) {
		super(model, RDFS_CLASS, instanceIdentifier, write);
	}


	/**
	 * Returns a Java wrapper over an RDF object, identified by a URI, given as a String.
	 * Creating two wrappers for the same URI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param uriString a URI given as a String
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 * @throws ModelRuntimeException if URI syntax is wrong
	 *
	 * [Generated from RDFReactor template rule #c7]
	 */
	public GraphicRelation (Model model, String uriString, boolean write) throws ModelRuntimeException {
		super(model, RDFS_CLASS, new URIImpl(uriString,false), write);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by a blank node.
	 * Creating two wrappers for the same blank node is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param bnode BlankNode of this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 *
	 * [Generated from RDFReactor template rule #c8]
	 */
	public GraphicRelation (Model model, BlankNode bnode, boolean write) {
		super(model, RDFS_CLASS, bnode, write);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by
	 * a randomly generated URI.
	 * Creating two wrappers results in different URIs.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 *
	 * [Generated from RDFReactor template rule #c9]
	 */
	public GraphicRelation (Model model, boolean write) {
		super(model, RDFS_CLASS, model.newRandomUniqueURI(), write);
	}

    ///////////////////////////////////////////////////////////////////
    // typing

	/**
	 * Return an existing instance of this class in the model. No statements are written.
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 * @return an instance of GraphicRelation or null if none existst
	 *
	 * [Generated from RDFReactor template rule #class0]
	 */
	public static GraphicRelation getInstance(Model model, Resource instanceResource) {
		return Base.getInstance(model, instanceResource, GraphicRelation.class);
	}

	/**
	 * Create a new instance of this class in the model.
	 * That is, create the statement (instanceResource, RDF.type, http://purl.org/viso/graphic/GraphicRelation).
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #class1]
	 */
	public static void createInstance(Model model, Resource instanceResource) {
		Base.createInstance(model, RDFS_CLASS, instanceResource);
	}

	/**
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 * @return true if instanceResource is an instance of this class in the model
	 *
	 * [Generated from RDFReactor template rule #class2]
	 */
	public static boolean hasInstance(Model model, Resource instanceResource) {
		return Base.hasInstance(model, RDFS_CLASS, instanceResource);
	}

	/**
	 * @param model an RDF2Go model
	 * @return all instances of this class in Model 'model' as RDF resources
	 *
	 * [Generated from RDFReactor template rule #class3]
	 */
	public static ClosableIterator<Resource> getAllInstances(Model model) {
		return Base.getAllInstances(model, RDFS_CLASS, Resource.class);
	}

	/**
	 * @param model an RDF2Go model
	 * @return all instances of this class in Model 'model' as a ReactorResult,
	 * which can conveniently be converted to iterator, list or array.
	 *
	 * [Generated from RDFReactor template rule #class3-as]
	 */
	public static ReactorResult<? extends GraphicRelation> getAllInstances_as(Model model) {
		return Base.getAllInstances_as(model, RDFS_CLASS, GraphicRelation.class );
	}

    /**
	 * Remove triple {@code (this, rdf:type, GraphicRelation)} from this instance. Other triples are not affected.
	 * To delete more, use deleteAllProperties
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #class4]
	 */
	public static void deleteInstance(Model model, Resource instanceResource) {
		Base.deleteInstance(model, RDFS_CLASS, instanceResource);
	}

	/**
	 * Delete all triples {@code (this, *, *)}, i.e. including {@code rdf:type}.
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #class5]
	 */
	public static void deleteAllProperties(Model model,	Resource instanceResource) {
		Base.deleteAllProperties(model, instanceResource);
	}

    ///////////////////////////////////////////////////////////////////
    // property access methods


    /**
     * Check if {@code Neutralvalue} has at least one value set.
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-static]
     */
	public static boolean hasNeutralvalue(Model model, Resource instanceResource) {
		return Base.has(model, instanceResource, NEUTRALVALUE);
	}

    /**
     * Check if {@code Neutralvalue} has at least one value set.
     * @return true if this property has at least one value
	 *
	 * [Generated from RDFReactor template rule #get0has-dynamic]
     */
	public boolean hasNeutralvalue() {
		return Base.has(this.model, this.getResource(), NEUTRALVALUE);
	}

    /**
     * Check if {@code Neutralvalue} has the given value (maybe among other values).
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-static]
     */
	public static boolean hasNeutralvalue(Model model, Resource instanceResource, Node value ) {
		return Base.hasValue(model, instanceResource, NEUTRALVALUE, value);
	}

    /**
     * Check if {@code Neutralvalue} has the given value (maybe among other values).
	 * @param value the value to be checked
     * @return true if this property contains (maybe among other) the given value
	 *
	 * [Generated from RDFReactor template rule #get0has-value-dynamic]
     */
	public boolean hasNeutralvalue( Node value ) {
		return Base.hasValue(this.model, this.getResource(), NEUTRALVALUE, value);
	}

     /**
     * Get all values of property {@code Neutralvalue} as an Iterator over RDF2Go nodes.
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static]
     */
	public static ClosableIterator<Node> getAllNeutralvalue_asNode(Model model, Resource instanceResource) {
		return Base.getAll_asNode(model, instanceResource, NEUTRALVALUE);
	}

    /**
     * Get all values of property {@code Neutralvalue} as a ReactorResult of RDF2Go nodes.
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-reactor-result]
     */
	public static ReactorResult<Node> getAllNeutralvalue_asNode_(Model model, Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, NEUTRALVALUE, Node.class);
	}

    /**
     * Get all values of property {@code Neutralvalue} as an Iterator over RDF2Go nodes
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic]
     */
	public ClosableIterator<Node> getAllNeutralvalue_asNode() {
		return Base.getAll_asNode(this.model, this.getResource(), NEUTRALVALUE);
	}

    /**
     * Get all values of property {@code Neutralvalue} as a ReactorResult of RDF2Go nodes.
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-reactor-result]
     */
	public ReactorResult<Node> getAllNeutralvalue_asNode_() {
		return Base.getAll_as(this.model, this.getResource(), NEUTRALVALUE, Node.class);
	}
 
    /**
     * Get all values of property {@code Neutralvalue}.
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static]
     */
	public static ClosableIterator<org.ontoware.rdfreactor.schema.rdfs.Resource> getAllNeutralvalue(Model model, Resource instanceResource) {
		return Base.getAll(model, instanceResource, NEUTRALVALUE, org.ontoware.rdfreactor.schema.rdfs.Resource.class);
	}

    /**
     * Get all values of property {@code Neutralvalue} as a ReactorResult of {@linkplain org.ontoware.rdfreactor.schema.rdfs.Resource}.
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get11static-reactorresult]
     */
	public static ReactorResult<org.ontoware.rdfreactor.schema.rdfs.Resource> getAllNeutralvalue_as(Model model, Resource instanceResource) {
		return Base.getAll_as(model, instanceResource, NEUTRALVALUE, org.ontoware.rdfreactor.schema.rdfs.Resource.class);
	}

    /**
     * Get all values of property {@code Neutralvalue}.
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic]
     */
	public ClosableIterator<org.ontoware.rdfreactor.schema.rdfs.Resource> getAllNeutralvalue() {
		return Base.getAll(this.model, this.getResource(), NEUTRALVALUE, org.ontoware.rdfreactor.schema.rdfs.Resource.class);
	}

    /**
     * Get all values of property {@code Neutralvalue} as a ReactorResult of {@linkplain org.ontoware.rdfreactor.schema.rdfs.Resource}.
     * @return a ReactorResult of $type which can conveniently be converted to iterator, list or array
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-reactorresult]
     */
	public ReactorResult<org.ontoware.rdfreactor.schema.rdfs.Resource> getAllNeutralvalue_as() {
		return Base.getAll_as(this.model, this.getResource(), NEUTRALVALUE, org.ontoware.rdfreactor.schema.rdfs.Resource.class);
	}

 
    /**
     * Adds a value to property {@code Neutralvalue} as an RDF2Go {@linkplain Node}.
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static]
     */
	public static void addNeutralvalue(Model model, Resource instanceResource, Node value) {
		Base.add(model, instanceResource, NEUTRALVALUE, value);
	}

    /**
     * Adds a value to property {@code Neutralvalue} as an RDF2Go {@linkplain Node}.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic]
     */
	public void addNeutralvalue(Node value) {
		Base.add(this.model, this.getResource(), NEUTRALVALUE, value);
	}
    /**
     * Adds a value to property {@code Neutralvalue} from an instance of {@linkplain org.ontoware.rdfreactor.schema.rdfs.Resource}.
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
     * @param value
	 *
	 * [Generated from RDFReactor template rule #add3static]
     */
	public static void addNeutralvalue(Model model, Resource instanceResource, org.ontoware.rdfreactor.schema.rdfs.Resource value) {
		Base.add(model, instanceResource, NEUTRALVALUE, value);
	}

    /**
     * Adds a value to property {@code Neutralvalue} from an instance of {@linkplain org.ontoware.rdfreactor.schema.rdfs.Resource}.
	 *
	 * [Generated from RDFReactor template rule #add4dynamic]
     */
	public void addNeutralvalue(org.ontoware.rdfreactor.schema.rdfs.Resource value) {
		Base.add(this.model, this.getResource(), NEUTRALVALUE, value);
	}
  

    /**
     * Sets a value of property {@code Neutralvalue} from an RDF2Go {@linkplain Node}.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no {@code minCardinality} or {@code minCardinality == 1}.
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static]
     */
	public static void setNeutralvalue(Model model, Resource instanceResource, Node value) {
		Base.set(model, instanceResource, NEUTRALVALUE, value);
	}

    /**
     * Sets a value of property {@code Neutralvalue} from an RDF2Go {@linkplain Node}.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no {@code minCardinality} or {@code minCardinality == 1}.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic]
     */
	public void setNeutralvalue(Node value) {
		Base.set(this.model, this.getResource(), NEUTRALVALUE, value);
	}
    /**
     * Sets a value of property {@code Neutralvalue} from an instance of {@linkplain org.ontoware.rdfreactor.schema.rdfs.Resource}.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no {@code minCardinality} or {@code minCardinality == 1}.
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static]
     */
	public static void setNeutralvalue(Model model, Resource instanceResource, org.ontoware.rdfreactor.schema.rdfs.Resource value) {
		Base.set(model, instanceResource, NEUTRALVALUE, value);
	}

    /**
     * Sets a value of property {@code Neutralvalue} from an instance of {@linkplain org.ontoware.rdfreactor.schema.rdfs.Resource}.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no {@code minCardinality} or {@code minCardinality == 1}.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic]
     */
	public void setNeutralvalue(org.ontoware.rdfreactor.schema.rdfs.Resource value) {
		Base.set(this.model, this.getResource(), NEUTRALVALUE, value);
	}
  


    /**
     * Removes a value of property {@code Neutralvalue} as an RDF2Go {@linkplain Node}.
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static]
     */
	public static void removeNeutralvalue(Model model, Resource instanceResource, Node value) {
		Base.remove(model, instanceResource, NEUTRALVALUE, value);
	}

    /**
     * Removes a value of property {@code Neutralvalue} as an RDF2Go {@linkplain Node}.
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic]
     */
	public void removeNeutralvalue(Node value) {
		Base.remove(this.model, this.getResource(), NEUTRALVALUE, value);
	}
    /**
     * Removes a value of property {@code Neutralvalue} given as an instance of {@linkplain org.ontoware.rdfreactor.schema.rdfs.Resource}.
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static]
     */
	public static void removeNeutralvalue(Model model, Resource instanceResource, org.ontoware.rdfreactor.schema.rdfs.Resource value) {
		Base.remove(model, instanceResource, NEUTRALVALUE, value);
	}

    /**
     * Removes a value of property {@code Neutralvalue} given as an instance of {@linkplain org.ontoware.rdfreactor.schema.rdfs.Resource}.
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic]
     */
	public void removeNeutralvalue(org.ontoware.rdfreactor.schema.rdfs.Resource value) {
		Base.remove(this.model, this.getResource(), NEUTRALVALUE, value);
	}
  
    /**
     * Removes all values of property {@code Neutralvalue}.
     * @param model an RDF2Go model
     * @param instanceResource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static]
     */
	public static void removeAllNeutralvalue(Model model, Resource instanceResource) {
		Base.removeAll(model, instanceResource, NEUTRALVALUE);
	}

    /**
     * Removes all values of property {@code Neutralvalue}.
	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic]
     */
	public void removeAllNeutralvalue() {
		Base.removeAll(this.model, this.getResource(), NEUTRALVALUE);
	}
 }