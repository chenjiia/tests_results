
public class binSearch {
	public static void main(String[] args){
		test();
	}
	
	static void test(){
		P();
	}
	
	static void P(){
		int S = 0;
		int O = 0;
		int SMax=255;
		int OMax=255;

		int STemp = 0;
		int OTemp = 0;
		int OCounter = 0;

		int temp1 = 0;

		while(O <= OMax){
			S = 0;
			while(S <= SMax){
				//code start
				OTemp = 0;
				STemp = S;
				
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
				temp1 = OTemp + 16;
				if(temp1 <= STemp){
					OTemp = OTemp + 16;
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
		if(OCounter == 16){
			System.out.println(OCounter);
		}
		
	}

}
