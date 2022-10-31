def x(A,B):
    while A>B:
        B=int(input('Введите число больше первого'))
    while A<=B:
        print (A)
        A+=1
C=int(input('Введите число'))
D=int(input('Введите число больше первого'))
print(x(C,D))