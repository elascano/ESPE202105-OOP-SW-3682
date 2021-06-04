#include <stdio.h>
#define dim 5
using namespace std;

    int Numeros[dim],promedio,impares,pares,aux;
    int suma=0;
    for (int i=0;i<dim;i++)
    {
        printf("Ingrese un numero [%i] : ",i);
        scanf("%i",&Numeros[i]);
        aux=suma;
        suma=Numeros[i]+aux;
    }
    printf("El valor de la suma es: %i\n",suma);
    promedio=suma/dim;
    printf("El promedio es: %i\n",promedio);
