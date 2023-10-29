package calculadora;

/**
 * A classe main_calculadora é a classe de ponto de entrada da aplicação da calculadora.
 * Ela demonstra o uso das funções da classe funcoes_calculadora para realizar operações matemáticas
 * e imprimir os resultados no console.
 *
 * @author Thalles Rodrigues
 * @version 1.05
 * @since Release 1.05 da aplicação
 */
public class main_calculadora {
    public static void main(String[] args) {
        funcoes_calculadora calc = new funcoes_calculadora();

        System.out.println("Soma:");

        // Teste 1: Somando dois valores positivos
        int somar = calc.somar(5, 2);
        System.out.println("Soma: " + somar);

        // Teste 2: Somando um valor positivo e um negativo
        somar = calc.somar(-5, 2);
        System.out.println("Soma: " + somar);

        // Teste 3: Somando dois valores negativos
        somar = calc.somar(-5, -2);
        System.out.println("Soma: " + somar);

        // Teste 4: Somando um valor positivo e zero
        somar = calc.somar(0, 2);
        System.out.println("Soma: " + somar);

        // Teste 5: Somando zeros
        somar = calc.somar(0, 0);
        System.out.println("Soma: " + somar);

        System.out.println("------------------");

        System.out.println("Subtração:");

        // Teste 1: Subtraindo dois valores positivos
        int subtrair = calc.subtrair(5, 2);
        System.out.println("Subtração: " + subtrair);

        // Teste 2: Subtraindo um valor positivo e um negativo
        subtrair = calc.subtrair(-5, 2);
        System.out.println("Subtração: " + subtrair);

        // Teste 3: Subtraindo dois valores negativos
        subtrair = calc.subtrair(-5, -2);
        System.out.println("Subtração: " + subtrair);

        // Teste 4: Subtraindo um valor positivo e zero
        subtrair = calc.subtrair(0, 2);
        System.out.println("Subtração: " + subtrair);

        // Teste 5: Subtraindo zeros
        subtrair = calc.subtrair(0, 0);
        System.out.println("Subtração: " + subtrair);

        System.out.println("------------------");

        System.out.println("Multiplicação:");

        // Teste 1: Multiplicando dois valores positivos
        int multiplicar = calc.multiplicar(5, 2);
        System.out.println("Multiplicação: " + multiplicar);

        // Teste 2: Multiplicando um valor positivo e um negativo
        multiplicar = calc.multiplicar(-5, 2);
        System.out.println("Multiplicação: " + multiplicar);

        // Teste 3: Multiplicando dois valores negativos
        multiplicar = calc.multiplicar(-5, -2);
        System.out.println("Multiplicação: " + multiplicar);

        // Teste 4: Multiplicando um valor positivo e zero
        multiplicar = calc.multiplicar(0, 2);
        System.out.println("Multiplicação: " + multiplicar);

        // Teste 5: Multiplicando zeros
        multiplicar = calc.multiplicar(0, 0);
        System.out.println("Multiplicação: " + multiplicar);

        System.out.println("------------------");

        System.out.println("Divisão:");

        // Teste 1: Dividindo dois valores positivos
        int dividir = calc.dividir(5, 2);
        System.out.println("Divisão: " + dividir);

        // Teste 2: Dividindo um valor positivo e um negativo
        dividir = calc.dividir(-5, 2);
        System.out.println("Divisão: " + dividir);

        // Teste 3: Dividindo dois valores negativos
        dividir = calc.dividir(-5, -2);
        System.out.println("Divisão: " + dividir);

        // Teste 4: Tentativa de divisão por zero (comentado)
        // dividir = calc.dividir(2, 0);
        // System.out.println("Divisão: " + dividir);

        // Teste 5: Dividindo zero por um número positivo
        dividir = calc.dividir(0, 2);
        System.out.println("Divisão: " + dividir);
    }
}
