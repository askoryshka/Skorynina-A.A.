def time(n):
    n=n%60
    chas=n//60%24
    return chas, n
minuta=int(input())
chas,minuta=time(minuta)
print(chas,":",minuta)