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


def transport(a):
    for i in range(n):
        for j in range(n):
            if i < j:
                t = a[i][j]
                a[i][j] = a[j][i]
                a[j][i] = t


n = int(input('Введите порядок'))
a = []
matrix(a)
print('Исходная матрица:')
vivod(a)
transport(a)
print('Полученная матрица:')
vivod(a)
