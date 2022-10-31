def x(n):
    a=1
    b=1
    for i in range(n):
        a=a*b
        b=b+1
    print(a)
P=int(input('Введите значение:'))
print(x(P))