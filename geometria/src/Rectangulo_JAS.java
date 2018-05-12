package geometria.src;
/**
 * 
 * @author Javier Aznar Serna
 * @version 1.1
 */
public class Rectangulo_JAS extends FiguraGeometrica_JAS {
	private double l1;
	private double l2;
	
	public Rectangulo_JAS(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	/**
	 * Método que multiplica lado1 y lado2
	 * @param l1
	 * @param l2
	 * @return double
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * Método que multiplica lado1 y lado2 por dos y se suman ambos resultados
	 * @param l1
	 * @param l2
	 * @return double	
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
