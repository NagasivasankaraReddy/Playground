#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a[20];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int m;
  cin>>m;
  if(m<=n)
  { 
  int k;
  cin>>k;
  
  for(int i=n+1;i>=m-1;i--)
  {
    a[i]=a[i-1];
  }
  a[m-1]=k;
    cout<<"Enter the number of elements in the array\n\
Enter the elements in the array\n\
Enter the location where you wish to insert an element\n\
Enter the value to insert\n\
Array after insertion is\n";
  for(int i=0;i<n+1;i++)
  {
    cout<<a[i]<<"\n";
  }
  }
  else
    cout<<"Enter the number of elements in the array\n\
Enter the elements in the array\n\
Enter the location where you wish to insert an element\n\
Invalid Input";
  
}