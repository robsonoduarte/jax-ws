
package br.com.correiows.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.correiows.client package. 
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

    private final static QName _ConsultarEnderecoResponse_QNAME = new QName("http://ws.correios.uscs.edu.br/", "consultarEnderecoResponse");
    private final static QName _ConsultarEndereco_QNAME = new QName("http://ws.correios.uscs.edu.br/", "consultarEndereco");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.correiows.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarEndereco }
     * 
     */
    public ConsultarEndereco createConsultarEndereco() {
        return new ConsultarEndereco();
    }

    /**
     * Create an instance of {@link ConsultarEnderecoResponse }
     * 
     */
    public ConsultarEnderecoResponse createConsultarEnderecoResponse() {
        return new ConsultarEnderecoResponse();
    }

    /**
     * Create an instance of {@link Endereco }
     * 
     */
    public Endereco createEndereco() {
        return new Endereco();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEnderecoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.correios.uscs.edu.br/", name = "consultarEnderecoResponse")
    public JAXBElement<ConsultarEnderecoResponse> createConsultarEnderecoResponse(ConsultarEnderecoResponse value) {
        return new JAXBElement<ConsultarEnderecoResponse>(_ConsultarEnderecoResponse_QNAME, ConsultarEnderecoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEndereco }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.correios.uscs.edu.br/", name = "consultarEndereco")
    public JAXBElement<ConsultarEndereco> createConsultarEndereco(ConsultarEndereco value) {
        return new JAXBElement<ConsultarEndereco>(_ConsultarEndereco_QNAME, ConsultarEndereco.class, null, value);
    }

}
