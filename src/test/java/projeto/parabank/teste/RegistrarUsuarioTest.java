package projeto.parabank.teste;

import org.junit.Before;
import org.junit.Test;

import page.RegistrarUsuarioPage;
import runner.Executa;

public class RegistrarUsuarioTest {
	
	RegistrarUsuarioPage registrar = new RegistrarUsuarioPage();
	
	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
	}
	
	@Test
	public void testeRegistrarUsuario() {
		registrar.acessarFormulario();
		registrar.enviarFormulario("Teste10", "Teste10", "Teste10", "Teste10", "Teste10", "Teste10", "Teste10", "Teste10", "Teste10", "Teste10", "Teste10");
		
	}
	
public void testeRegistrarUsuarioDadosEmBranco() {
	registrar.acessarFormulario();
	registrar.enviarFormulario(null, null, null, null, null, null, null, null, null, null, null);
	}

public void testeRegistrarUsuarioSenhasDiferentes() {
	registrar.acessarFormulario();
	registrar.enviarFormulario("Teste11", "Teste11", "Teste11", "Teste11", "Teste11", "Teste11", "Teste11", "Teste11", "Teste11", "Teste11", "Teste11");
}

public void testeRegistrarUsuarioJaCadastrado() {
	registrar.acessarFormulario();
	registrar.enviarFormulario("Teste10", "Teste10", "Teste10", "Teste10", "Teste10", "Teste10", "Teste10", "Teste10", "Teste10", "Teste10", "Teste10");
}

}
