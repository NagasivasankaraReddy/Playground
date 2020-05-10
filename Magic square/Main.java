#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n;
  m=n;
  int a[n][m];
  int b[n][m];
  int sum[n][m];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
    cin>>a[i][j];
    }
  }
  int sum1=0;
  int sum2=0;
  if(n==m)
  {
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
     if(i==j)
       sum1=sum1+a[i][j];
     if((n-i-1)==j)
       sum2=sum2+a[i][j];
       
    }
  }
    
    if(sum1==sum2)
      cout<<"Yes";
    else
      cout<<"No";
  }
  else
    cout<<"No";
  
  
}