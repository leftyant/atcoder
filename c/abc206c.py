from collections import defaultdict

n = int(input())
*a, = map(int, input().split())
ans = 0
dl = []
d = defaultdict(int)
ans = 0
for i, elem in enumerate(a):
    d[elem] += 1
    ans += i - d[elem] + 1

print(ans)
