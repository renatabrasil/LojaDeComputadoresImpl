package br.com.pcs3643.config;

public interface Parameters {
	
	public interface CRUD_OPERATIONS {
		public final static String ALL = "index";
		public final static String CREATE = "create";
		public final static String UPDATE = "update";
		public final static String READ = "read";
		public final static String DELETE = "delete";
	}
	
	public interface VALIDATION_MESSAGES {
		public final static String BLANK_FIELD = "não informado(a).";
		public final static String SUCCESS = "Operação realizada com sucesso.";
	}

}
