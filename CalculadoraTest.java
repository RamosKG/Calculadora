package Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.start.classe.Calculadora;

public class CalculadoraTest {

	private Calculadora calculadora = new Calculadora();
	private Calculadora calculadora2 = new Calculadora(123d, 333d);

	@After
	public void finaliza() {
		System.out.println("fim da execução do teste");
	}

	@Before
	public void init() {
		calculadora.setValor1(1d);
		Assert.assertTrue(1 == calculadora.getValor1());

		calculadora.setValor2(23d);
		Assert.assertTrue(23 == calculadora.getValor2());
	}

	@Test
	public void somaTest() {
		Assert.assertTrue(24 == calculadora.soma());
	}

	@Test
	public void subtracaoTest() {
		Assert.assertTrue(-22 == calculadora.subtracao());
	}

	@Test
	public void multiplicacaoTest() {
		Assert.assertTrue(23 == calculadora.multiplicacao());
	}

	@Test
	public void divisaoTest() {
		Assert.assertTrue(0.04 == calculadora.divisao());
	}

	@Test
	public void zerarTest() {
//		calculadora.zerar();
		Assert.assertTrue(0 == calculadora.getValor1());
		Assert.assertTrue(0 == calculadora.getValor2());
	}
}
