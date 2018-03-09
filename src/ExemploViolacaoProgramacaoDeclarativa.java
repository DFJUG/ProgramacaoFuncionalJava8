import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by leonardo.segala on 08/03/2018.
 */
public class ExemploViolacaoProgramacaoDeclarativa {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3);

		//viola��o: como essa vari�vel ser� usada dentro da express�o lambda, logo ela precisaria ser imut�vel
		int[] factor = new int[]{2};

		Stream<Integer> strm = numbers.stream()
				.map(e -> e * factor[0]);

		//modificando o valor da vari�vel que est� sendo usada dentro da express�o lambda
		//fun��es puras:
		//* n�o mudam nada
		//* n�o dependem de nada que pode mudar
		factor[0] = 0;

		//resultado diferente do esperado
		strm.forEach(System.out::println);
	}
}
