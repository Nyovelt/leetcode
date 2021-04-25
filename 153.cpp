#include <bits/stdc++.h>
using namespace std;
#define FOR_1(i, a, b) for (int i=a;i<=b;++i)

int a[8] = {4,5,6,7,0,1,4,4};
vector<int> in(a, a+8);

int findMin(vector<int>& nums) {
    int l=0, r = nums.size()-1,p;
    while(l<=r){
        p=l + ((r-l)>>1);
        if (nums[p] < nums[r])
            r = p;
        else    
            l = p+1;
    }
    return nums[p];
}

int main(){
    // FOR_1(i, 0, 6)
    //     cout << in[i];
    cout << findMin(in);
}