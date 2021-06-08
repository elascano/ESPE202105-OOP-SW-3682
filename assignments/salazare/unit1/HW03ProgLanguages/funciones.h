#include <iostream>
using namespace std;

int menu()
{
	int opc;
	printf("\n**** Programming Fundamentals ****");
	printf("\n.Option 1");
	printf("\n.Option 2");
	printf("\n.Option 3");
	printf("\n0. Salir");
	printf("\nElija una opcion: ");
	scanf("%d",&opc); 
	return opc;
}

void addElements(int elements[5],int sum)
{

	 for(int i = 0; i < 5; i++)
    {
    	printf("Enter the element");
        cin >> elements[i];
	}
	
	for(int i=0;i<5;i++){
		sum+=elements[i];
	}
	
	printf("the sum of the elements is %d",sum);
}

void calculateAverage(float average[3],float prom,float summation)
{
	 for(int i = 0; i < 3; i++)
    {
    	printf("Enter the element");
        cin >> average[i];
	}
	
	for(int i=0;i<3;i++){
		summation+=average[i];
	}
		prom=summation/3;
	
	printf("the average of the elements is %f",prom);
}

int searchList(int list[], int n, int key)
{
int central, under, high;
int valueCentral;
printf("\nEnter the item you want to search: ");
scanf("%d",&key);
under = 0;
high = n-1;
while (under <= high)
{
central = (under + high)/2; 
valueCentral = list[central]; 
if (key == valueCentral)
return central; 
else if (key < valueCentral)
high = central -1; 
else
under = central + 1; 
}
return -1; 
}

