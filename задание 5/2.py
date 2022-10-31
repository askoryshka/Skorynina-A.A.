def x(n):
    if n>=2:
        for a in range(2, n+1):
            if n%a==0:
                return a
                break
    else:
        return 'Введено число меньше 2'
b=int(input('Введите число не меньше 2:'))
print(x(b))