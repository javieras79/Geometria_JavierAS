package geometria.src;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)

public class TestCirculo {

	private double radio;
	private String tipoFigura;
	//static final double PI = 3.1416;
	private Circulo_JAS circulo;
	
	@Before
	public void inicio(){
		circulo = new Circulo_JAS(radio,tipoFigura);
	}
	
	@After
	public void fin(){
		circulo = null;
	}
	
	
	public TestCirculo(double radio,String tipoFigura)
	{
		this.radio = radio;
		this.tipoFigura = tipoFigura;
	}
	
	@Parameters
	public static Collection<Object[]> pruebasCirculo(){
		return Arrays.asList(new Object[][] {{7,"tipoFigura"}});
	}
	
	@Test
	public void testArea_JAS() {
		
		double resultado = circulo.area();
		assertEquals(153,93,resultado);
	}
	
	@Test
	public void testPerimetro() {
		
		double resultado = circulo.perimetro();	
		//System.out.print("" + resultado);
		assertEquals(43,9,resultado);
	}

}
