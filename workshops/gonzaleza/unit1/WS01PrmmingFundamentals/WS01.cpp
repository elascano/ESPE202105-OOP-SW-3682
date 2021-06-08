#include<iostream>
#include<conio.h>

using namespace std;

void datosPorConsola();

int vector[5];
int sumaDeVectores(int vector[5], int numero1);
int extension=5;

int main(){
    datosPorConsola();

    cout<<"\nEl resultado es: "<<sumaDeVectores(vector, 5);



return 0;
}

void datosPorConsola(){

    for(int largo=0; largo<5; largo++){
        cout<<"Escriba un número: ";
        cin>>vector[largo];
    }
}

int sumaDeVectores(int vector[], int extension){
    int resultado=0;
    for(int largo=0; largo<5; largo++){
        resultado = resultado+vector[largo];
    }
    return resultado;
}
