#include<iostream>
using namespace std;
int main()
{
  int amount,interest,years;
  cin>>amount>>interest>>years;
  float totalinterest=float(((amount*interest)*years)/100);
  float totalamount=float(amount+totalinterest);
  float discount=float(0.02*totalinterest);
  float finalamount=float(totalamount-discount);
  cout<<totalinterest<<endl;
  cout<<totalamount<<endl;
  cout<<discount<<endl;
  cout<<finalamount<<endl;
  
  //Type your code here.
}