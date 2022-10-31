def x(n):
    sum=0
    a=1
    for i in range(n):
        sum += a**3
        a += 1
    print (sum)
G=int(input('Введите число:'))
print(x(G))