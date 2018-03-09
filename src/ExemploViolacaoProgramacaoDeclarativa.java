import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by leonardo.segala on 08/03/2018.
 */
public class ExemploViolacaoProgramacaoDeclarativa {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3);

		//violação: como essa variável será usada dentro da expressão lambda, logo ela precisaria ser imutável
		int[] factor = new int[]{2};

		Stream<Integer> strm = numbers.stream()
				.map(e -> e * factor[0]);

		//modificando o valor da variável que está sendo usada dentro da expressão lambda
		//funções puras:
		//* não mudam nada
		//* não dependem de nada que pode mudar
		factor[0] = 0;

		//resultado diferente do esperado
		strm.forEach(System.out::println);
	}
}
