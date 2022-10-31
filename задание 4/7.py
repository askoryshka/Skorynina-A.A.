def x(n):
    a=1
    b=0
    for i in range(1, n+1):
        a=a*i
        b=b+a
    print (b)
M=int(input('Введите значение:'))
print(x(M))