public class binSearchop2 {
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
		int temp1=0;
		
		// code start		
		temp1 = OTemp + 512;
		if(temp1 <= STemp){
			OTemp = OTemp + 512;
		}
		temp1 = OTemp + 256;
		if(temp1 <= STemp){
			OTemp = OTemp + 256;
		}
		temp1 = OTemp + 128;
		if(temp1 <= STemp){
			OTemp = OTemp + 128;
		}
		temp1 = OTemp + 64;
		if(temp1 <= STemp){
			OTemp = OTemp + 64;
		}
		temp1 = OTemp + 32;
		if(temp1 <= STemp){
			OTemp = OTemp + 32;
		}
		// code end

		OMax = OTemp;
		OCounter = 1;
		S = S + 1;

		while (S <= SMax) {
			STemp = S;
			// code start			
			temp1 = OTemp + 512;
			if(temp1 <= STemp){
				OTemp = OTemp + 512;
			}
			temp1 = OTemp + 256;
			if(temp1 <= STemp){
				OTemp = OTemp + 256;
			}
			temp1 = OTemp + 128;
			if(temp1 <= STemp){
				OTemp = OTemp + 128;
			}
			temp1 = OTemp + 64;
			if(temp1 <= STemp){
				OTemp = OTemp + 64;
			}
			temp1 = OTemp + 32;
			if(temp1 <= STemp){
				OTemp = OTemp + 32;
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
		

		if (OCounter == 32) {
			System.out.println(OCounter);
		}

	}

}
