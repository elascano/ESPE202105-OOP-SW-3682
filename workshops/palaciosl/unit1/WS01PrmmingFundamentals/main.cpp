//worshop_01
#include <iostream>
#define dim 5
#include <stdio.h>
void ingresar(int x[dim]){
    for(int i=0;i<dim;i++){
        printf("Enter a number [%i]: ",i+1);
        scanf("%i",&x[i]);
    }
}
void ingresar2(float x[3]){
    for(int i=0;i<3;i++){
        printf("\nEnter a number [%i]: ",i+1);
        scanf("%f",&x[i]);
    }
}


void sumar(int x[dim]){
    int sum=0;
    for(int i=0;i<dim;i++){
        sum+=x[i];
    }
    printf("\nSuma is: %d",sum);
}
float average(float x[3]){
    float averg=0;
    for(int i=0;i<3;i++){
        averg+=x[i];
    }
    averg=averg/3;
    printf("\nAverage is: %f",averg);
}
void serchf(int x[7]){
    int sn,e=0,i=0;
    printf("\nEnter the number you are looking for: ");
    scanf("%i",&sn);
    while(e==0&&i<7){
        if (sn==x[i])
            e=1;
        i++;
    }
    if (e==1)
        printf("\nThe number is on the list");
    else
        printf("\nThe number is not on the list");
}

int main(){
    int x1[dim];
    int x3[7]={12,23,34,98,87,65,0};
    float x2[3];
    ingresar(x1);
    sumar(x1);
    ingresar2(x2);
    average(x2);
    serchf(x3);
    return 0;
}
