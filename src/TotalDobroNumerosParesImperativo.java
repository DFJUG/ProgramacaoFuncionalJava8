import java.util.Arrays;
import java.util.List;

/**
 * Created by leonardo.segala on 08/03/2018.
 */
public class TotalDobroNumerosParesImperativo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int result = 0;
		for(int e : numbers){
			if(e % 2 == 0){
				result += e * 2;
			}
		}
		System.out.println(result);
	}
}
