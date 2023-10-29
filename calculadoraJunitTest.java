package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

/**
 * Esta classe contém os testes JUnit para a classe funcoes_calculadora.
 * Ela verifica se as funções da calculadora retornam os resultados esperados.
 *
 * @author Thalles Rodrigues
 * @version 1.05
 * @since Release 1.02 da aplicação
 */
public class calculadoraJunitTest {
    funcoes_calculadora calc = new funcoes_calculadora();

    /**
     * Testa a função de somar dois números positivos.
     * 
     * 
     */
    @Test
    public void somadoisnumerospositivos() {
        int somar = calc.somar(5, 2);
        Assert.assertEquals(10, somar); // está dando o resultado errado pois o resultado esperado é 7
    }

    /**
     * Testa a função de somar um número positivo e um número negativo.
     */
    public void somaumnumeropositivoeumnegativo() {
        int somar = calc.somar(-5, 2);
        Assert.assertEquals(12, somar); // está dando o resultado errado pois o resultado esperado é -3
    }

    /**
     * Testa a função de somar dois números negativos.
     */
    public void somadoisnumerosnegativos() {
        int somar = calc.somar(-5, -2);
        Assert.assertEquals(8, somar); // está dando o resultado errado pois o resultado esperado é -7
    }

    /**
     * Testa a função de somar zero e um número positivo.
     */
    public void somadezeroenumeropositivo() {
        int somar = calc.somar(0, 2);
        Assert.assertEquals(3, somar); // está dando o resultado errado pois o resultado esperado é 2
    }

    /**
     * Testa a função de somar dois zeros.
     */
    public void somadezeros() {
        int somar = calc.somar(0, 0);
        Assert.assertEquals(1, somar); // está dando o resultado errado pois o resultado esperado é 0
    }

    /**
     * Testa a função de subtrair dois números positivos.
     */
    public void subtracaodenumerospositivos() {
        int subtrair = calc.subtrair(5, 2);
        Assert.assertEquals(1, subtrair); // está dando o resultado errado pois o resultado esperado é 3
    }

    /**
     * Testa a função de subtrair um número negativo e um número positivo.
     */
    public void subtracaodeumnumeronegativoepositivo() {
        int subtrair = calc.subtrair(-5, 2);
        Assert.assertEquals(3, subtrair); // está dando o resultado errado pois o resultado esperado é -3
    }

    /**
     * Testa a função de subtrair dois números negativos.
     */
    public void subtracaodedoisnumerosnegativos() {
        int subtrair = calc.subtrair(-5, -2);
        Assert.assertEquals(8, subtrair); // está dando o resultado errado pois o resultado esperado é -8
    }

    /**
     * Testa a função de subtrair zero e um número positivo.
     */
    public void subtracaodezeroeumnumeropositivo() {
        int subtrair = calc.subtrair(0, 2);
        Assert.assertEquals(4, subtrair); // está dando o resultado errado pois o resultado esperado é -2
    }

    /**
     * Testa a função de subtrair dois zeros.
     */
    public void subtracaodezeros() {
        int subtrair = calc.subtrair(0, 0);
        Assert.assertEquals(1, subtrair); // está dando o resultado errado pois o resultado esperado é 0
    }

    /**
     * Testa a função de multiplicar dois números positivos.
     */
    public void multiplicacaodenumerospositivos() {
        int multiplicar = calc.multiplicar(5, 2);
        Assert.assertEquals(8, multiplicar); // está dando o resultado errado pois o resultado esperado é 10
    }

    /**
     * Testa a função de multiplicar um número negativo e um número positivo.
     */
    public void multiplicacaodeumnumeronegativoepositivo() {
        int multiplicar = calc.multiplicar(-5, 2);
        Assert.assertEquals(8, multiplicar); // está dando o resultado errado pois o resultado esperado é -10
    }

    /**
     * Testa a função de multiplicar dois números negativos.
     */
    public void multiplicacaodenumerosnegativos() {
        int multiplicar = calc.multiplicar(-5, -2);
        Assert.assertEquals(8, multiplicar); // está dando o resultado errado pois o resultado esperado é 10
    }

    /**
     * Testa a função de multiplicar zero e um número positivo.
     */
    public void multiplicacaodezeroeumnumeropositivo() {
        int multiplicar = calc.multiplicar(0, 2);
        Assert.assertEquals(4, multiplicar); // está dando o resultado errado pois o resultado esperado é 0
    }

    /**
     * Testa a função de multiplicar dois zeros.
     */
    public void multiplicacaodezeros() {
        int multiplicar = calc.multiplicar(0, 0);
        Assert.assertEquals(4, multiplicar); // está dando o resultado errado pois o resultado esperado é 0
    }

    /**
     * Testa a função de dividir dois números positivos.
     */
    public void divisaodenumerospositivos() {
        int dividir = calc.dividir(5, 2);
        Assert.assertEquals(4, dividir); // está dando o resultado errado pois o resultado esperado é 2.5
    }

    /**
     * Testa a função de dividir um número negativo e um número positivo.
     */
    public void divisaodeumnumeronegativoepositivo() {
        int dividir = calc.dividir(-5, 2);
        Assert.assertEquals(4, dividir); // está dando o resultado errado pois o resultado esperado é -2.5
    }

    /**
     * Testa a função de dividir dois números negativos.
     */
    public void divisaodenumerosnegativos() {
        int dividir = calc.dividir(-5, -2);
        Assert.assertEquals(4, dividir); // está dando o resultado errado pois o resultado esperado é 2.5
    }

    /**
     * Testa a função de dividir zero e um número positivo.
     */
    public void divisaodezeroeumnumeropositivo() {
        int dividir = calc.dividir(0, 2);
        Assert.assertEquals(4, dividir); // está dando o resultado errado pois o resultado esperado não existe e dá erro no programa
    }

    /**
     * Testa a função de dividir dois zeros.
     */
    public void divisaodezeros() {
        int dividir = calc.dividir(0, 0);
        Assert.assertEquals(1, dividir); // está dando o resultado errado pois o resultado esperado não existe e dá erro no programa
    }
}
