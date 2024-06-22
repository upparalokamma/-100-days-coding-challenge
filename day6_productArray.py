# Problem: Write a python function that takes an array of integers and 
#returns a new array where each element is the product of all the 
#elements in the original array except for the element at the current index. 


a1=[1, 2, 3, 4]
def productofelements(a1):
  result=[]
  product=1
  #step 1 calculated product
  for i in range (0,len(a1)):
    
     product= product*a1[i]

  #step 2 : divide the product with each element of the array

  for j in range(0,len(a1)):
    result.append(product//a1[j])
    
  #step 3: return the result
  return result

ans=productofelements(a1)
print(ans)  
  
