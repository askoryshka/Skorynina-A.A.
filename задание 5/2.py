n=int(input('Введите число не меньше 2:'))
if n>=2:
    for a in range(2, n+1):
        if n%a==0:
            print (a)
            break
else:
    print('Введено число меньше 2')