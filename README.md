# WebServices

Gerando WebServices somente com o compilador do JDK

### Comandos aula_01:

- D:\27SCJ\WebServices\Exemplo_01\src\br\com\fiap\exemplo\ws> javac *.java
- D:\27SCJ\WebServices\Exemplo_01\src>wsgen -s . -classpath . br.com.fiap.exemplo.ws.HelloWeb


### Comandos aula_02:

- D:\27SCJ\WebServices\Exemplo_04_clienteWs\src>wsimport -keep -p br.com.fiap.client http://l2901micro15:8080/Exemplo_03/AlunoWebService?wsdl


### Notas Servidor GlassFish:

- Área de admin em "http://localhost:4848"