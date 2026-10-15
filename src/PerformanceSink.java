import java.util.Arrays;

public class PerformanceSink extends Thread {
	PerformanceSink[] hole;
	public void run () {
		for (int pt = 0; pt < 10; pt++) {
			makeHoleBigger();
		}
	}
	
	void makeHoleBigger () {
		int ol = hole.length;
		hole = Arrays.copyOf(hole, hole.length + 1);
		hole[ol] = new PerformanceSink();
	}
}
