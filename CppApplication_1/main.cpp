/* 
 * File:   main.cpp
 * Author: osama
 *
 * Created on April 28, 2016, 7:03 PM
 */

#include <cstdlib>
#include <iostream>
#include <cstdio>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    freopen("in.txt","r",stdin);
    freopen("out.txt","w",stdout);
    int ar[]={5,6,9,70};
    for(int i=0;i<4;i++)
        cout<<ar[i]<<"\n";
    cout<<"*****************************"<<endl;
    int x; cin>>x;
    while(x>5){
        cout<<x<<endl;
        x--;
    }
    return 0;
}

