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
	private Set<Peca> peça;

	/** 
	* @return the peça
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<Peca> getPeça() {
		// begin-user-code
		return peça;
		// end-user-code
	}

	/** 
	* @param peça the peça to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPeça(Set<Peca> peça) {
		// begin-user-code
		this.peça = peça;
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