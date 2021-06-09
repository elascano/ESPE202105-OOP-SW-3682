#include <stdio.h>
#include <stdlib.h> 
#define dimsum 5
#define dimaverage 3 
#define dimsearch 7
void sum();
void average();
void search(int A_search[7]);

int main()
{
    int Array_search[]={12,23,34,98,87,65,0};
    sum();
    average();
    search(Array_search);

    return 0;
}
void sum()
{
    int Arraysum[dimsum];
    int total_amount=0;
    printf("insert five integer numbers: \n");
    for(int i=0;i<dimsum;i++){
        printf("\ninsert number %d:",i+1);
        scanf("%d", &Arraysum[i]);
        total_amount+=Arraysum[i];
    }
    printf("the total sum is: %d \n\n\n",total_amount);
}
void average()
{
    float Arrayaverage[dimaverage];
    float total=0;
    float average;
    printf("insert three numbers: \n");
    for(int i=0;i<dimaverage;i++){
        printf("\ninsert number %d:",i+1);
        scanf("%f", &Arrayaverage[i]);
        total+=Arrayaverage[i];
    }
    average=total/dimaverage;
    printf("the average is: %.2f \n\n\n",average);    
}
void search(int A_search[dimsearch])
{
    int number;
    int a=0;
    printf("\n enter the number you want to search in the array:");
    scanf("%d",&number);
    for(int i=0;i<dimsearch;i++)
    {
        if (A_search[i]==number)
        {
            a=1;
        }
    }
    if (a==1)
    {
        printf("\n the number exist on the list");
    }
    else
    {
         printf("\n the number dosen't exist on the list");
    }
}
