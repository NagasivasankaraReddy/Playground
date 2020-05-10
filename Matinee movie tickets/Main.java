#include<iostream>
using namespace std;
int main()
{
int age,t;
float time;
cin>>age;
cin>>time;
 t=int(time);
  switch(t)
  {
    case 13:   
if(age<13)
  cout<<"$2.00";
  else
  cout<<"$5.00";
      break;
    default:
      if(age<13)
{
  cout<<"$4.00";
}
  else
  {
  cout<<"$8.00";
  }
      
   
}
}