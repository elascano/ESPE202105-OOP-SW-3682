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
