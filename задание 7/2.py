def x(a,n):
    s=0
    for i in range(n-1):
        if a[i] !=0:
            s+=a[i]
        else:
            a[i]=s/n
    return a[n-1]
h=int(input('Введите число элементов:'))
A=[int(input())for i in range(h)]
print(A)
print(x(A,h))