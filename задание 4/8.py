def y(n):
    a=''
    if 0<n<=9:
        for i in range(1, n+1):
            a=a+str(i)
            print(a)
    else:
        print ('Неверное число')
k=int(input('Число от 1 до 9:'))
print(y(k))