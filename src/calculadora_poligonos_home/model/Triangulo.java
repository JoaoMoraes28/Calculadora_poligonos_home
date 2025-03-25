package calculadora_poligonos_home.model;

public class Triangulo {

	private double base;
	private double altura;
	private double area;
	
	public double setBase(double base) {
		this.base = base;
		return base;
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
		area = (base * altura) / 2;
		return area;
	}
	
	public void mostrarDados() {
		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("DADOS DO TRIÂNGULO");
		System.out.println("------------------------------");
		System.out.println("BASE: " + base);
		System.out.println("ALTURA: " + altura);
		System.out.println("AREA: " + calcularArea());
		System.out.println("------------------------------");
		System.out.println("");
	}
	
}	
