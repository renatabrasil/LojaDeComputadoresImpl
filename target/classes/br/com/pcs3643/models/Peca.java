package br.com.pcs3643.models;

/**
 * 
 */

import java.math.BigDecimal;
import java.util.Set;

/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author adm2
* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class Peca {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String nome;

	/** 
	* @return the nome
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getNome() {
		// begin-user-code
		return nome;
		// end-user-code
	}

	/** 
	* @param nome the nome to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setNome(String nome) {
		// begin-user-code
		this.nome = nome;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private BigDecimal preco;

	/** 
	* @return the preco
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public BigDecimal getPreco() {
		// begin-user-code
		return preco;
		// end-user-code
	}

	/** 
	* @param preco the preco to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPreco(BigDecimal preco) {
		// begin-user-code
		this.preco = preco;
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