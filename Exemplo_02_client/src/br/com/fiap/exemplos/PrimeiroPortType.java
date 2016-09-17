/**
 * PrimeiroPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.exemplos;

public interface PrimeiroPortType extends java.rmi.Remote {
    public br.com.fiap.exemplos.xsd.Aluno buscar(int index) throws java.rmi.RemoteException;
    public br.com.fiap.exemplos.xsd.Aluno[] listar() throws java.rmi.RemoteException;
    public java.lang.String novo(br.com.fiap.exemplos.xsd.Aluno aluno) throws java.rmi.RemoteException;
    public java.lang.String tchau(java.lang.String nome) throws java.rmi.RemoteException;
}
