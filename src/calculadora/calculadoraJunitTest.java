package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class calculadoraJunitTest {
	funcoes_calculadora calc = new funcoes_calculadora();
	@SuppressWarnings("deprecation")
	@Test
	
	// ================================================
public void somadoisnumerospositivos() {
	
	int somar = calc.somar(5, 2);
	
	Assert.assertEquals(10, somar); // está dando o resultado errado pois o resultado esperado é 7
	// ================================================
}
	public void somaumnumeropositivoeumnegativo() {
		
	int somar = calc.somar(-5, 2);
	
	Assert.assertEquals(12, somar); // está dando o resultado errado pois o resultado esperado é -3
	
}
	public void somadoisnumerosnegativos() {
		
	int somar = calc.somar(-5, -2);
		
	Assert.assertEquals(8, somar); // está dando o resultado errado pois o resultado esperado é -7
	
}
	public void somadezeroenumeropositivo() {
		
	int somar = calc.somar(0, 2);
			
	Assert.assertEquals(3, somar); // está dando o resultado errado pois o resultado esperado é 2
	
}
	public void somadezeros() {
		
	int somar = calc.somar(0, 0);
				
	Assert.assertEquals(1, somar); // está dando o resultado errado pois o resultado esperado é 0
	
	}
	
	public void subtracaodenumerospositivos() {
		
	int subtrair = calc.subtrair(5, 2);
					
	Assert.assertEquals(1, subtrair); // está dando o resultado errado pois o resultado esperado é 3
	
	}
	public void subtracaodeumnumeronegativoepositivo() {
		
	int subtrair = calc.subtrair(-5, 2);
						
	Assert.assertEquals(3, subtrair); // está dando o resultado errado pois o resultado esperado é -3
	
}
	public void subtracaodedoisnumerosnegativos() {
		
	int subtrair = calc.subtrair(-5, -2);
							
	Assert.assertEquals(8, subtrair); // está dando o resultado errado pois o resultado esperado é -8
	
}
	public void subtracaodezeroeumnumeropositivo() {
		
	int subtrair = calc.subtrair(0, 2);
								
	Assert.assertEquals(4, subtrair); // está dando o resultado errado pois o resultado esperado é -2
	
}
	public void subtracaodezeros() {
		
	int subtrair = calc.subtrair(0, 0);
									
	Assert.assertEquals(1, subtrair); // está dando o resultado errado pois o resultado esperado é 0
	
}
	public void multiplicacaodenumerospositivos() {
		
	int multiplicar = calc.multiplicar(5, 2);
										
	Assert.assertEquals(8, multiplicar); // está dando o resultado errado pois o resultado esperado é 10
		
	}
	public void multiplicacaodeumnumeronegativoepositivo() {
		
	int multiplicar = calc.multiplicar(-5, 2);
											
	Assert.assertEquals(8, multiplicar); // está dando o resultado errado pois o resultado esperado é -10
			
}
	public void multiplicacaodenumerosnegativos() {
		
	int multiplicar = calc.multiplicar(-5, -2);
												
	Assert.assertEquals(8, multiplicar); // está dando o resultado errado pois o resultado esperado é 10
				
	}
	public void multiplicacaodezeroeumnumeropositivo() {
		
	int multiplicar = calc.multiplicar(0, 2);
													
	Assert.assertEquals(4, multiplicar); // está dando o resultado errado pois o resultado esperado é 0
					
}
	public void multiplicacaodezeros() {
		
	int multiplicar = calc.multiplicar(0, 0);
														
	Assert.assertEquals(4, multiplicar); // está dando o resultado errado pois o resultado esperado é 0
						
	}
	public void divisaodenumerospositivos() {
		
	int dividir = calc.dividir(5, 2);
															
	Assert.assertEquals(4, dividir); // está dando o resultado errado pois o resultado esperado é 2.5
							
	}
	
	public void divisaodeumnumeronegativoepositivo() {
		
	int dividir = calc.dividir(-5, 2);
																
	Assert.assertEquals(4, dividir); // está dando o resultado errado pois o resultado esperado é -2.5
								
	}
	public void divisaodenumerosnegativos() {
		
	int dividir = calc.dividir(-5, -2);
																	
	Assert.assertEquals(4, dividir); // está dando o resultado errado pois o resultado esperado é 2.5
									
}
	public void divisaodezeroeumnumeropositivo() {
		
	int dividir = calc.dividir(0, 2);
																		
	Assert.assertEquals(4, dividir); // está dando o resultado errado pois o resultado esperado não existe e dá erro no programa
										
	}
	public void divisaodezeros() {
		
	int dividir = calc.dividir(0, 0);
																		
	Assert.assertEquals(1, dividir); // está dando o resultado errado pois o resultado esperado não existe e dá erro no programa
										
}
}