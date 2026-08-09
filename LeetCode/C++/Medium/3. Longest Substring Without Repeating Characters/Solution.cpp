class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int ml=0;
        int l=0;
        unordered_map<char,int> count;
        for(int right=0;right<s.size();right++){
            char c=s[right];
            count[c]=count[c]+1;
             
             while(count[c]>1){
                char leftChar=s[l];
                count[leftChar]=count[leftChar]-1;
                l++;
             }
             ml=max(ml,right-l+1);
        }
        return ml;
    }
};