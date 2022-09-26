def min(a,b,c):
    if a<b and a<c:
        return a 
    elif b<a and b<c:
        return b
    else:
        return c
a1=int(input())
b1=int(input())
c1=int(input())
print(min(a1,b1,c1))