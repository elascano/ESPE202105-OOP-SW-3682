
#include <stdio.h>
#include <conio.h>
#include <iostream>

using namespace std;


int array_3[]={12,23,34,98,87,65,0};

//FUNCTIONS DECLARATION

float  function_avarage(int n1, float []);
int function_sum(int n2, int []);

int main (){
    // VARIABLES DECLARATION
     int array3_quantity=7;
     int element;
     int i=0;

	int quantity=3;
	float grade=0;

	int members=5;
	int number=0;
//.............................................................
	 cout<<"EJERCISE 3. which element are you looking for: "<<endl;
	 cin>>element;
	 for(i=0;i<array3_quantity;i++)
        {
            if(array_3[i]==element)
            {
                cout<<"\n it was found in the position A["<<i<<"]"<<endl;
                }
                else
                    {
                        cout<<"\n it wasn´t found in the position A["<<i<<"]"<<endl;
                        }
                    }

	float array_grades[3];
	for(int i=0;i<3;i++){
		printf("\n EJERCISE 2.introduce your grade %d",i+1);
		printf(": " );
		scanf(" %f",&grade);
		array_grades[i]=grade;
	}
	printf("%.2f",function_avarage(quantity,array_grades ));

	int array_sum[5];
	for(int i=0;i<5;i++){
            printf ("\n EJERCISE 1.introduce your number %d ",i+1);
            printf(": ");
            scanf("%f",&number);
            array_sum[i]=number;
	}

    printf("%.2f",function_sum(members,array_sum ));

    int array_3[]={12,23,34,98,87,65,0};


	}



//FUNCTIONS

float function_avarage(int quantity, float array_grades[])
{
	float sum=0;
	float avarage1=0;
		for(int i=0;i<quantity;i++){
			sum=sum+array_grades[i];
		}
	avarage1=sum/quantity;
	return avarage1;
}

//..........................................................................

int function_sum (int number, int array_sum[])
{
    int sum=0;
    for(int i=0;i<number;i++){
			sum=sum+array_sum[i];
		}
    return sum;

}
//............................................................................
