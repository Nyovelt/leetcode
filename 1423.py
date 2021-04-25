


# cardPoints = [9,7,7,9,7,7,9]
# k = 7

cardPoints = [1,2,3,4,5,6,1]
k = 3

maxn = 0
for i in range(0,k):
    maxn += cardPoints[i]
tmp = maxn

length = len(cardPoints)
for i in range(k-1,-1,-1):
    print(i, length  + i-k)
    tmp -= cardPoints[i]
    tmp += cardPoints[length  + i-k]
    if (tmp > maxn):
        maxn = tmp
    print(maxn, tmp)
print(maxn)