#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int sum1=0;
  int sum2=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      sum1=sum1+a[i];
    else
      sum2=sum2+a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<sum1<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<sum2;

  
}