package ar.edu.unlam.pb2.disco;

import org.junit.Assert;
import org.junit.Test;


public class TestDisco {
	@Test
	public void testQueCalculaElRadioExteriorDelDisco() {
		Disco discoUno = new Disco(5.0,3.0);
		
		Double rExteriorActual = discoUno.radioExterior();
		Double rExteriorEsperado = 2.5;
		
		Assert.assertEquals(rExteriorEsperado, rExteriorActual,0.01);
	}
	@Test
	public void testQueCalculaElRadioInteriorDelDisco() {
		Disco discoUno = new Disco(5.0,3.0);
		
		Double rInteriorActual = discoUno.radioInterior();
		Double rInteriorEsperado = 1.5;
		
		Assert.assertEquals(rInteriorEsperado, rInteriorActual,0.01);
	}
	@Test
	public void testQueCalcularElPerimetroExteriorDelDisco() {
		Disco discoUno = new Disco(5.0,3.0);
		
		Double pExteriorActual = discoUno.perimetroExterior();
		Double pExteriorEsperado = 15.70796327;
		
		Assert.assertEquals(pExteriorEsperado, pExteriorActual,0.01);
		
	}
	@Test
	public void testQueCalcularElPerimetroInteriorDelDisco() {
		Disco discoUno = new Disco(5.0,3.0);
		
		Double pInteriorActual = discoUno.perimetroInterior();
		Double pInteriorEsperado = 9.42477796076938;
		
		Assert.assertEquals(pInteriorEsperado, pInteriorActual,0.01);
		
	}
	@Test
	public void testQueCompruebaLaSuperficieDelDisco() {
		Disco discoUno = new Disco(5.0,3.0);
		
		Double superficieActual = discoUno.superficie();
		Double superficieEsperada = 25.13274123;
		
		Assert.assertEquals(superficieEsperada, superficieActual,0.001);
		
	}
}
