#include <iostream>
#define dim 5

using namespace std;

void enternumbersum (int sum[dim]);
int sumnumber(int sum[dim]);
void enteraveragenumber (float average[3]);
float average(float average[3]);
void identifyarrangement(int boolean[7]);

void enternumbersum (int sum[dim]){
    int i;
    for (i=0; i<dim; i++){
        cout<<"\t Enter a Number "<<i+1<<" = ";
        cin>>sum[i];
    }
}

int sumnumber(int sum[dim]){

    int i;
    int answer1=0;
    for (i=0; i<dim; i++){

        answer1=answer1+sum[i];

    }
     cout<<"\n\t-- The sum of the numbers entered is = "<<answer1;
     cout<<"\n\n"<<endl;
}


void enteraveragenumber (float average[3]){
    int i;
    for (i=0; i<3; i++){

        cout<<"\t Enter a Number "<<i+1<<" = ";
        cin>>average[i];
    }

}

float average(float average[3]){
    int i;
    float answer2=0;
    for (i=0; i<3; i++){

        answer2=answer2+average[i];
    }
    answer2=answer2/3;

    cout<<""<<endl;
    cout<<"\n\t-- The average of the numbers entered is = "<<answer2;
    cout<<"\n"<<endl;
}

void identifyarrangement(int boolean[7]){
    int var1;
    int var2=0;
    int i=0;
    cout<<""<<endl;
    cout<<"\tEnter the number = "<<endl;
    cin>>var1;

    while (var2==0&&i<7){
        if (var1==boolean[i])
            var2=1;
        i++;

    }
    if(var2==1)
        cout<<"\n\tthe number is in the list\n"<<endl;
    else
        cout<<"\n\tthe number is not in the list\n"<<endl;

}


int main(){
    int sum[dim];
    float averag[3];
    int arreglo[7]={12,23,34,98,87,65,0};
    cout<<"\t ===================================== "<<endl;
    cout<<"\t UNIVERSITY OF THE ARMED FORCES - ESPE "<<endl;
    cout<<"\t ===================================== "<<endl;
    cout<<"\n"<<endl;
    enternumbersum (sum);
    sumnumber (sum);
    enteraveragenumber (averag);
    average(averag);
    identifyarrangement(arreglo);
    return 0;
}
