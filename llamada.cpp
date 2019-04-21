#include <iostream>
#include <string>
using namespace std;
int main() {
  float t,costo;
  string d,turno;
  cout<<"Escriba el tiempo que dura la llamada"<<endl;
  cin>>t;
  if(t<=5){
      costo=(t*0.5);
  }
  else if(t<=8){
      costo=(t-5)*0.8+5;
  }
  else if(t<=10){
      costo=(t-8)*0.7+(3*0.8)+5;
  }
  else{
      costo=(t-10)*0.5+(2*0.7)+(3*0.8)+5;
  }
  cout<<"Escriba el dia en el que trabaja"<<endl;
  cin>>d;
  if(d=="DOMINGO"){
      costo=(costo*0.03)+costo;
  }
  else{
      cout<<"Escriba el turno en el que trabaja"<<endl;
      cin>>turno;
      if(turno=="MAT"){
          costo=(costo*0.15)+costo;
      }
      else{
          costo=(costo*0.1)+costo;
      }
  }
  cout<<"El costo total a pagar es: ";
  cout<<costo;
  return 0;
}