
public class popCount {
	public static void main(String[] args){
		test(15, 15);
	}
	
	static void test(int SMax, int OMax){
		P(SMax, OMax);
	}
	
	static void P(int SMax, int OMax){
		int S = 0;
		int O = 0;

		int STemp = 0;
		int OTemp = 0;
		int OCounter = 0;

		int temp1,temp2;
		
		while(O <= OMax){
			S = 0;
			while(S <= SMax){
				//code start
				OTemp = 0;
				STemp = S;
				
				//STemp= (STemp&85) + ((STemp>>1)&85);
//				temp1 = STemp & 85;
//				temp2 = STemp >> 1;
//				temp2 = temp2 & 85;
//				STemp = temp1 + temp2;
//
//				//STemp= (STemp&51) + ((STemp>>2)&51);
//				temp1 = STemp & 51;
//				temp2 = STemp >> 2;
//				temp2 = temp2 & 51;
//				STemp = temp1 + temp2;
//
//				//STemp= (STemp + (STemp>>4))&15;
//				temp1 = STemp;
//				temp2 = STemp >> 4;
//				temp2 = temp1 + temp2;
//				OTemp = temp2 & 15;
				
				System.out.println("STemp" + STemp);

				temp1 = STemp & 5;
				temp2 = STemp >> 1;
				temp2 = temp2 & 5;
				STemp = temp1 + temp2;

//				//STemp= (STemp&51) + ((STemp>>2)&51);
//				temp1 = STemp & 3;
//				temp2 = STemp >> 2;
//				temp2 = temp2 & 3;
//				STemp = temp1 + temp2;

				//STemp= (STemp + (STemp>>4))&15;
				temp1 = STemp;
				temp2 = STemp >> 2;
				temp2 = temp1 + temp2;
				OTemp = temp2 & 3;
				System.out.println("OTemp" + OTemp);

				//code end
				if(O == OTemp){
					OCounter = OCounter + 1;
					break;
				}
				if(S < SMax)
					S = S + 1;
				else
					break;
			}
			if(O < OMax)
				O = O + 1;
			else
				break;
		}
		System.out.println(OCounter);

		if(OCounter == 5){
			System.out.println(OCounter);
		}
		
	}

}
