#Problem: Write a Java function that takes an array of integers and returns a new array 
#where each element is the sum of each adjacent pair of elements from the original array.
#If the original array has an odd number of elements, the last element of the new array
#should be the last element of the original array


CODE:

l=[10,20,30,40,50]
def sumofadjacentelements(l):
  l1=[]

  
  for i in range(0,len(l)-1,2):
    print(i,l[i],l[i+1])
    sum=l[i]+l[i+1]
    l1.append(sum)
   
  if(len(l)%2==1):
    last=l[len(l)-1]
    l1.append(last)
  return l1

ans=sumofadjacentelements(l)
print(ans)
