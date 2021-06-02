#include<iostream>
#include<conio.h>
using namespace std;


void data();
int sum(int h[5],int);
int h[5],len;
int average(int h[5],int);
int sear();

int main(){
    system ("color F0");
    cout<<"-----Welcome to my program-----"<<endl<<endl;
    data();
    cout<<"The sum of the numbers is: "<<sum(h,len)<<endl<<endl;
    cout<<"The average of the numbers is: "<<average(h,len)<<endl<<endl;
    sear();
    cout<<" "<<endl;
    cout<<"Thanks for using the program..."<<endl;
    getch();
    return 0;
}

void data(){
    cout<<"Choose 5 or 3 depending on the number of elements you want: ";
    cin>>len;

    for(int i=0;i<len;i++){
        cout<<i+1<<". Enter a number: ";
        cin>>h[i];
    }
}

int sum(int h[],int len){
int sum=0;
int i;
for(i=0;i<len;i++){
    sum+=h[i];
}
return sum;
}

int average(int h[],int len){
int average=0;
int sum=0;
int i;
for(i=0;i<len;i++){
        sum+=h[i];
    average=sum/len;
}
return average;
}


int sear(){
    int a[]={12,23,34,65,87,98,0};
    int i,dat;
    char band = 'F';
    dat=h[i];
    i=0;
    while((band =='F')&&(i<len)){
        if(a[i]==dat){
            band='V';
        }
        i++;
    }
    if(band=='F'){
        cout<<"The number that was searched does not exist"<<endl;
    }
    else if (band == 'V'){
        cout<<"The number was found"<<endl;
    }
}
