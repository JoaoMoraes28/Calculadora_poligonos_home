package Cacluladora_poligonos_home.ui;

import java.util.Scanner;

import calculadora_poligonos_home.dao.Circunferenciadao;
import calculadora_poligonos_home.dao.Quadradodao;
import calculadora_poligonos_home.dao.Retangulodao;
import calculadora_poligonos_home.dao.Trapeziodao;
import calculadora_poligonos_home.dao.Triangulodao;

public class Menu {

	Scanner reader = new Scanner(System.in);
	
	public void mostrarMenu() {
		System.out.println("------------------------------");
		System.out.println("Modelos de polígonos");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Triângulo");
		System.out.println("4 - Trapézio");
		System.out.println("5 - Circunferência");
		System.out.println("------------------------------");
		System.out.print("Escolha entre as opções 1 -5: ");
		 
		interagirMenu();
		
		reader.close();
	
	}
	
	public void interagirMenu() {
		int opcao = reader.nextInt();
		
		if (opcao >= 1 && opcao <= 5) {
			System.out.println("");
			System.out.println("Você escolheu a opção: " + opcao);
			System.out.println("------------------------------");
		}	
			
			if (opcao == 1) {
				Quadradodao quadradodao = new Quadradodao();
				quadradodao.criarQuadrado();
				
			} else if (opcao == 2) {
				Retangulodao retangulodao = new Retangulodao();
				retangulodao.criarRetangulo();
			
			} else if (opcao == 3) {
				Triangulodao triangulodao = new Triangulodao();	
				triangulodao.criarTriangulo();
			
			} else if (opcao == 4) {
				Trapeziodao trapeziodao = new Trapeziodao();
				trapeziodao.criarTrapezio();
				
			} else if (opcao == 5) {
				Circunferenciadao circunferenciadao = new Circunferenciadao();
				circunferenciadao.criarCincunferencia();
			
			} else {
				Menu menu = new Menu();
				menu.loopResposta();
			}
			
		
	}
	
	public void repetirCalculos() {
		System.out.println("Gostaria de realizar mais algum cálculo?");
		System.out.print("S / N: ");
		
		String resposta = reader.next();
		
		if (resposta.equals("s")) {
			Menu menu = new Menu();
			menu.mostrarMenu();
			
		} else if (resposta.equals("n")) {
			System.out.println("");
			System.out.println("Ok, tenha um bom dia!");
			
		} else {
			Menu menu = new Menu();
			menu.loopResposta();
		}
	
	}
	
	public void loopResposta() {
		System.out.println("ERROR! Resposta inválida!");
		System.out.println("");
		System.out.println("Gostaria de tentar novamente?");
		System.out.print("S / N: ");
		
		String resposta = reader.next();
		
		if (resposta.equals("s")) {
			Menu menu = new Menu();
			menu.mostrarMenu();
			
		} else if (resposta.equals("n")) {
			System.out.println("");
			System.out.println("Ok, tenha um bom dia!");
			
		} else {
			Menu menu = new Menu();
			menu.loopResposta();
		}
		
	}
}