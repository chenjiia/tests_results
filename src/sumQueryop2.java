public class sumQueryop2 {
	public static void main(String[] args) {
		test();
	}

	static void test() {
		P();
	}

	static void P() {
		int S1 = 0;
		int S2 = 0;
		int S3 = 0;
		
		int SMax = 9;

		int OMax = 0;

		int OTemp = 0;
		int OCounter = 0;

		// code start
		OTemp = S1+S2+S3;
		// code end

		OMax = OTemp;
		OCounter = 1;
		S3 = S3 + 1;

		while (S1 <= SMax) {
			S2=0;
			while (S2 <= SMax) {
				S3=0;
				while (S3 <= SMax) {
					OTemp = S1+S2+S3;
					if (OTemp > OMax) {
						OMax = OTemp;
						OCounter = OCounter + 1;
					}
					if (S3 < SMax)
						S3 = S3 + 1;
					else
						break;
				}
				if (S2 < SMax)
					S2 = S2 + 1;
				else
					break;
			}
			if (S1 < SMax)
				S1 = S1 + 1;
			else
				break;
		}

		if (OCounter == 28) {
			System.out.println(OCounter);
		}

	}

}
