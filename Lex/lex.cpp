#include <iostream>
#include <fstream>
#include <ctype.h>

using namespace std;

int main(){

	ifstream fin;
	fin.open("szoveg.txt");
	
	char ch;

	int betu = 0, sor = 0, szam = 0, szokoz = 0, spec = 0;

	while(fin.get(ch)){
 		if(ch == ' ' || ch == '\t'){
			szokoz++;
		}	
		if(isalpha(ch)){
			betu++;
		}
		if(isdigit(ch)){
			szam++;
		}
		if(ch == '\n'){
			sor++;
		}
		if(ispunct(ch)){
			spec++;
		}	

	}
	fin.close();
	cout << "Szokoz: " << szokoz << "\nSor: " << sor << "\nSzam: " << szam << "\nBetu: " << betu << "\nSpec: " << spec << endl;
}
