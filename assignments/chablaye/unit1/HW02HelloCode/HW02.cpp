#include <stdio.h>
#define dim 5
#define dim2 3

void SacarPromedio(int A[],int dimension)
{
    int suma=0;
    int promedio, aux;
    for(int i=0; i<dim ; i++)
    {
        aux = suma;
        suma = A[i]+aux;
    }
    printf("el valor de la suma es: %i \n", suma);
    promedio = suma/dim;
    printf("|| El promedio es: %i ||\n", promedio);
}
void SacarPromedioF(float B[])
{
    float suma=0;
    float promedio, aux;
    for(int i=0; i<dim2 ; i++)
    {
        aux = suma;
        suma = B[i]+aux;
    }
    printf("el valor de la suma es: %f \n", suma);
    promedio = suma/dim2;
    printf("|| El promedio es: %f ||\n", promedio);
}
void BuscarNumero(int numero, int G[])
{
    int posicion=0;
    for(int i=0; i<7; i++)
    {
        if (numero==G[i])
            posicion=i;
    }
    if(posicion !=0)
        printf("|| Numero encontrado en la posicion: %i ||", posicion+1);
    else
        printf("|| Numero no encontrado :( ||");
}

int main()
{
    int NumerosP[dim];
    printf("            Creacion de Matriz de 5 enteros\n");
    for(int i=0; i<dim; i++)
    {
        printf("Ingrese un numero [%i] : ",i+1);
        scanf("%i", &NumerosP[i]);
    }
    SacarPromedio(NumerosP,dim);
    
    printf("\n==============================================\n");
    printf("            Creacion de Matriz de 3 Flotantes\n");
    float NumerosF[dim2]; 
    for(int i=0; i<dim2; i++)
    {
        printf("Ingrese un numero [%i] : ",i+1);
        scanf("%f", &NumerosF[i]);
    }
    SacarPromedioF(NumerosF);
    
    printf("\n==============================================\n");
    printf("            Busqueda de un numero en un arreglo\n");
    int NumerosG[]= {12, 23, 34, 98, 87, 65, 0};
    int numero;
    printf("Ingrese l numero que desea buscar: ");
    scanf("%i", &numero);
    BuscarNumero(numero, NumerosG);


    return 0;
}
