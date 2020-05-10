
  #include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int a1[r][c],a2[c][r];
    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            std::cin>>a1[i][j];
        }
    }
  for(int i = 0; i < c; i++){
        for(int j = 0; j < r; j++){
            a2[i][j]=a1[j][i];
        }
    }
  
  for(int i = 0; i < c; i++){
        for(int j = 0; j < r; j++){
            std::cout<<a2[i][j]<<" ";
        }
    cout<<"\n";
    }
  
  
  
  
  
}
