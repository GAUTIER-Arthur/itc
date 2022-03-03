import static org.junit.jupiter.api.Assertions.*;


import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class CalculsTest2 {

	// Données multiply
    static Stream<Arguments> testValueMultiply() throws Throwable 
    {
        return Stream.of(
            Arguments.of(2,2,4), // appellera : testMultiplier(2,2,4)
            Arguments.of(6,6,36),
            Arguments.of(3,2,6)
        );
    }

	@ParameterizedTest(name="Multiplication numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("testValueMultiply")
	void testMultiplier(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.multiplier(), "test en échec pour " + firstNumber + " * " + secondNumber + " != " + expectedResult); 

	    // Partie indépendante (les paramètres peuvent ne servir qu'à une sous partie des tests)
	        String n = null;
	        assertNull(n);
	}
	
	// Données add
    static Stream<Arguments> testValueAdd() throws Throwable 
    {
        return Stream.of(
            Arguments.of(2,2,4), // appellera : testMultiplier(2,2,4)
            Arguments.of(6,6,12),
            Arguments.of(3,2,5)
        );
    }

@ParameterizedTest(name="Addition numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("testValueAdd")
	void testAdditioner(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.additioner(), "test en échec pour " + firstNumber + " * " + secondNumber + " != " + expectedResult); 

	    // Partie indépendante (les paramètres peuvent ne servir qu'à une sous partie des tests)
	        String n = null;
	        assertNull(n);
	}

	//Données subtract
	static Stream<Arguments> testValueSubtract() throws Throwable 
	{
	    return Stream.of(
	        Arguments.of(2,2,0), // appellera : testMultiplier(2,2,4)
	        Arguments.of(6,6,0),
	        Arguments.of(3,2,1)
	    );
	}
	
	@ParameterizedTest(name="Soustraction numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("testValueSubtract")
	void testSoustraire(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.soustraire(), "test en échec pour " + firstNumber + " * " + secondNumber + " != " + expectedResult); 
	
	    // Partie indépendante (les paramètres peuvent ne servir qu'à une sous partie des tests)
	        String n = null;
	        assertNull(n);
	}
	
	//Données divide
		static Stream<Arguments> testValueDivide() throws Throwable 
		{
		    return Stream.of(
		        Arguments.of(2,2,1), // appellera : testMultiplier(2,2,4)
		        Arguments.of(6,6,1),
		        Arguments.of(3,2,1.5)
		    );
		}
		
		@ParameterizedTest(name="Division numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
		@MethodSource("testValueDivide")
		void testDiviser(int firstNumber, int secondNumber, int expectedResult) 
		{
			// Partie paramétrée
		        Calculs monCal = new Calculs(firstNumber, secondNumber);
		        assertEquals(expectedResult, monCal.diviser(), "test en échec pour " + firstNumber + " * " + secondNumber + " != " + expectedResult); 
		
		    // Partie indépendante (les paramètres peuvent ne servir qu'à une sous partie des tests)
		        String n = null;
		        assertNull(n);
		}

}
