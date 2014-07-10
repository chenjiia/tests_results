
public class randomOutputs {
	public static void main(String[] args){
		test(63,63);
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

		while(O <= OMax){
			S = 0;
			while(S <= SMax){
				//code start
				OTemp = 0;
				STemp = S;

				OTemp = 0;
				STemp = S;
				
				if(STemp == 4){
					OTemp = 4;
				}else{
					if(STemp == 2){
						OTemp = 2;
					}else{
						OTemp = 7;
					}
				}
				
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

		if(OCounter == 4){
			System.out.println(OCounter);
		}
		
	}

}
