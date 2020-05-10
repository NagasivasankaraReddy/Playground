#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int a[n][m];
  
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
    {
    cin>>a[i][j];
    }
  }
  int suma=0;
  
  for(int i=0;i<n;i++)
  {
   
    for(int j=0;j<m;j++)
    {
     if(i==0||i==n-1)
       suma=suma+a[i][j];
     
     else if(j==n-i-1)
       suma=suma+a[i][j];
    }
    
  
  }
  cout<<"Sum of Zig-Zag pattern is "<<suma;
  
  
  
  
}