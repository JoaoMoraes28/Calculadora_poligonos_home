package calculadora_poligonos_home.model;

public class Circunferencia {

	private double raio;
	private double area;
	private double perimetro;
	
	public double setRaio(double raio) {
		this.raio = raio;
		return raio;
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
		area = Math.PI * (Math.pow(raio, 2));
		return area;
	}
	
	public double calcularPerimetro() {
		perimetro = 2 * Math.PI * raio;
		return perimetro;
	}
	
	public void mostrarDados() {
		System.out.println("");
		System.out.println("------------------------------");
		System.out.println("DADOS DA CIRCUNFERÊNCIA");
		System.out.println("------------------------------");
		System.out.println("RAIO: " + raio);
		System.out.println("AREA: " + calcularArea());
		System.out.println("PERÍMETRO: " + calcularPerimetro());
		System.out.println("------------------------------");
		System.out.println("");
	}
}

