package br.edu.uscs.correios.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.1
 * 2015-07-15T21:25:24.641-03:00
 * Generated source version: 3.1.1
 * 
 */
@WebService(targetNamespace = "http://ws.correios.uscs.edu.br/", name = "CorreiosWS")
@XmlSeeAlso({ObjectFactory.class})
public interface CorreiosWS {

    @WebMethod
    @RequestWrapper(localName = "consultarEndereco", targetNamespace = "http://ws.correios.uscs.edu.br/", className = "br.edu.uscs.correios.ws.ConsultarEndereco")
    @ResponseWrapper(localName = "consultarEnderecoResponse", targetNamespace = "http://ws.correios.uscs.edu.br/", className = "br.edu.uscs.correios.ws.ConsultarEnderecoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public br.edu.uscs.correios.ws.Endereco consultarEndereco(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
