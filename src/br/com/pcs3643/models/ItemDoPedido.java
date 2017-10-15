package br.com.pcs3643.models;

/**
 * 
 */

import java.util.Set;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author adm2
* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class ItemDoPedido {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<Peca> peca;

	/** 
	* @return the peca
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<Peca> getPeca() {
		// begin-user-code
		return peca;
		// end-user-code
	}

	/** 
	* @param peca the peca to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPeca(Set<Peca> peca) {
		// begin-user-code
		this.peca = peca;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<Computador> computador;

	/** 
	* @return the computador
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<Computador> getComputador() {
		// begin-user-code
		return computador;
		// end-user-code
	}

	/** 
	* @param computador the computador to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setComputador(Set<Computador> computador) {
		// begin-user-code
		this.computador = computador;
		// end-user-code
	}
}