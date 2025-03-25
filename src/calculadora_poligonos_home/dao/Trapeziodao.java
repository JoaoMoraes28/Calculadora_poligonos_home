package calculadora_poligonos_home.dao;

import java.util.InputMismatchException;
import java.util.Scanner;

import Cacluladora_poligonos_home.ui.Menu;
import calculadora_poligonos_home.model.Trapezio;

public class Trapeziodao {

	Scanner reader = new Scanner(System.in);
	
	public void criarTrapezio() {
		Trapezio trapezio = new Trapezio();
		
		System.out.print("Insira a base maior do trapézio: ");
		
		testarDado(trapezio);
		
		reader.close();
	}

	public void testarDado(Trapezio trapezio) {
		
		try {
			double baseMaior = trapezio.setBaseMaior(reader.nextDouble());
			
			if (baseMaior >= 0) {
				System.out.print("Insira a base menor do trapézio: ");
				
				double baseMenor = trapezio.setBaseMenor(reader.nextDouble());
				
				if (baseMenor >= 0) {
					System.out.print("Insira a altura do trapézio: ");
					
					double altura = trapezio.setAltura(reader.nextDouble());
					
					if (altura >= 0) {
						trapezio.mostrarDados();
						
					} else {
						redirecionarMenu();
						
					}
					
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
