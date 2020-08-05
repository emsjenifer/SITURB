package br.ufrn.imd.model;

public class Motorista extends Cobrador {
	
	private String registroCnh;
	
	private String carteiraCnh;

	public String getRegistroCnh() {
		return registroCnh;
	}

	public void setRegistroCnh(String registroCnh) {
		this.registroCnh = registroCnh;
	}

	public String getCarteiraCnh() {
		return carteiraCnh;
	}

	public void setCarteiraCnh(String carteiraCnh) {
		this.carteiraCnh = carteiraCnh;
	}
}
