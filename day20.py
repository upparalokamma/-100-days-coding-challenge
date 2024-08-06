#question link:
#https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-one
#code:
#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    # Write your code here
    length=len(arr)
    countp=0
    countn=0
    count0=0
    for i in range(0,length):
        currentelement=arr[i]
        if(currentelement>0):
            countp=countp+1
        elif(currentelement<0):
            countn=countn+1
        else: 
            count0=count0+1
    print(countp/length)
    print(countn/length)
    print(count0/length)
    

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)

