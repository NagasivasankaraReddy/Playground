#include<iostream>
#include<string.h>
using namespace std;
int main ()
{
    char str[10000];
    int count = 0, i; 
    gets(str);
    for (i = 0; str[i] != '\0';i++)
    {
        if (str[i] == ' ')
            count++;    
    }
   if((count+1)>=10)
     cout<<"Caption not eligible for the contest";
  else
    cout<<"Caption eligible for the contest";
  
      
    return 0;
}