L=[12,23,45,13]
len=len(L)
def SumArray(L):
    sum=0
    for i in range(0,len):
        sum=sum+L[i]
    return sum
ans=SumArray(L)
print(ans)
