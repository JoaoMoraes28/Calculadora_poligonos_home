package calculadora_poligonos_home.dao;

import java.util.InputMismatchException;
import java.util.Scanner;


import Cacluladora_poligonos_home.ui.Menu;
import calculadora_poligonos_home.model.Circunferencia;

public class Circunferenciadao {

	Scanner reader = new Scanner(System.in);
	
	public void criarCincunferencia() {
		Circunferencia circunferencia = new Circunferencia();
		
		System.out.print("Insira o raio da cincunferência: ");
		
		testarDados(circunferencia);
		
		reader.close();
	}

	public void testarDados(Circunferencia circunferencia) {
		
		try {
			double raio = circunferencia.setRaio(reader.nextDouble());
			
			if (raio >= 0) {
				circunferencia.mostrarDados();
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

