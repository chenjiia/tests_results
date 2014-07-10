public class implict {
	public static void main(String[] args) {
		P();
	}

	static void test(int SMax, int OMax) {
		//P();
	}

	static void P() {
		int S = 0;
		int O = 0;
		
		int SMax = 255;
		int OMax = 255;

		int OTemp = 0;
		int OCounter = 0;

		while (O <= OMax) {
			S = 0;
			while (S <= SMax) {
				// code start
				OTemp = 0;
				if (S == 0) {
					OTemp = 0;
				} else {
					if (S == 1) {
						OTemp = 1;
					} else {
						if (S == 2) {
							OTemp = 2;
						} else {
							if (S == 3) {
								OTemp = 3;
							} else {
								if (S == 4) {
									OTemp = 4;
								} else {
									if (S == 5) {
										OTemp = 5;
									} else {
										if (S == 6) {
											OTemp = 6;
										}
									}
								}
							}
						}
					}
				}
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

		if (OCounter == 7) {
			System.out.println(OCounter);
		}

	}

}
