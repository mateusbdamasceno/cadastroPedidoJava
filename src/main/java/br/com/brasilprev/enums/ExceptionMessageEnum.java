package br.com.brasilprev.enums;

public enum ExceptionMessageEnum {
	PedidoInvalido("Pedido Inválido."),
	Sucesso("Pedido cadastrado com sucesso.");
	
	private String mensagem;
	
	ExceptionMessageEnum(String mensagem){
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}

}
