#include <stdio.h>
void main(){
//8 bit ver
int S = 0;
int O = 0;

int SMax = 256;
int OMax = 256;

int STemp = 0;
int OTemp = 0;
int OCounter = 0;
int temp1 = 0;
int temp2 = 0;

while(O != OMax){
	S = 0;
	while(S != SMax){
		//code start
		OTemp = 0;
		STemp = S;
		
		//O = ((S>>4)^S)&0xf;
		temp1 = STemp >> 3;
		temp2 = temp1 ^ STemp;
		OTemp = temp2 & 7;
		temp1 = OTemp << 3;
		OTemp = OTemp | temp1;

		//code end
		if(O == OTemp){
			OCounter = OCounter + 1;
			goto break1;
		}
		S = S + 1;
	}
	break1 : O = O + 1;
}
printf("%d\n", OCounter);
if(OCounter == 8){
printf("reached\n");
}
}
