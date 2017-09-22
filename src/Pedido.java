
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
public class Pedido {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private BigDecimal precoTotal;

	/** 
	* @return the precoTotal
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public BigDecimal getPrecoTotal() {
		// begin-user-code
		return precoTotal;
		// end-user-code
	}

	/** 
	* @param precoTotal the precoTotal to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPrecoTotal(BigDecimal precoTotal) {
		// begin-user-code
		this.precoTotal = precoTotal;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Integer quantidade;

	/** 
	* @return the quantidade
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Integer getQuantidade() {
		// begin-user-code
		return quantidade;
		// end-user-code
	}

	/** 
	* @param quantidade the quantidade to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setQuantidade(Integer quantidade) {
		// begin-user-code
		this.quantidade = quantidade;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<ItemDoPedido> itemDoPedido;

	/** 
	* @return the itemDoPedido
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<ItemDoPedido> getItemDoPedido() {
		// begin-user-code
		return itemDoPedido;
		// end-user-code
	}

	/** 
	* @param itemDoPedido the itemDoPedido to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setItemDoPedido(Set<ItemDoPedido> itemDoPedido) {
		// begin-user-code
		this.itemDoPedido = itemDoPedido;
		// end-user-code
	}
}