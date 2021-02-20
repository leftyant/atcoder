import sys


def input(): return sys.stdin.readline().strip()


n = int(input())
*a, = map(int, input().split())
ans = 0
for v in a:
    res = v
    while res % 2 == 0 or res % 3 == 2:
        res -= 1
        ans += 1
print(ans)
