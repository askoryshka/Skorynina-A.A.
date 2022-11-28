from contextlib import redirect_stdout


def matrix():
    file = open('Скорынина Анна Алексеевна_У-222_vvod.txt', 'r')
    global a
    a = file.readlines()
    for i in range(len(a)):
        a[i] = a[i].split(' ')
        for j in range(len(a[i])):
            a[i][j] = int(a[i][j])
    file.close()


def vivod(a):
    for i in range(len(a)):
        for j in range(len(a[i])):
            print(a[i][j], end=' ')
        print()


def transport(a):
    for i in range(len(a)):
        for j in range(len(a)):
            if i < j:
                t = a[i][j]
                a[i][j] = a[j][i]
                a[j][i] = t


a = []
matrix()
with open('Скорынина Анна Алексеевна_У-222_vivod.txt', 'w') as file:
    with redirect_stdout(file):
        file.write('Исходная матрица:')
        vivod(a)
        transport(a)
        file.write('Полученная матрица:')
        vivod(a)
