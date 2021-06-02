#include<iostream>
#include<conio.h>

using namespace std;
int main(){
	int numbers [5];
	int sum=0;

	cout <<"Ingrese 5 numeros: "<<endl;

	for(int index=0; index < 5; index++)
	{
    	cin>> numbers[index];
	}
	for(int i=0; i<5; i++){
     	sum += numbers[i];
	}
	cout<<"La suma de los elementos del arreeglo es: "<< sum<<endl;
	cout<<"-----------------------------------------------"<<endl;



	int valores[3];
	float media;

	cout <<"Ingrese 3 numeros: "<<endl;
	for(int index=0; index < 3; index++)
	{
    	cin>> numbers[index];
	}
	for(int i=0; i<3; i++){
    	media = numbers[i];
	}
	cout<<"-----------------------------------------------"<<endl;


	int a[]={12,23,34,98,87,65,0};
	int i, dato;
	char band = 'F';

	cout<<"Ingrese un valor: ";
	cin>>dato;

	i=0;
	while((band == 'F')&&(i<5)){
    	if(a[i]== dato){
        	band = 'V';
    	}
    	i++;
	}

	if(band == 'F'){
    	cout<<"El numero no se encuentra en el arreglo"<<endl;
	}
	else if(band == 'V'){
    	cout<<"El numero esta dentro del arreglo"<<i-1<<endl;
	}


	getch();
	return 0;
}