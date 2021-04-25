#include <bits/stdc++.h>
using namespace std;
#define FOR_1(i, a, b) for (int i=a;i<=b;++i)

int a[3] = {3,1,3};
vector<int> in(a, a+3);

int findMin(vector<int>& nums) {
    int l=0, r = nums.size()-1,p;
    while(l<=r){
        p=l + ((r-l)>>1);
        if (nums[p] < nums[r])
            r = p;
        else if (nums[p] == nums[r])
            --r;
        else    
            l = p+1;
    }
    return nums[p];
}

int main(){
    // FOR_1(i, 0, 2)
    //     cout << in[i];
    cout << findMin(in);
}