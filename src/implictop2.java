public class implictop2 {
	public static void main(String[] args) {
		test();
	}

	static void test() {
		P();
	}

	static void P() {
		int S = 0;
		int SMax = 127;

		int OMax = 0;

		int OTemp = 0;
		int OCounter = 0;

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

		OMax = OTemp;
		OCounter = 1;
		S = S + 1;

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
			if (OTemp > OMax) {
				OMax = OTemp;
				OCounter = OCounter + 1;
			}
			if (S < SMax)
				S = S + 1;
			else
				break;
		}

		if (OCounter == 7) {
			System.out.println(OCounter);
		}

	}

}
