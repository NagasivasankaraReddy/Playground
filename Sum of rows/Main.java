#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
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
  int sum1[n];
  int sum2[m];
  
  for(int i=0;i<n;i++)
  {
    int suma=0;
    for(int j=0;j<m;j++)
    {
     suma=suma+a[i][j];
    }
    sum1[i]=suma;
  }
  
  
    
  for(int i=0;i<n;i++)
  {
  cout<<sum1[i]<<"\n";
  }
  
  
  
  
}