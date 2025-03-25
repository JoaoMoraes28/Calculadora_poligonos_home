package calculadora_poligonos_home.model;

public class Quadrado {

	private double lado;
	private double area;
	private double perimetro;
	
	public double setLado(double lado) {
		this.lado = lado;
		return lado;
	}
	
	public double setArea(double area) {
		this.area = area;
		return area;
	}
	
	public double setPerimetro(double perimetro) {
		this.perimetro = perimetro;
		return perimetro;
	}
	
	public double calcularArea() {
		area = Math.pow(lado, 2);
		return area;
	}
	
	public double calcularPerimetro() {
		perimetro = lado * 4;
		return perimetro;
	}
	
	public void mostrarDados() {
		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("DADOS DO QUADRADO");
		System.out.println("------------------------------");
		System.out.println("LADO: " + lado);
		System.out.println("AREA: " + calcularArea());
		System.out.println("PERÍMETRO: " + calcularPerimetro());
		System.out.println("------------------------------");
		System.out.println("");
	}
}
