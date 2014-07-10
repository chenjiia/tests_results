
public class mixDuplicate {
	public static void main(String[] args){
		test();
	}
	
	static void test(){
		P();
	}
	
	static void P(){
		int S = 0;
		int O = 0;
		
		int SMax = 255;
		int OMax = 255;
		
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
				
				temp1 = STemp >> 4;
				temp2 = temp1 ^ STemp;
				OTemp = temp2 & 15;
				temp1 = OTemp << 4;
				OTemp = OTemp | temp1;

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
		//should be 4
		if(OCounter == 16){
			System.out.println(OCounter);
		}
	}

}
