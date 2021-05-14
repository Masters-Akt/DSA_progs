class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ans(numRows);
        ans[0].push_back(1);
        if(numRows>1){
            ans[1].push_back(1);
            ans[1].push_back(1);
        }
        for(int i=2;i<numRows;i++){
            ans[i].push_back(1);
            for(int j=1;j<ans[i-1].size();j++){
                ans[i].push_back(ans[i-1][j]+ans[i-1][j-1]);
            }
            ans[i].push_back(1);
        }
        return ans;
    }
};