package calculadora_poligonos_home.dao;

import java.util.InputMismatchException;
import java.util.Scanner;

import Cacluladora_poligonos_home.ui.Menu;
import calculadora_poligonos_home.model.Quadrado;

public class Quadradodao {

	Scanner reader = new Scanner(System.in);
	
	public void criarQuadrado() {
		Quadrado quadrado = new Quadrado();
		
		testarDados(quadrado);
		
		reader.close();
	}
	
	public void testarDados(Quadrado quadrado) {
		
		System.out.print("Insira o lado do quadrado: ");
		
		try {
			double lado = quadrado.setLado(reader.nextDouble());
			if (lado >= 0) {
				quadrado.mostrarDados();
				finalizarSeçao();
			
			} else {
				redirecionarMenu();
				
			}
		
		} catch (InputMismatchException e) {
			redirecionarMenu();
		}	
	}
	
	public void redirecionarMenu() {
		Menu menu = new Menu();
		menu.loopResposta();
	}
	
	public void finalizarSeçao() {
		Menu menu = new Menu();
		menu.repetirCalculos();
	}
}
