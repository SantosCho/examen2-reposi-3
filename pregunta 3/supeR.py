# -*- coding: utf-8 -*-
"""
Created on Tue Jun 14 01:08:23 2022

@author: carlos
"""

def Fibonacci(n=0):
    if(n==0):
        return 0
    elif(n==1):
        return 1
    else:
        return (Fibonacci(n-2)+Fibonacci(n-1))
    
def fbn(n):
    a = 1
    b = 1
    c = 0
    
    if (n == 1):
       return 1
    if (n == 2):
      return 1

    for i in range(0,3) :
        c = a + b
        a = b
        b = c 
        return c
     
def fibo(funcion,n=0):
    return funcion(n)
    

n=int(input("Intro valor R"))
print("recursivo", fibo(Fibonacci,n))
print("estructurado ",fibo(fbn,n))









