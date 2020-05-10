#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char str1[50];
  
  cin>>str1;
  int count=0;
  for(int i=0;i<50;i++)
  {
    if(str1[i]!='\0')
      count++;
    else
      break;
  }
  cout<<"The number of letters in the name is "<<count;
}
  
