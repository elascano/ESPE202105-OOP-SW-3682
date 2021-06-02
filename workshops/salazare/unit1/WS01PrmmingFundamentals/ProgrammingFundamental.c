#include <iostream>
using namespace std;
/* Name: Salazar Matthew   */

int main(int argc, char** argv) {
	
	int elements[5];
	int sum = 0;
	float average[3],prom;

	printf("Name: Salazar Matthew");

    for(int i = 0; i < 5; i++)
    {
    	printf("Enter the elements");
        cin >> elements[i];
	}
	
	for(int i=0;i<5;i++){
		sum+=elements[i];
	}
	
	printf("the sum of the elements is %d",sum);
	
	 for(int i = 0; i < 5; i++)
    {
    	printf("Enter the elements");
        cin >> average[i];
	}
		prom=average[i]/2;
	
	printf("the average of the elements is %f",prom);
	return 0;
}
