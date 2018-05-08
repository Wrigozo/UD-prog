#include <iostream>
#include <stdlib.h>
#include <fstream>
using namespace std;
int main(){
			int szul_ev, szul_hon, szul_nap;
			cout<<"Légyszi add meg a születési éved:"<<endl;
			cin>>szul_ev;
			cout<<"Most a születési hónapod légyszi:"<<endl;
			cin>> szul_hon;
 			cout<<"Na jó már csak az a nap kell,hanyadikán születtél :D tovább nem zargatlak :/ :"<<endl;
			cin>> szul_nap;
			int ev = 2000;  
			int honap = 1; 
			int nap = 1; 
			int hetnapja = 5;
			int honapok[] = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
			string napok[] = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
			while (ev != 3000)
			{
				hetnapja += 365;
				if(ev % 4 == 0 && !(ev % 100 == 0 && ev % 400 != 0))
				{
					hetnapja++;
				}
				ev++;
			}
			hetnapja += honapok[szul_hon-1];
			hetnapja += szul_nap - 1;
			cout<<"A te születésnapod erre a napra fog esni: "<<napok[hetnapja%7]<<endl;
			return 0;

		
}
