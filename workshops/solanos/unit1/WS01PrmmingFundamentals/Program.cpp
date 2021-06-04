#include<stdlib.h>
#include<iostream>
using namespace std;

int sum();
float average();
int search(int S_array[7]);

int main(){
	int S_array[]={12,23,34,98,87,65,0};
	sum();
	average();
	search(S_array);
	system("pause");
	return 0;
}

int sum(){
	int number[5];
	int sum=0;
	for(int i=0;i<5;i++){
		cout<<"Enter five numbers "<<i+1<<endl;
		cin>>number[i]; 
	}
	for(int i=0;i<5;i++){
		sum+=number[i];
	}
	cout<<"The sum of the numbers is:"<<sum<<endl;	
}

float average(){
	float average[3],sum=0,answer=0; 
	for(int i=0;i<3;i++){
		cout<<"Enter three numbers "<<i+1<<endl;
		cin>>average[i];
		sum+=average[i];
	}
	answer=sum/3;
	cout<<"His average is:"<<answer<<endl;
}

int search(int S_array[7]){
	int element=0,i=0;
	char band='F';
	cout<<"Enter search number"<<endl;
	cin>>element;
	while((band=='F')&&(i<7)){
		if(S_array[i]==element){
			band ='V';
		}
		i++;
	}
	if(band=='F'){
		cout<<"The element doesn't in the array"<<endl;
	}
	else{
		cout<<"The element is found in the position "<<i<<endl;
	}
}
