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
public class Computador {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<Peca> peca;

	/** 
	* @return the pecaa
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
	private ItemDoPedido itemDoPedido;

	/** 
	* @return the itemDoPedido
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public ItemDoPedido getItemDoPedido() {
		// begin-user-code
		return itemDoPedido;
		// end-user-code
	}

	/** 
	* @param itemDoPedido the itemDoPedido to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setItemDoPedido(ItemDoPedido itemDoPedido) {
		// begin-user-code
		this.itemDoPedido = itemDoPedido;
		// end-user-code
	}
}