#include <iostream>
#include <conio.h>
#define AL 3
#define AN 3
#include <stdio.h>

using namespace std;

int main (){
    int Nasumar [] = {1,2,3,4,5}
    int sumarN = 0

    for (int i=0, i<5;i++){
        sumarN += Nasumar [i];
    }
cout <<"La suma de los elementos del vector es: "<<sumarN<<endl;

    int matriz[AL][AN] = {
            {20,  50, 80},
            {500, 12, 44},
            {56,  4,  3},
            };
    int sumatoria = 0;
    int cantidaddeelementos = AL * AN
    for (int y = 0; y < ALTURA; y++) {
        for (int x = 0; x < ANCHURA; x++) {
            int elementounico = matriz[y][x];
            sumarelementos = sumarelementos + elementounico;
        }
    }
    double promedio = (float) sumarelementos / (float) cantidaddeelementos;
    cout<<("El promedio es: %0.2f\n", promediototal)<<endl;

    getch();
    return 0;
}
