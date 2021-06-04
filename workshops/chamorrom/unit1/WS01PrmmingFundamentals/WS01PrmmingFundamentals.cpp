#include <stdio.h>
#include <iostream>


void buscarElemento(int a[], int size_busca, int element_Busqueda);
int  sumar_Elementos(int b[]);


int main()
{
    int n=5; //Numero de elemntos
    int i;
    int elemento_Bus;
    int array[n];

    for(i=0; i<n; i++)
    {
        printf("Ingresa el elemento numero %d del arreglo: ", (i+1) );
        scanf("%d",&array[i]);
    }

    printf("\n\n");
    
    printf("Ingresa el elemento a buscar en el arreglo: ");
    scanf("%d",&elemento_Bus);

    buscarElemento(array, n, elemento_Bus);

    printf("\n");

    system("pause");
    return 0;
}

void buscarElemento(int a[], int size_busca, int element_Busqueda)
{
    int j;
    int b = 0;
    int hold1,hold2;
    int cont = -1;


        for(j=0; j<size_busca; j++)
        {
            if(element_Busqueda == a[j])
            {
                hold1 = a[j];
                hold2 = j;
                b = 1;
            }
        }


    if(b==1)
    {
    printf("El elemento encontrado es %d y se encuentra en la posicion %d.\n",hold1,hold2);
    }
    else
    {
        printf("Elemento no encontrado.\n");
    }
}

int sumar_Elementos(int b[],int size_busca)
{
    int j;
    int c=0;
        
        for(j=0; j<size_busca; j++)
        {
        c=b[j]+b;    
        }
    return c;
}
