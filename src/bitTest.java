public class bitTest {
	public static void main(String[] args) {
		//test(63, 63);
		test2();
	}

	static void test2() {
		int OCounter = -7;
		OCounter = OCounter + 1;
		if(OCounter == -9){
			System.out.println(OCounter);
		}
	}
	
	static void test(int SMax, int OMax) {
		P(SMax, OMax);
	}
	
	static void P(int SMax, int OMax) {
		int S = 0;
		int O = 0;

		int OTemp = 0;
		int OCounter = 0;

		while (O <= OMax) {
			S = 0;
			while (S <= SMax) {
				// code start
				OTemp = S >> 2;
				// code end
				if (O == OTemp) {
					OCounter = OCounter + 1;
					break;
				}
				if (S < SMax)
					S = S + 1;
				else
					break;
			}
			if (O < OMax)
				O = O + 1;
			else
				break;
		}
		System.out.println(OCounter);

		if (OCounter == 16) {
			System.out.println(OCounter);
		}

	}

}
