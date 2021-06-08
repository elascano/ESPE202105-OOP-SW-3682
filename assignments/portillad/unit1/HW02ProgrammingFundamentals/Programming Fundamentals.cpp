#include <stdio.h>
#include <stdlib.h>
#include <iostream>
using namespace std;

int arraysumof5numbers(int array[],int sum);
float averagegrades(float notes[], float prom);
void numbersearch(int arraynumer[], int seach);

int main(){
    int selection;
    int arraynumer[5];
    int resp;
    int soluccion;
    float soluccionprom;
    float arraynotes[3];
    float respprom;
    int number[]={12,23,34,98,87,65,0};
cout<<"selection menu"<<endl;
cout<<"1) array sum of 5 numbers"<<endl;
cout<<"2) average of array elements"<<endl;
cout<<"3) array number lookup"<<endl;
cin>>selection;
if(selection==1){
cout<<"enter 5 numbers"<<endl;
soluccion=arraysumof5numbers(arraynumer,resp);
cout<<soluccion;
}else{
if(selection==2){
cout<<"enter 3 notes"<<endl;
soluccionprom=averagegrades(arraynotes,respprom);
cout<<soluccionprom;
}else{

}if(selection==3){
numbersearch(number,resp);
}else{

}
}
}

//..........................................
int arraysumof5numbers(int array[],int sum){
    for(int i=0;i<5;i++){
    cout<<"element ["<<i+1<<"]:";
        cin>>array[i];
        sum=sum+array[i];
    }

       return sum;
}
//.............................................
float averagegrades(float notes[], float prom){
    float sum=0;
    for(int i=0;i<3;i++){
    cout<<"notes ["<<i+1<<"]:";
        cin>>notes[i];
        sum=sum+notes[i];
        prom=sum/3;
}
return prom;
}
//............................................
void numbersearch(int arraynumer[],int seach){
    int assignment;
    int index=-1;
    cout<<"enter the number to search"<<endl;
    cin>>seach;
    for(int i=0;i<sizeof(arraynumer);i++){
    assignment=arraynumer[i];

    if(seach==assignment){
       index=i;
       break;
}
}
if(index==-1){
     cout<<"does not belong to the arrangement"<<endl;
    }else{
        cout<<"belongs to the arrangement"<<endl;
    }
}
//................................................
