
package br.com.fiap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.fiap.client package. 
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

    private final static QName _Hello_QNAME = new QName("http://ws.exemplos.fiap.com/", "hello");
    private final static QName _IsAuthenticated_QNAME = new QName("http://ws.exemplos.fiap.com/", "isAuthenticated");
    private final static QName _ListAlunosResponse_QNAME = new QName("http://ws.exemplos.fiap.com/", "listAlunosResponse");
    private final static QName _Insert_QNAME = new QName("http://ws.exemplos.fiap.com/", "insert");
    private final static QName _Exception_QNAME = new QName("http://ws.exemplos.fiap.com/", "Exception");
    private final static QName _InsertResponse_QNAME = new QName("http://ws.exemplos.fiap.com/", "insertResponse");
    private final static QName _IsAuthenticatedResponse_QNAME = new QName("http://ws.exemplos.fiap.com/", "isAuthenticatedResponse");
    private final static QName _ListAlunos_QNAME = new QName("http://ws.exemplos.fiap.com/", "listAlunos");
    private final static QName _HelloResponse_QNAME = new QName("http://ws.exemplos.fiap.com/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.fiap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Insert }
     * 
     */
    public Insert createInsert() {
        return new Insert();
    }

    /**
     * Create an instance of {@link ListAlunosResponse }
     * 
     */
    public ListAlunosResponse createListAlunosResponse() {
        return new ListAlunosResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link IsAuthenticated }
     * 
     */
    public IsAuthenticated createIsAuthenticated() {
        return new IsAuthenticated();
    }

    /**
     * Create an instance of {@link ListAlunos }
     * 
     */
    public ListAlunos createListAlunos() {
        return new ListAlunos();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link InsertResponse }
     * 
     */
    public InsertResponse createInsertResponse() {
        return new InsertResponse();
    }

    /**
     * Create an instance of {@link IsAuthenticatedResponse }
     * 
     */
    public IsAuthenticatedResponse createIsAuthenticatedResponse() {
        return new IsAuthenticatedResponse();
    }

    /**
     * Create an instance of {@link Aluno }
     * 
     */
    public Aluno createAluno() {
        return new Aluno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplos.fiap.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAuthenticated }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplos.fiap.com/", name = "isAuthenticated")
    public JAXBElement<IsAuthenticated> createIsAuthenticated(IsAuthenticated value) {
        return new JAXBElement<IsAuthenticated>(_IsAuthenticated_QNAME, IsAuthenticated.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAlunosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplos.fiap.com/", name = "listAlunosResponse")
    public JAXBElement<ListAlunosResponse> createListAlunosResponse(ListAlunosResponse value) {
        return new JAXBElement<ListAlunosResponse>(_ListAlunosResponse_QNAME, ListAlunosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplos.fiap.com/", name = "insert")
    public JAXBElement<Insert> createInsert(Insert value) {
        return new JAXBElement<Insert>(_Insert_QNAME, Insert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplos.fiap.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplos.fiap.com/", name = "insertResponse")
    public JAXBElement<InsertResponse> createInsertResponse(InsertResponse value) {
        return new JAXBElement<InsertResponse>(_InsertResponse_QNAME, InsertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAuthenticatedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplos.fiap.com/", name = "isAuthenticatedResponse")
    public JAXBElement<IsAuthenticatedResponse> createIsAuthenticatedResponse(IsAuthenticatedResponse value) {
        return new JAXBElement<IsAuthenticatedResponse>(_IsAuthenticatedResponse_QNAME, IsAuthenticatedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAlunos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplos.fiap.com/", name = "listAlunos")
    public JAXBElement<ListAlunos> createListAlunos(ListAlunos value) {
        return new JAXBElement<ListAlunos>(_ListAlunos_QNAME, ListAlunos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exemplos.fiap.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
