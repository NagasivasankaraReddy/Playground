#include <iostream>
#include<string.h>;
int main()
{
char str[100], rev[100];     
int count = 0, end;    
//Your code goes here  
  std::cin.getline(str,100);
  int i=0;
   count=strlen(str);
  
  for(int i=0;i<count;i++)
  {
    rev[i]=str[count-1-i];
  }
std::cout<<rev;
}