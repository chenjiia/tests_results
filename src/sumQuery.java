
public class sumQuery {
	public static void main(String[] args){
		test();
	}
	

	static void test(){
		P();
	}
	
	static int Pprime(int SMax, int O, int OCounter){
		int S1 = 0;
		int S2 = 0;
		int S3 = 0;
		int OTemp = 0;
		
		while(S1 <= SMax){
			S2 = 0;
			while(S2 <= SMax){
				S3 = 0;
				while(S3 <= SMax){
					OTemp = S1+S2+S3;
					
					if(O == OTemp){
						OCounter = OCounter + 1;
						return OCounter;
					}
					if(S3 < SMax)
						S3 = S3 + 1;
					else
						break;
				}
				if(S2 < SMax)
					S2 = S2 + 1;
				else
					break;
			}
			if(S1 < SMax)
				S1 = S1 + 1;
			else
				break;
		}
		return OCounter;
	}
	
	static void P(){
		int SMax = 9;
		int OMax = 28;
		
		int O = 0;

		int OCounter = 0;
		
		while(O <= OMax){
			OCounter = Pprime(SMax, O, OCounter);
			
			if(O < OMax)
				O = O + 1;
			else
				break;
		}
		
		System.out.println(OCounter);

		if(OCounter == 28){
			System.out.println(OCounter);
		}
		
	}

}
