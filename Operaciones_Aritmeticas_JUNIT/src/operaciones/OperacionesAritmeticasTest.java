package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperacionesAritmeticasTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
		
		OperacionesAritmeticas op = new OperacionesAritmeticas(0, 0);
		int esperado = 0;
		int obtenido = op.suma(); 
		
		System.out.println("Caso Prueba 1: Suma: a="+op.getA()+" + "+op.getB());
		assertEquals(esperado, obtenido);
		
		
		System.out.println("Caso Prueba 2: Suma");
		op.setA(-1);
		op.setB(-1);
		esperado = -2;
		obtenido = op.suma();
		assertEquals(esperado,obtenido);
		
		
		System.out.println("Caso Prueba 3: Suma");
		op.setA(2);
		op.setB(-1);
		esperado = 1;
		obtenido = op.suma();
		assertEquals(esperado,obtenido);
		
		System.out.println("Caso Prueba 4: Suma");
		op.setA(15);
		op.setB(23);
		esperado = 38;
		obtenido = op.suma();
		assertEquals(esperado,obtenido);
		
		System.out.println("Caso Prueba 5: Suma");
		op.setA(0);
		op.setB(20);
		esperado = 20;
		obtenido = op.suma();
		assertEquals(esperado,obtenido);
		
		
	}

	@Test
	void testResta() {
		

		OperacionesAritmeticas op = new OperacionesAritmeticas(0, 0);
		int esperado = 0;
		int obtenido = op.resta(); 
		
		System.out.println("Caso Prueba 1: Resta: a="+op.getA()+" - "+op.getB());
		assertEquals(esperado, obtenido);
		
		
		System.out.println("Caso Prueba 2: Resta");
		op.setA(-1);
		op.setB(-1);
		esperado = 0;
		obtenido = op.resta();
		assertEquals(esperado,obtenido);
		
		
		System.out.println("Caso Prueba 3: Suma");
		op.setA(2);
		op.setB(-1);
		esperado = 3;
		obtenido = op.resta();
		assertEquals(esperado,obtenido);
		
		System.out.println("Caso Prueba 4: Resta");
		op.setA(15);
		op.setB(23);
		esperado = -8;
		obtenido = op.resta();
		assertEquals(esperado,obtenido);
		
		System.out.println("Caso Prueba 5: Resta");
		op.setA(0);
		op.setB(20);
		esperado = -20;
		obtenido = op.resta();
		assertEquals(esperado,obtenido);
		
	}

	@Test
	void testProducto() {
		
		OperacionesAritmeticas op = new OperacionesAritmeticas(0, 0);
		int esperado = 0;
		int obtenido = op.producto(); 
		
		System.out.println("Caso Prueba 1: Multiplicacion: a="+op.getA()+" * "+op.getB());
		assertEquals(esperado, obtenido);
		
		
		System.out.println("Caso Prueba 2: Multiplicacion");
		op.setA(1);
		op.setB(1);
		esperado = 1;
		obtenido = op.producto();
		assertEquals(esperado,obtenido);
		
		
		System.out.println("Caso Prueba 3: Multiplicacion");
		op.setA(2);
		op.setB(0);
		esperado = 0;
		obtenido = op.producto();
		assertEquals(esperado,obtenido);
		
		System.out.println("Caso Prueba 4: Multiplicacion");
		op.setA(5);
		op.setB(2);
		esperado = 10;
		obtenido = op.producto();
		assertEquals(esperado,obtenido);
		
		System.out.println("Caso Prueba 5: Multiplicacion");
		op.setA(10);
		op.setB(20);
		esperado = 200;
		obtenido = op.producto();
		assertEquals(esperado,obtenido);
		
	}

//	@Test
//	void testDivision() {
//		fail("Not yet implemented");
//	}
//
}
