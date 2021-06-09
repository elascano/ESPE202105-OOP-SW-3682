#include <stdio.h>
#include <iostream>


void searchElement(int array[], int size_Array, int element_Search);
int  sum_Elements(int array[],int size_Array);
float average_Elements(float array[],int size_Array);

int main()
{
    int n=5; //Numero de elemntos
    int i; 
    int element_Search;
    int array[n]; 
    int array_Search[]={12,23,34,98,87,65,0};
	float array_Average[n];
    	for(i=0; i<n; i++)
    	{
   	     	printf("Enter element %d of the first array(only int): ", (i+1) );
        	scanf("%d",&array[i]);
    	}
    	printf("\n\n");
    	printf("The total sum of the elements of the array is : %d",sum_Elements(array,n));
		printf("\n\n");
		for(i=0; i<3; i++)
    	{
   	     	printf("Enter element %d of the second array(float and int): ", (i+1) );
        	scanf("%f",&array_Average[i]);
    	}
    	printf("The average of the elements of the second array is : %f",average_Elements(array_Average,3));
    		printf("\n\n");
    	printf("Enter the element to search for in the array {12,23,34,98,87,65,0} :");
    	scanf("%d",&element_Search);
	
    	searchElement(array_Search,7, element_Search);

    	printf("\n");
	
	    system("pause");
    	return 0;
}

void searchElement(int array[], int size_Array, int element_Search)
{
    int j;
    int b = 0;
    int hold1,hold2;
    int cont = -1;


        for(j=0; j<size_Array; j++)
        {
            if(element_Search == array[j])
            {
                hold1 = array[j];
                hold2 = j;
                b = 1;
            }
        }


    if(b==1)
    {
    printf("The element found is %d and its position is %d.\n",hold1,hold2+1);
    }
    else
    {
        printf("Element not found.\n");
    }
}

int sum_Elements(int array[],int size_Array)
{
    int j;
    int sum=0;
    	
    	for(j=0; j<size_Array; j++)
		{
    	sum=array[j]+sum;	
		}
	return sum;
}
float average_Elements(float array[],int size_Array)
{
	int j;
	float total=0;
	float sum=0.0;
		
		for(j=0; j<size_Array; j++)
		{
    	sum=array[j]+sum;	
		}
		total=sum/size_Array;
	return sum/(float)size_Array;
}

