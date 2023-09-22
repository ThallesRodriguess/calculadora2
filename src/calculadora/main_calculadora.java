package calculadora;

public class main_calculadora {
public static void main(String []args){
	funcoes_calculadora calc = new funcoes_calculadora();
	
	System.out.println("Soma:");
	// Teste 1 somando dois valores positivos
	int somar = calc.somar(5, 2);
	System.out.println("Soma: "+ somar);
	
	
	// Teste 2 somando um valor positivo e um negativo
	somar = calc.somar(-5, 2);
	System.out.println("Soma: "+ somar);
	
	
	// Teste 3 somando dois valores negativos
	somar = calc.somar(-5, -2);
	System.out.println("Soma: "+ somar);
	

	// Teste 4 somando um valor positivo e zero
	somar = calc.somar(0, 2);
	System.out.println("Soma: "+ somar);
	
	
	// Teste 5 somando zeros
	somar = calc.somar(0, 0);
	System.out.println("Soma: " + somar);
	
	System.out.println("------------------");
	
	System.out.println("Subtração:");
	// Teste 1 subtraindo dois valores positivos
	int subtrair = calc.subtrair(5, 2);
	System.out.println("Subtração: "+ subtrair);
	
	
	// Teste 2 subtraindo um valor positivo e um negativo
	subtrair = calc.subtrair(-5, 2);
	System.out.println("Subtração: "+ subtrair);
	
	
	// Teste 3 subtraindo dois valores negativos
	subtrair = calc.subtrair(-5, -2);
	System.out.println("Subtração: "+ subtrair);
	
	
	// Teste 4 subtraindo um valor positivo e zero
	subtrair = calc.subtrair(0, 2);
	System.out.println("Subtração: "+ subtrair);
	

	// Teste 5 subtraindo zeros
	subtrair = calc.subtrair(0, 0);
	System.out.println("Subtração: " + subtrair);
	
System.out.println("------------------");
	
	System.out.println("Multiplição:");
	// Teste 1 multiplicando dois valores positivos
	int multiplicar = calc.multiplicar(5, 2);
	System.out.println("Multiplição: "+ multiplicar);
	
	
	// Teste 2 multiplicando um valor positivo e um negativo
	multiplicar = calc.multiplicar(-5, 2);
	System.out.println("Multiplição: "+ multiplicar);
	
	
	// Teste 3 multiplicando dois valores negativos
	multiplicar = calc.multiplicar(-5, -2);
	System.out.println("Multiplição: "+ multiplicar);
	
	
	// Teste 4 multiplicando um valor positivo e zero
	multiplicar = calc.multiplicar(0, 2);
	System.out.println("Multiplição: "+ multiplicar);
	
	
	// Teste 5 multiplicando zeros
	multiplicar = calc.multiplicar(0, 0);
	System.out.println("Multiplição: " + multiplicar);
	
System.out.println("------------------");
	
	System.out.println("Divisão:");
	// Teste 1 dividindo dois valores positivos
	int dividir = calc.dividir(5, 2);
	System.out.println("Divisão: "+ dividir);
	
	
	// Teste 2 dividindo um valor positivo e um negativo
	dividir = calc.dividir(-5, 2);
	System.out.println("Divisão: "+ dividir);
	

	// Teste 3 dividindo dois valores negativos
	dividir = calc.dividir(-5, -2);
	System.out.println("Divisão: "+ dividir);
	
	
	// Teste 4 dividindo um valor positivo e zero
	//dividir = calc.dividir(2, 0);
	//System.out.println("Divisão: "+ dividir);
	// Não é possível essa divisão pois é impossível dividir por zero

	// Teste 5 dividindo zeros
	dividir = calc.dividir(0, 2);
	System.out.println("Divisão: " + dividir); 
	
	
}
}
