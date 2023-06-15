package metodos;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers{
	
	public void clicar(By elemento, String passoTeste) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("****Erro no passo" + passoTeste +" ****" );
			System.out.println("****Causa do erro****" + e.getCause());
			System.out.println(" ****Mensagem de erro****" + e.getMessage());
		}
	}
	
	public void preencher(By elemento, String texto, String passoTeste) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("****Erro no passo" + passoTeste +" ****" );
			System.out.println("****Causa do erro****" + e.getCause());
			System.out.println(" ****Mensagem de erro****" + e.getMessage());
			
		}
	}

}
