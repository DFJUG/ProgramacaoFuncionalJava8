import java.util.Arrays;
import java.util.List;

/**
 * Created by leonardo.segala on 09/03/2018.
 */
public class ExemploParalelismo {
	public static void main(String[] args) {
		//Imperativo: o quê e como.
		//Declarativo: o quê e não como
		//Funcional: Declarativo + funções de alta ordem

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		//encontre o total da raiz dos números pares

		//Imperativo:
		double result = 0;

		for(int e : numbers) {
			if(e % 2 == 0) {
				result += Math.sqrt(e);
			}
		}

		System.out.println(result);

		//Funcional utilizando paralelismo
		System.out.println(
				numbers.parallelStream()
						.filter(e -> e % 2 == 0) //functional (and declarative)
						.mapToDouble(Math::sqrt)  //functional (and declarative)
						.sum());
	}
}
