public class maskedCopyop2 {
	public static void main(String[] args) {
		test();
	}

	static void test() {
		P();
	}

	static void P() {
		int S = 0;
		int SMax = 1023;
		
		int STemp = S;
		int OMax = 0;

		int OTemp = 0;
		int OCounter = 0;
		
		// code start		
		OTemp = STemp & 992;
		// code end

		OMax = OTemp;
		OCounter = 1;
		S = S + 1;

		while (S <= SMax) {
			STemp = S;
			// code start			
			OTemp = STemp & 992;
			// code end
			if (OTemp > OMax) {
				OMax = OTemp;
				OCounter = OCounter + 1;
			}
			if (S < SMax)
				S = S + 1;
			else
				break;
		}
		

		if (OCounter == 32) {
			System.out.println(OCounter);
		}

	}

}
