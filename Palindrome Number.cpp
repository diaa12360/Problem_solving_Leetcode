#include <bits/stdc++.h>
class Solution {
public:
    bool isPalindrome(int x) {
 vector<int> v;
  if (x < 0)
    return false;
  else
  {
    int n = x;
    do
    {
      v.push_back(n % 10);
    } while (n /= 10);
    for (int i = 0, j = v.size() - 1; i < v.size(); i++, j--)
    {
      if (v[i] != v[j])
        return false;
    }
    return true;
  }
    }
}; 
