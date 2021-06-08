#include <iostream>
#include "funciones.h"
using namespace std;
/* Name: Salazar Matthew  
Programming Fundamentals
 */

int main(int argc, char** argv) {
	
	int elements[5],sum=0,opc,key,position,n,under, high;
	int list[] = {12,23,34,98,87,65,0};
	float average[3],prom,summation;
	
	do{
	system("cls");
	opc=menu();
	switch(opc){
		
		case 1:{
			addElements(elements,sum);
			break;
		}
		case 2:{
			calculateAverage(average,prom,summation);
			break;
		}
		case 3:{
				position = searchList(list,n,key);
				if( position!= -1)
				printf("\nFound!\n");
				else printf("\nNo Found!\n");	
			break;
		}
		case 0:{
			
			break;
		}
		default:{
			printf("\nOpcion incorrecta.\n");
			break;
		}		
	}
	system("pause");
	}while(opc!=0);
	
	
	return 0;
}
