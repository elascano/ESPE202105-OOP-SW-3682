
#include <stdio.h>
#include <stdlib.h>

void initialize(int X[5]){
	for (int i=0;i<5;i++) 
		X[i]='a';
}
void sum(int X[5]){
	
	long int sum=0;
	
	for(int i=0;i<5;i++){
		if(X[i]!='a'){
		sum+=X[i];
		}
	}
	printf("The result of the sum is: %i",sum);
}
void entry1(int X[5]){
	
	int i;
	for (i=0;i<5;i++){
		printf ("Enter a number [%i]: ",i+1);
		scanf ("%i",&X[i]);
	}		
}
void entry2(int X[3]){
	
	for (int i=0;i<3;i++){
		printf ("Enter a number [%i]: ",i+1);
		scanf ("%i",&X[i]);
	}		
}
int entry3(int x){
	
	printf ("Enter a number: ");
	scanf ("%i",&x);
	
	return (x);	
}
void searcher(int x){
	
	int list[7]{12,23,34,98,87,65,0},aux;
	
	for(int i=0;i<7;i++){
		if(list[i]==x){
			aux=1;
			break;
		}else{
			aux=2;
		}
	}
	
	if (aux==1){
		printf("\nThe entered number %i is in the list",x);
	}else{
		printf("\nThe entered number %i is not in the list",x);
	}
}
void average(int X[3]){

	float count=0,sum=0,average;
	
	for(int i=0;i<3;i++){
		if(X[i]!='a'){
		sum +=X[i];
		++count;
		}
	}
	for(int i=0;i<3;i++){
		if(X[i]!='a'){
			average=sum/count;
			printf ("The average is: %lf",average);
			break;
		}else {
			printf ("There is no average");
			break;
		}
	}	
}
int main(){
	
	system("COLOR F0");
	int array1[5],array2[3],numbsearch,option;
	
	
	do{
		printf ("\n***********************************************************************************************************************\n");
		printf ("HW.02 Programming Fundamentals\n");
		printf ("Created by => Francisco Nicolas Suquillo Gavilanes");
		printf ("\n\n\n\n	   Choose                 \n");
		printf ("----------------------------------");
		printf ("\n1. Sum of numbers                |");
		printf ("\n2. Average of numbers            |");                           
		printf ("\n3. Search the number in the list |");
		printf ("\n4. Exit                          |");
		printf ("\n----------------------------------");
		printf ("\n\n***********************************************************************************************************************\n\n");
		printf ("Indicate what action you wish to perform: ");
		scanf ("%i",&option);
		switch (option){
			case 1: 
				system("cls");
				initialize(array1);
				entry1(array1);
				sum(array1);
				printf("\n\n");
				system("pause");
				system("cls");
			break;
			case 2:
				system("cls");
				initialize(array2);
				entry2(array2);
				average(array2);
				printf("\n\n");
				system("pause");
				system("cls");
			break;
			case 3:
				system("cls");
				searcher(entry3(numbsearch));
				printf("\n\n");
				system("pause");
				system("cls");
			break;
			case 4:
				exit(1);
			break;	
			default:
				system("cls");                                 
				printf ("\n\n\t\t\t\t\t------------------------------------------\n");
				printf("\t\t\t\t\t|=> The selected option does not exist <=|");
				printf ("\n\t\t\t\t\t------------------------------------------\n\n\n\n\n");
				system("pause");
				system("cls");
		}
	}while (option!=4);
	printf ("\n");
	system("pause");	
	
	return 0;
}


