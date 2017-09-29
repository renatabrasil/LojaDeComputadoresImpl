package br.com.pcs3643.models;
/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author adm2
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Cliente {
	
	private Long id;
	private String nome;
	private String CPF;
	private String endereco;
	private String email;
	private String telefone;

	public Cliente() {
		this.nome = "";
		CPF = "";
		this.endereco = "";
		this.email = "";
		this.telefone = "";
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public Cliente(String nome, String cPF, String endereco, String email, String telefone) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}

	/** 
	* @return the nome
	*/
	public String getNome() {
		// begin-user-code
		return nome;
		// end-user-code
	}

	/** 
	* @param nome the nome to set
	*/
	public void setNome(String nome) {
		// begin-user-code
		this.nome = nome;
		// end-user-code
	}


	/** 
	* @return the CPF
	*/
	public String getCPF() {
		// begin-user-code
		return CPF;
		// end-user-code
	}

	/** 
	* @param CPF the CPF to set
	*/
	public void setCPF(String CPF) {
		// begin-user-code
		this.CPF = CPF;
		// end-user-code
	}

	/** 
	* @return the endereco
	*/
	public String getEndereco() {
		// begin-user-code
		return endereco;
		// end-user-code
	}

	/** 
	* @param endereco the endereco to set
	*/
	public void setEndereco(String endereco) {
		// begin-user-code
		this.endereco = endereco;
		// end-user-code
	}


	/** 
	* @return the email
	*/
	public String getEmail() {
		// begin-user-code
		return email;
		// end-user-code
	}

	/** 
	* @param email the email to set
	*/
	public void setEmail(String email) {
		// begin-user-code
		this.email = email;
		// end-user-code
	}


	/** 
	* @return the telefone
	*/
	public String getTelefone() {
		// begin-user-code
		return telefone;
		// end-user-code
	}

	/** 
	* @param telefone the telefone to set
	*/
	public void setTelefone(String telefone) {
		// begin-user-code
		this.telefone = telefone;
		// end-user-code
	}
}