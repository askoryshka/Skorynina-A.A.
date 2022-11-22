def matrix(a):
    for i in range(n):
        b = []
        for j in range(n):
            b.append(int(input()))
        a.append(b)


def vivod(a):
    for i in range(n):
        for j in range(n):
            print(a[i][j], end=' ')
        print()


def x(a, n, k):
    for j in range(0, n):
        t = a[k][j] / a[k][k]
        print(t)


a = []
n = int(input('Введите порядок:'))
k = int(input('Введите число:'))
matrix(a)
vivod(a)
x(a,n,k)

