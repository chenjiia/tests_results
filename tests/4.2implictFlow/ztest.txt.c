#include <stdio.h>

void main(){
int S = 0;
int O = 0;

int SMax = 128;
int OMax = 128;

int STemp = 0;
int OTemp = 0;
int OCounter = 0;

while(O != OMax){
	S = 0;
	while(S != SMax){
		//code start
		OTemp = 0;
		STemp = S;
		if(S == 0){
			OTemp = 0;
		}else{
			if(S == 1){
				OTemp = 1;
			}else{
				if(S == 2){
					OTemp = 2;
				}else{
					if(S == 3){
						OTemp = 3;
					}else{
						if(S == 4){
							OTemp = 4;
						}else{
							if(S == 5){
								OTemp = 5;
							}else{
								if(S == 6){
									OTemp = 6;
								}
							}
						}
					}
				}
			}
		}
		//code end
		if(O == OTemp){
			OCounter = OCounter + 1;
			goto break1;
		}
		S = S + 1;
	}
	break1 : O = O + 1;
}

if(OCounter == 7){
	printf("reached");
}
}