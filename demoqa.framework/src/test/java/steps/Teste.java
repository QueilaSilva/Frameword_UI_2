package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Teste {
	Metodos metodos = new Metodos();
	Elementos elemento = new Elementos();

	@Given("que entre no site {string}")
	public void que_entre_no_site(String string) {
		metodos.abrirBrowser(string);
	}

	@When("clico em entrar para validar button")
	public void clico_em_entrar_para_validar_button() {
		metodos.clicar(elemento.homeCadastro);

	}

	@When("button de entrar valido")
	public void button_de_entrar_valido() throws IOException {
		metodos.screenshot("CT01");

	}

	@Then("tela para cadastro aberta")
	public void tela_para_cadastro_aberta() {
		metodos.fecharNavegador(null);
	}

	@When("clico em todos button")
	public void clico_em_todos_button() throws IOException {
		metodos.scroll(0, 600);
		metodos.screenshot("CT02");
	}

	@When("button book mostra books disponiveis")
	public void button_book_mostra_books_disponiveis() throws IOException, InterruptedException {
		metodos.clicar(elemento.btnBook);
		metodos.scroll(0, 200);
		// metodos.screenshot("CT03");
		metodos.fecharNavegador(null);
	}

	@When("os demais pedem para clicar no item ao lado esquerdo")
	public void os_demais_pedem_para_clicar_no_item_ao_lado_esquerdo() throws IOException {
		metodos.abrirBrowser("https://demoqa.com/");
		metodos.scroll(0, 600);
		metodos.clicar(elemento.btn1);
		// metodos.screenshot("CT04");
		metodos.fecharNavegador("https://demoqa.com/");
	}

}
