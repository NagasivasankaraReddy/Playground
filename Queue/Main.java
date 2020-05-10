#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int sum=0;
  for(int i=0;i<n;i++)
  {
    sum=sum+a[i];
      
  }
  int count=sum/m;
  if(sum%m>0)
  {
    count++;
  }
  if(n==m)
    count++;
  cout<<count;
  
}