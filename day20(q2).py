#question link:
#https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-one
#code:
#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'miniMaxSum' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def miniMaxSum(arr):
    # Write your code here
    
    b=sorted(arr) 
    first=0
    last=0
    first=b[0]+b[1]+b[2]+b[3]
    last=b[1]+b[2]+b[3]+b[4]
    print(first,end=" ")
    print(last)

    

if __name__ == '__main__':

    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)
#second approach
#a=[10,11,8,12,5]
#[5,8,10,11,12]
#34 41
#min=5
#max=12
##sum=46
#min=sum-min
#max=sum-max
