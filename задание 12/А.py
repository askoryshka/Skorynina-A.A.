def f(n):
    if n == 1:
        return 1
    else:
        return n * f(n-1)


X = int(input('X:'))
N = int(input('N:'))
print(X**N / f(N))
