#include <stdio.h>

void main(){
int S = 0;
int O = 0;

int SMax = 63;
int OMax = 63;

int STemp = 0;
int OTemp = 0;
int OCounter = 0;

int base = 4;

while(O <= OMax){
	S = 0;
	while(S <= SMax){
		//code start
		OTemp = 0;
		STemp = S;
		printf("S is %d\n", STemp);
		if(STemp < 16){
			OTemp = base+ STemp;
		}
		else{
			OTemp = base;
		}
		//code end
		if(O == OTemp){
			OCounter = OCounter + 1;
			goto nextO;
		}
		if(S<SMax){
			S = S + 1;
		}else{
			goto nextO;
		}
	}
	nextO : if(O<OMax){
		O = O + 1;
	}else{
		goto assertBlock;
	}
}

assertBlock: if(OCounter == 16){
	printf("reached");
}
}