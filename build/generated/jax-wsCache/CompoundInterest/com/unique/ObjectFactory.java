
package com.unique;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.unique package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CompInt_QNAME = new QName("http://unique.com/", "CompInt");
    private final static QName _CompIntResponse_QNAME = new QName("http://unique.com/", "CompIntResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unique
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompInt }
     * 
     */
    public CompInt createCompInt() {
        return new CompInt();
    }

    /**
     * Create an instance of {@link CompIntResponse }
     * 
     */
    public CompIntResponse createCompIntResponse() {
        return new CompIntResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompInt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompInt }{@code >}
     */
    @XmlElementDecl(namespace = "http://unique.com/", name = "CompInt")
    public JAXBElement<CompInt> createCompInt(CompInt value) {
        return new JAXBElement<CompInt>(_CompInt_QNAME, CompInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompIntResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompIntResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://unique.com/", name = "CompIntResponse")
    public JAXBElement<CompIntResponse> createCompIntResponse(CompIntResponse value) {
        return new JAXBElement<CompIntResponse>(_CompIntResponse_QNAME, CompIntResponse.class, null, value);
    }

}
