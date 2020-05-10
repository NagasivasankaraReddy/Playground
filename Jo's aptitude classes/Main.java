#include<iostream>
using namespace std;
int gcd(int a,int b,int c)
{
  int small;
  if(a<=b && a<=c)
    small=a;
  else if(b<=c)
    small=b;
  else
    small=c;
  while(small!=1)
  {
    if(a%small==0 && b%small==0 && c%small==0)
      return small;
    small--;
  }
}
int main()
{
  int x,y,z,l;
  cin>>x>>y>>z>>l;
  if(gcd(x,y,z)==l)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}
  
   