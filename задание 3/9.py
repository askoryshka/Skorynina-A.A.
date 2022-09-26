def add(n,m,k):
    if k<n*m and ((k%n==0) or (k%m==0)):
        print('ДА')
    else:
        print('НЕТ')
n1=int(input())
m1=int(input())
k1=int(input())
print (add(n1,m1,k1))