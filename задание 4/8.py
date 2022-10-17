a=''
n=int(input('Число от 1 до 9:'))
if 0<n<=9:
    for i in range(1, n+1):
        a=a+str(i)
        print(a)
else:
    print ('Неверное число')