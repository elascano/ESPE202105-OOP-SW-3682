#include <iostream>
#include <conio.h>
#include <ctype.h>
using namespace std;

int menu()
{
	int opc;
	cout << " \t\tHW.02 Programming Fundamentals ";
	cout << " \n\t\tSteven Jossue Achig Toapanta";
	cout << "\n1. Plus of five numbers"
	"\n2. Calculation of the average of 3 scores"
	"\n3. Find a number in array {12,23,34,98,87,65,0}"
	"\n0. Exit";
	cout <<	"\n\n\tChosse a option: ";
	cin >> opc;
	return opc;
}

void addNumber(int num[])
{
	int plus;
	for(int i=0;i<5;i++){
		plus += num[i];
	}
	cout << "\nThe Plus is: " << plus << "\n\n";
}

void calculateAverage(float scores[])
{
	float sumScore=0, average;
	for(int i=0;i<5;i++){
		sumScore += scores[i];
	}
	
	cout << "\n\nThe Average is: " << sumScore/3 <<  "\n\n";
}

bool findNumber(int array[], int dataSearched)
{
	for(int i=0;i<7;i++){
		if(array[i]==dataSearched)
			return true;
	}
}
