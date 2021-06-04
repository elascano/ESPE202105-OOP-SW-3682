#include <iostream>
#include <math.h>
#include <conio.h>

int comparateArray(int n, int array[]){
	
	int i;
	int verify;
		
	for(i=0;i<7;i++) {
		
		if(n == array[i]) {
			verify = 1;
		}
		else
		{
			verify = 0;
		}
		
		return verify;
	}		
	
}

int main(int argc, char** argv) {
	int num[5];
	int sum=0;
	int i;
	float average[3];
	float mean=0;
	int array[]={12,23,34,98,87,65,0};
	int n;
	int stat;
	
	for(i=0;i<5;i++) {
		printf("Enter an integer that will belong to an array of five: ",i);
		scanf("%d",&num[i]);
		
		sum += num[i];
	}
	
	printf("The sum of their array is: %i\n",sum);
	
	for(i=0;i<3;i++){
		printf("Enter any number to belong to an array of three to calculate its average: ",i);
		scanf("%f",average[i]);
		
		mean += average[i];
	}
	
	mean = mean/3;
	
	printf("The mean of the array of three is: %f\n",mean);
	
	printf("Enter the integer you want to compare with the array: ");
	scanf("%d",&n);
	
	
	stat = comparateArray(n,array);
	
	printf("The result of comparing its value with the array is: %d\n,where 0=FALSE and 1=TRUE", stat);
	
	printf("\n Thank you for using my program :D ");
	return 0;
}
