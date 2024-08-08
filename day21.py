#question:https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-one
#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'timeConversion' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#
# int()-convert string to int
#str()-convert int to string
#string slicing
#function calling 
#debugging
#leaned from errors
def timeConversion(s):
    # Write your code here
    result=""
    stringlen=len(s) 
    h=s[0]+s[1]
    m=s[3]+s[4]
    sec=s[6]+s[7]
    if(s[8]=='P'):
        if(h=="12"):
            return s[0:8:1]
        temp=int(h)+12
        h=str(temp)
        if(temp==24):
            temp=0
            h="00"
        
        result=h+":"+m+":"+sec
        return result
    else:
        if(int(h)==12):
            result="00"+s[2:8:1]
        else:
            result=s[0:8:1]
        return result
        
    
    
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    fptr.write(result + '\n')

    fptr.close()
