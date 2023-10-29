package calculadora;

/**
 * A classe funcoes_calculadora contém métodos que realizam operações matemáticas básicas.
 * Ela inclui funções para somar, subtrair, multiplicar e dividir números inteiros.
 *
 * @author Thalles Rodrigues
 * @version 1.05
 * @since Release 1.02 da aplicação
 */
public class funcoes_calculadora {
    /**
     * Realiza a operação de adição entre dois números inteiros.
     *
     * @param a O primeiro número inteiro.
     * @param b O segundo número inteiro.
     * @return O resultado da adição dos números a e b.
     */
    public static int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a operação de subtração entre dois números inteiros.
     *
     * @param a O número inteiro do qual será subtraído.
     * @param b O número inteiro a ser subtraído de a.
     * @return O resultado da subtração de b a partir de a.
     */
    public static int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a operação de multiplicação entre dois números inteiros.
     *
     * @param a O primeiro número inteiro.
     * @param b O segundo número inteiro.
     * @return O resultado da multiplicação dos números a e b.
     */
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a operação de divisão entre dois números inteiros.
     *
     * @param a O dividendo (número que será dividido).
     * @param b O divisor (número pelo qual a será dividido).
     * @return O resultado da divisão de a por b.
     * @throws ArithmeticException Se a tentativa de divisão por zero for detectada.
     */
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Tentativa de divisão por zero.");
        }
        return a / b;
    }
}
