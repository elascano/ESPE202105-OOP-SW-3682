#include<iostream>
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

using namespace std;

void vectorAddition();
void averageOfVector();
void findElement();

int main(){
    int option = 0;
    do{
        system("cls");
        cout<<"\t OPTION MENU "<<endl;
        cout<<"1. Add the elements of a 5 element array."<<endl;
        cout<<"2. Compute the average of three elements of an array."<<endl;
        cout<<"3. Find out if a specific integer is part of an array."<<endl;
        cout<<"4. to EXIT."<<endl;
        scanf("%i", &option);

        switch(option){
            case 1:
                system("cls");
                vectorAddition();
                getch();
                break;
            case 2:
                system("cls");
                averageOfVector();
                getch();
                break;
            case 3:
                system("cls");
                findElement();
                getch();
                break;
            case 4:
                system("cls");
                break;
            default:
                system("cls");
                cout<<"Invalid option, try another one";
                getch();
                break;

        }
    }while(option != 4);
    getch();
    return 0;
}

void vectorAddition(){
    int addition = 0;
    int vector[5];

    for(int i=0; i<5; i++){
        int element;
        cout<<"Insert the "<<i+1<<" element of the vector: ";
        cin>>vector[i];
        addition += vector[i];
    }

    cout<<"The addition of the elements of the vector is: "<<addition<<endl;
}

void averageOfVector(){
    float average = 0;
    float addition=0;
    float vectorAvg[3];

    for(int i=0; i<3; i++){
        float element;
        cout<<"Insert the "<<i+1<<" element of the vector: ";
        cin>>vectorAvg[i];
        addition += vectorAvg[i];
    }

    average = addition/3;
    cout<<"The average of the elements of the vector is: "<<average<<endl;
}

void findElement(){
    int toFind[] = {12, 23, 34, 98, 87, 65,0};
    int insertElement;
    char flag = 'F';
    int i=0;

    cout<<"Insert an element to find: ";
    cin>>insertElement;

    while((flag=='F') && (i<7)){
        if(toFind[i]==insertElement){
            flag='V';
        }
        i++;
    }

    if(flag=='F'){
        cout<<"This element does not belong to the array."<<endl;
    }
    else if(flag=='V'){
        cout<<"This element do belong to the array."<<endl;
    }
}
