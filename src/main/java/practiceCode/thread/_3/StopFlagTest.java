package practiceCode.thread._3;

public class StopFlagTest {

	public static void main(String[] args) {

		PrintThread1 printThread1 = new PrintThread1();
		printThread1.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		printThread1.setStop(true);
	}

}