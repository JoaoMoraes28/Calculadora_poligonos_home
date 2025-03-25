package calculadora_poligonos_home.model;

public class Trapezio {

	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double area;
	
	public double setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
		return baseMaior;
	}
	
	public double setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
		return baseMenor;
	}
	
	public double setAltura(double altura) {
		this.altura = altura;
		return altura;
	}
	
	public double setArea(double area) {
		this.area = area;
		return area;
	}
	
	public double calcularArea() {
		area = (baseMaior + baseMenor) * (altura / 2);
		return area;
	}
	
	public void mostrarDados() {
		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("DADOS DO TRAPÉZIO");
		System.out.println("------------------------------");
		System.out.println("BASE MAIOR: " + baseMaior);
		System.out.println("BASE MENOR: " + baseMenor);
		System.out.println("ALTURA: " + altura);
		System.out.println("AREA: " + calcularArea());
		System.out.println("------------------------------");
		System.out.println("");
	}
}
