import math

n = int(input())
res = (math.sqrt(1+8*n) - 1) / 2
d = int(res) if res.is_integer() else int(res) + 1
print(d)
