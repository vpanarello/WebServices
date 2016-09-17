<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="samplePrimeiroPortTypeProxyid" scope="session" class="br.com.fiap.exemplos.PrimeiroPortTypeProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
samplePrimeiroPortTypeProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = samplePrimeiroPortTypeProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        samplePrimeiroPortTypeProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        br.com.fiap.exemplos.PrimeiroPortType getPrimeiroPortType10mtemp = samplePrimeiroPortTypeProxyid.getPrimeiroPortType();
if(getPrimeiroPortType10mtemp == null){
%>
<%=getPrimeiroPortType10mtemp %>
<%
}else{
        if(getPrimeiroPortType10mtemp!= null){
        String tempreturnp11 = getPrimeiroPortType10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String nome_1id=  request.getParameter("nome16");
            java.lang.String nome_1idTemp = null;
        if(!nome_1id.equals("")){
         nome_1idTemp  = nome_1id;
        }
        java.lang.String tchau13mtemp = samplePrimeiroPortTypeProxyid.tchau(nome_1idTemp);
if(tchau13mtemp == null){
%>
<%=tchau13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(tchau13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 18:
        gotMethod = true;
        String index_2id=  request.getParameter("index27");
        int index_2idTemp  = Integer.parseInt(index_2id);
        br.com.fiap.exemplos.xsd.Aluno buscar18mtemp = samplePrimeiroPortTypeProxyid.buscar(index_2idTemp);
if(buscar18mtemp == null){
%>
<%=buscar18mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nome:</TD>
<TD>
<%
if(buscar18mtemp != null){
java.lang.String typenome21 = buscar18mtemp.getNome();
        String tempResultnome21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenome21));
        %>
        <%= tempResultnome21 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">media:</TD>
<TD>
<%
if(buscar18mtemp != null){
java.lang.String typemedia23 = buscar18mtemp.getMedia();
        String tempResultmedia23 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemedia23));
        %>
        <%= tempResultmedia23 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">turma:</TD>
<TD>
<%
if(buscar18mtemp != null){
java.lang.String typeturma25 = buscar18mtemp.getTurma();
        String tempResultturma25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeturma25));
        %>
        <%= tempResultturma25 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 29:
        gotMethod = true;
        br.com.fiap.exemplos.xsd.Aluno[] listar29mtemp = samplePrimeiroPortTypeProxyid.listar();
if(listar29mtemp == null){
%>
<%=listar29mtemp %>
<%
}else{
        String tempreturnp30 = null;
        if(listar29mtemp != null){
        java.util.List listreturnp30= java.util.Arrays.asList(listar29mtemp);
        tempreturnp30 = listreturnp30.toString();
        }
        %>
        <%=tempreturnp30%>
        <%
}
break;
case 32:
        gotMethod = true;
        String nome_4id=  request.getParameter("nome37");
            java.lang.String nome_4idTemp = null;
        if(!nome_4id.equals("")){
         nome_4idTemp  = nome_4id;
        }
        String media_5id=  request.getParameter("media39");
            java.lang.String media_5idTemp = null;
        if(!media_5id.equals("")){
         media_5idTemp  = media_5id;
        }
        String turma_6id=  request.getParameter("turma41");
            java.lang.String turma_6idTemp = null;
        if(!turma_6id.equals("")){
         turma_6idTemp  = turma_6id;
        }
        %>
        <jsp:useBean id="br1com1fiap1exemplos1xsd1Aluno_3id" scope="session" class="br.com.fiap.exemplos.xsd.Aluno" />
        <%
        br1com1fiap1exemplos1xsd1Aluno_3id.setNome(nome_4idTemp);
        br1com1fiap1exemplos1xsd1Aluno_3id.setMedia(media_5idTemp);
        br1com1fiap1exemplos1xsd1Aluno_3id.setTurma(turma_6idTemp);
        java.lang.String novo32mtemp = samplePrimeiroPortTypeProxyid.novo(br1com1fiap1exemplos1xsd1Aluno_3id);
if(novo32mtemp == null){
%>
<%=novo32mtemp %>
<%
}else{
        String tempResultreturnp33 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(novo32mtemp));
        %>
        <%= tempResultreturnp33 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>