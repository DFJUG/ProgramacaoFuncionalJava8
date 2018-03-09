/**
 * Created by leonardo.segala on 08/03/2018.
 */
public class ExemploFuncao {
	public static void main(String[] args) {
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("In another thread");
			}
		});
		th.start();
		System.out.println("In main");
	}
}
