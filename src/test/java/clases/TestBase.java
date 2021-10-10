package clases;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class TestBase {
	

	protected final PrintStream standardOut = System.out;
	protected final InputStream standardIn = System.in;
	protected final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@BeforeEach
	void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@AfterEach
	void tearDown() {
		System.setOut(standardOut);
		System.setIn(standardIn);
	}
	
	protected void setIn(String entrada) {
		System.setIn(new ByteArrayInputStream(entrada.getBytes()));
	}
	


	void println(Object message) {
		this.standardOut.println(message);
	}
	
	void print(Object message) {
		this.standardOut.print(message);
	}
	
}
