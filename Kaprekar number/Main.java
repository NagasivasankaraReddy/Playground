#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int temp=n;
  int som=n;
  int comp=n*n;
  n=n*n;
  int count=0;
  int na;
  while(temp>0)
  {
    temp=temp/10;;
    count++;
  }
  if(count%2==0)
  {
    count=count/2;
    na=comp%10;
    comp=comp/10;
    while(count>0)
    {
      na=(comp%10)*10+na;
      comp=comp/10;
      count--;
    }
  }
  else
  {
    count=(count+1)/2;
    na=comp%10;
    comp=comp/10;
    while(count>1)
    {
      na=(comp%10)*10+na;
      comp=comp/10;
      count--;
    }
  }
  if(comp+na==som)
  {
    std::cout<<"Kaprekar Number";
  }
  else
  {
    std::cout<<"Not a Kaprekar Number";
  }
}
    
      
    
