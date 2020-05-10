#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int even=0;
  int odd=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      even=1;
    }
    else if(a[i]%2!=0 && even==0)
    {
      odd=1;
    }
    else
    {
      even=0;
      odd=0;
      break;
    }
  }
  cout<<"Enter the number of elements in the array\n\
Enter the elements in the array\n";
  if(even==1)
    cout<<"The array is Even";
  else if(odd==1)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
}