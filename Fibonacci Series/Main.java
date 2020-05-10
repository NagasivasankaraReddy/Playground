#include<iostream>
using namespace std;
int fibo(int a)
{
  if(a==1)
    return 0;
  else if(a==2)
    return 1;
  else
    return fibo(a-1)+fibo(a-2);
 
}
int main()
{
  int a;
  cin>>a;
 
  cout<<"The term "<<a<<" in the fibonacci series is "<<fibo(a);
}
