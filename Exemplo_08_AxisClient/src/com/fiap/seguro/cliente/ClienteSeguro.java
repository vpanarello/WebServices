package com.fiap.seguro.cliente;

import org.apache.axis2.Constants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axiom.om.OMElement;



import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.soap.SOAPFactory;

import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;


public class ClienteSeguro {
    private static EndpointReference targetEPR = new EndpointReference("http://localhost:8080/AxisSec/services/Ola");

    
    public static OMElement getOla() {
        SOAPFactory fac = OMAbstractFactory.getSOAP12Factory();
        OMNamespace omNs = fac.createOMNamespace("http://exemplo.fiap.com", "exem");
        OMElement method = fac.createOMElement("ola",omNs);
        OMElement value = fac.createOMElement("nome", omNs);
        value.addChild(fac.createOMText(value, "Fabio Purcino"));
        method.addChild(value);
        return method;
    }
    

    public static void main(String[] args) {
        try {
            OMElement payload = ClienteSeguro.getOla();
  
            
            ConfigurationContext configContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem("axis-repo", null); 
            
            
            Options options = new Options();
            options.setTo(targetEPR);
            options.setTransportInProtocol(Constants.TRANSPORT_HTTP);
            options.setPassword("123");
            
            //RampartConfig rampartConfig = new RampartConfig();
            //rampartConfig.setUser("purcino");
         
            //Policy policy = new Policy();
            //policy.addAssertion(rampartConfig);
            
            
           
            ServiceClient sender = new ServiceClient(configContext, null);
            //sender.engageModule("rampart");
            //sender.disengageModule("addressing");

            //sender.getAxisService().getPolicyInclude().addPolicyElement(PolicyInclude.AXIS_MESSAGE_POLICY, policy);
            
            
            //sender.addHeader(header);
            
            sender.setOptions(options);
            OMElement result = sender.sendReceive(payload);

            System.out.println(result.toString());

        } catch (Exception e) { 
        	e.printStackTrace();
        }
    }
}
