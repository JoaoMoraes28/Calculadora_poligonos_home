package calculadora_poligonos_home.dao;

import java.util.InputMismatchException;
import java.util.Scanner;

import Cacluladora_poligonos_home.ui.Menu;
import calculadora_poligonos_home.model.Retangulo;

public class Retangulodao {
	
	Scanner reader = new Scanner(System.in);
	
	public void criarRetangulo() {
		Retangulo retangulo = new Retangulo();
		
		System.out.println("");
		System.out.print("Insira a base do retângulo: ");
		
		testarDados(retangulo);
		
		reader.close();
		
	}
	
	public void testarDados(Retangulo retangulo) {
		
		try {
			double base = retangulo.setBase(reader.nextDouble());
			
			if (base >= 0) {
				System.out.print("Insira a altura do retângulo: ");
				
				double altura = retangulo.setAltura(reader.nextDouble());
				
				if (altura >= 0) {
					retangulo.mostrarDados();
					finalizarSeçao();
				
				} else {
					redirecionarMenu();
					
				}
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

