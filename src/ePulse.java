
public class ePulse {
	public static void main(String[] args){
		test();
	}
	
	static void test(){
		P();
	}
	
	static void P(){
		int S = 0;
		int O = 0;
		
		int SMax=19;
		int OMax=19;

		int STemp = 0;
		int OTemp = 0;
		int OCounter = 0;

		while(O <= OMax){
			S = 0;
			while(S <= SMax){
				//code start
				OTemp = 0;
				STemp = S;
				while(STemp >= 5){
					STemp = STemp - 5;
					OTemp = OTemp + 1;
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
