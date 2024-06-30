package ejercicio2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestConversionTemperatura {
	
	@Test
    @CsvFileSource(files = "src/main/java/ejercicio2/datos.csv")
	@ParameterizedTest(name = "Con temperatura ({0}) sale ({1})")
    public void testConversion(double t,String from, String to, String expectedOutput) {
	 ConversionTemperatura ej2 = new ConversionTemperatura();
	 double numeroAux;
	 if (expectedOutput.equals("NaN")) numeroAux = Double.NaN;
	 else numeroAux = Double.parseDouble(expectedOutput);
        assertEquals(numeroAux, ej2.convertTemperature1(t, from, to), 0.000001);
    }

}
