package calculadora_poligonos_home.model;

public class Retangulo {
	
	private double base;
	private double altura;
	private double area;
	private double perimetro;
	
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
	
	public double setPerimetro(double perimetro) {
		this.perimetro = perimetro;
		return perimetro;
	}
	
	public double calcularArea() {
		area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		perimetro = (base + altura) * 2;
		return perimetro;
	}
	
	public void mostrarDados() {
		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("DADOS DO RETÂNGULO");
		System.out.println("------------------------------");
		System.out.println("BASE: " + base);
		System.out.println("ALTURA: " + altura);
		System.out.println("AREA: " + calcularArea());
		System.out.println("PERÍMETRO: " + calcularPerimetro());
		System.out.println("------------------------------");
		System.out.println("");
	}
	
}
