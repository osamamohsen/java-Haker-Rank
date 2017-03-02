/* 
 * File:   main.cpp
 * Author: osama
 *
 * Created on February 4, 2017, 8:53 AM
 */

#include <cstdlib>
#include <iostream>
using namespace std;

int main(int argc, char** argv) {

    int x = 3;
    int y = x+5;
    for(int i=0;i<x;i++){
        y= y-i;
        cout<<y<<"\n";
    }
    return 0;
}

