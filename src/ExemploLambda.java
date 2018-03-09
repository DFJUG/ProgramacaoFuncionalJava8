/**
 * Created by leonardo.segala on 08/03/2018.
 */
public class ExemploLambda {
	public static void main(String[] args) {
		/*Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("In another thread");
			}
		});*/
		Thread th = new Thread(() -> System.out.println("Im another thread"));
		th.start();
		System.out.println("In main");
	}
}
