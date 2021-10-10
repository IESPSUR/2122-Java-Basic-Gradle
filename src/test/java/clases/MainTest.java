/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package clases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Esta clase esta preparada para testear el programa main principal de un proyecto
 * interceptando y suplantando tando la entrada como la salida estandar teclado
 * y pantalla
 * @author eserrano
 *
 */
@TestMethodOrder(MethodName.class)
class MainTest extends TestBase{
		
	@Test
	@DisplayName("Compilación")
	/**
	 * Compila y se pueden establecer reglas basicas,
	 * Por ejemplo impedir la importación de ciertas clases 
	 */
	void test00RequisitosBasicos() {
		assertTrue(true);
	}
	
	@Test
	@DisplayName("Hola Mundo")
	/**
	 * toString
	 */
	void test01() {
		//InputStream salida = new ByteArrayInputStream(outputStreamCaptor.toByteArray());
		//Scanner lectorSalida = new Scanner(salida);
		Main.main(null);
		assertEquals("Hola Mundo", outputStreamCaptor.toString().trim()/*lectorSalida.nextLine()*/);
		//lectorSalida.close();
	}

}