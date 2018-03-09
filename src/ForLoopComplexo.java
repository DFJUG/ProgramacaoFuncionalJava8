import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by leonardo.segala on 08/03/2018.
 */
public class ForLoopComplexo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		//Forma 2
		for (Integer e:	numbers) {
			System.out.println(e);
		}

		//Forma 3
		numbers.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer e) {
				System.out.println(e);
			}
		});
	}
}
