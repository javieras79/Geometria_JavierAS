package geometria.src;

public class Circulo_JAS extends FiguraGeometrica_JAS {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_JAS(double r, String tipoFigura) {
		super(tipoFigura);
		if(r<0) {
			radio=(r*r)/2;
		}else {
		radio = r;
		}
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
