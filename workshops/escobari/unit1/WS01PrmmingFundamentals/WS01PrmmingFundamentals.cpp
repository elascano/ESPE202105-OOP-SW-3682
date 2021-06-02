
#include<iostream>
#include<stdlib.h>
#include<ctime>
using namespace std;

int main(){
  int vector[20];
    int i;S
    srand(time(0));


     for(i = 0; i<20; i++){
        vector[i]= 1 +rand() % 25;
     }
    for(i = 0; i<20; i++){
        cout<<vector[i]<<"  ";
    }cout<<endl<<endl;

    for(i = 0; i < 20; i++){
            if(i % 2  ==0){
                cout<<vector[i]<<"  ";
            }
    }
    return 0;

}

