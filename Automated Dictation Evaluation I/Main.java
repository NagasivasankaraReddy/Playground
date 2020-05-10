#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char str1[50];
  char str2[50];
  cin>>str1;
  cin>>str2;
  int res=0;
  res=strcmp(str1,str2);
  if(res==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}
  
