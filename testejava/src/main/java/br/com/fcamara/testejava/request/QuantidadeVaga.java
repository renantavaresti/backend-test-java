package br.com.fcamara.testejava.request;

public class QuantidadeVaga {

	private int quantidade;
	private String tipo;

	public QuantidadeVaga() {
	}

	public QuantidadeVaga(int quantidade, String tipo) {
		this.quantidade = quantidade;
		this.tipo = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
