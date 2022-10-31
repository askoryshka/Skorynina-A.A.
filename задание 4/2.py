def x(A,B):
    if A<B:
        while A<=B:
            print(A)
            A=A+1
    else:
        while B<=A:
            print(A)
            A=A-1
C=int(input('Введите число'))
D=int(input('Введите число'))
print(x(C,D))