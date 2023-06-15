package page;

import elementos.Elementos;
import metodos.Metodos;

public class RegistrarUsuarioPage {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	public void acessarFormulario() {
		metodo.clicar(el.menuRegister, "abrindo o formulario");
	}

	public void enviarFormulario(String firstName, String lastName, String address, String city, String state,
			String zipCode, String phone, String ssn, String username, String password, String confirm) {
		metodo.preencher(el.firstName, firstName, "preencher o campo first name");
		metodo.preencher(el.lastName, lastName, "preencher o campo last name");
		metodo.preencher(el.address, address, "preencher o campo address");
		metodo.preencher(el.city, city, "preencher o campo city");
		metodo.preencher(el.state, state, "preencher o campo state");
		metodo.preencher(el.zipCode, zipCode, "preencher o campo zip code");
		metodo.preencher(el.phone, phone, "preencher o campo phone");
		metodo.preencher(el.ssn, ssn, "preencher o campo ssn");
		metodo.preencher(el.userName, username, "preencher o campo username");
		metodo.preencher(el.password, password, "preencher o campo password");
		metodo.preencher(el.confirm, confirm,"preencher o campo confirm");
		metodo.clicar(el.btnRegister, "clicando no botao register para enviar o formulario");

	}

}
