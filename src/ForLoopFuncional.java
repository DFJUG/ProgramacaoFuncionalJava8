import java.util.stream.IntStream;

/**
 * Created by leonardo.segala on 08/03/2018.
 */
public class ForLoopFuncional {
	public static void main(String[] args) {
		//Tipo explícito
		//Arrays.asList(1,2,3,4,5,6,7,8,9,10).forEach((Integer e) -> System.out.println(e));
		//Tipo inferido
		//Arrays.asList(1,2,3,4,5,6,7,8,9,10).forEach((e) -> System.out.println(e));
		//Arrays.asList(1,2,3,4,5,6,7,8,9,10).forEach(e -> System.out.println(e));
		//Method reference
		//Arrays.asList(1,2,3,4,5,6,7,8,9,10).forEach(System.out::println);
		IntStream.rangeClosed(1,10).forEach(System.out::println);
	}
}
