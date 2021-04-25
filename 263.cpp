#include <bits/stdc++.h>
using namespace std;
#define FOR_1(i, a, b) for (int i = a; i <= b; ++i)

bool isUgly(int n) {
  while (n > 0) {
    if (!(n % 2))
      n /= 2;
    else if (!(n % 3))
      n /= 3;
    else if (!(n % 5))
      n /= 5;
    else
      break;
  }
  return n == 1;
}

int main() { cout << isUgly(6); }