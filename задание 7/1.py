def x(array,n):
    a=0
    b=1
    for i in range(n):
        a+=array[i]
        b*=array[i]
    return a, b
A=int(input('Введите число элементов:'))
h=[int(input()) for i in range(A)]
print(A)
print(x(h,A))