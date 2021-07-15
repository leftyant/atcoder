import sys
from typing import no_type_check_decorator


def input(): return sys.stdin.readline().strip()
def I(): return int(input())
def LI(): return list(map(int, input().split()))
def IR(n): return [I() for i in range(n)]
def LIR(n): return [LI() for i in range(n)]
def SR(n): return [S() for i in range(n)]
def S(): return input()
def LS(): return input().split()


INF = float('inf')

# https://atcoder.jp/contests/typical90/tasks/typical90_a

n, l = LI()
k = I()
a = LI()


def is_ok(x):
    '''二分探索の判定
    K+1個以上の「長さx以上のピース」に分割可能かどうか
    '''
    count = 0  # x以上のピースに切る場合、何個に切れたか
    pre_ai = 0  # 前回の切れ目
    for ai in a:
        # 初めて x を超えた場合そこで切る
        if ai - pre_ai >= x:
            count += 1
            pre_ai = ai

    # 切れ端が x 以上の場合それもカウント
    if (l - pre_ai) >= x:
        count += 1

    # x以上のピースで切った場合k+1個に分割可能か
    return (count >= k + 1)


# 二分探索
left = -1
right = l + 1
while right - left > 1:
    mid = (left + right) // 2
    if is_ok(mid):
        left = mid
    else:
        right = mid
print(left)
