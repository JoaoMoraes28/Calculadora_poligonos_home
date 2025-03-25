package calculadora_poligonos_home.dao;

import java.util.InputMismatchException;
import java.util.Scanner;

import Cacluladora_poligonos_home.ui.Menu;
import calculadora_poligonos_home.model.Triangulo;

public class Triangulodao {

	Scanner reader = new Scanner(System.in);
	
	public void criarTriangulo() {
		Triangulo triangulo = new Triangulo();
		
		System.out.println("");
		System.out.print("Insira a base do triângulo: ");
		
		testarDados(triangulo);
		
		reader.close();
	}

	public void testarDados(Triangulo triangulo) {
		
		try {
			double base = triangulo.setBase(reader.nextDouble());
			
			if (base >= 0) {
				System.out.print("Insira a altura do triângulo: ");
				
				double altura = triangulo.setAltura(reader.nextDouble());
				
				if (altura >= 0) {
					triangulo.mostrarDados();
					
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
}
