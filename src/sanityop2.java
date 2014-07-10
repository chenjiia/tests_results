public class sanityop2 {
	public static void main(String[] args) {
		test();
	}

	static void test() {
		P();
	}

	static void P() {
		int S = 0;
		int SMax = 1023;

		int OMax = 0;

		int STemp = 0;
		int OTemp = 0;
		int OCounter = 0;

		int base = 4;

		// code start
		if (STemp < 16) {
			OTemp = base + STemp;
		} else {
			OTemp = base;
		}
		// code end

		OMax = OTemp;
		OCounter = 1;
		S = S + 1;

		while (S <= SMax) {
			// code start
			OTemp = 0;
			STemp = S;
			if (STemp < 16) {
				OTemp = base + STemp;
			} else {
				OTemp = base;
			}
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

		if (OCounter == 16) {
			System.out.println(OCounter);
		}

	}

}
