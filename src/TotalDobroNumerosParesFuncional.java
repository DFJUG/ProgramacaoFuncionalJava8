import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by leonardo.segala on 08/03/2018.
 */
public class TotalDobroNumerosParesFuncional {
	public static void main(String[] args) {
		System.out.println(IntStream.rangeClosed(1,10)
			.filter(e -> e % 2 == 0)
			.map(e -> e * 2)
			.sum());
	}
}
