#include <iostream>
#include <conio.h>
#include "function.h"

using namespace std;

/*
Write a program that do the following: 1.- Add the elements of an array of 5
integers, where the integers must be entered with the keyboard. 2.- Compute the
average of three elements of an array of floats, also the numbers must be entered
with the keyboards. 3.- Find out if a speci!c integer is pa# of an array, the array will
have the following elements { 12,23,34,98,87,65,0}, the user must enter the number
to search for and the program tells whether the number is in the list or not. Use
function
functions for every requirement. And from the main method, call the specific
functions accordingly

ANALISYS:
D. Input: num[], opc, dataSearched, scores
D. Output: plus, average
D. Aux: array[] = {12,23,34,98,87,65,0};
*/


int main(int argc, char** argv) {
	int num[5], opc, dataSearched, value;
	float scores[3];
	int array[] = {12,23,34,98,87,65,0};
	do{
		system("cls");
		fflush(stdin);
		opc=menu();
		switch(opc){
			case 1:{
				for(int i=0;i<5;i++){
					cout << "\nEnter the number " << i+1 <<": ";
					cin >> num[i];
				}
				addNumber(num);
				break;
			}
			case 2:{
				for(int i=0;i<3;i++){
					fflush(stdin);
					cout << "\nEnter score " << i+1 << ": ";
					cin >> scores[i];
				}
				calculateAverage(scores);
				break;
			}
			case 3:{
				cout << "\nEnter the number to search: ";
				cin >> dataSearched;
				value=findNumber(array, dataSearched);
				if(value==true){
				cout << "\n\nNumber " << dataSearched << " is in the array \n" << endl;
				}
				else{
					cout << "\n\nNumber " << dataSearched << " isn't in the array \n" << endl;
				}
				break;
			}
			case 0:{
				cout << "\n\nThanks for using my program, Good Bye :) \n\n";
				break;
			}
			default:{
				cout << "\n\nwrong option, Try again :( \n\n";
				break;
			}
		}
	system("pause");
	}while(opc!=0);
	return 0;
}
