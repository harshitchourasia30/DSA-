//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.



class Solution {
    public void generate(int n, int l , int r, String s, List<String> ans){
        //basecase
        if(r == n) {    // or we can use if(s.length()==2*n as base case.
            ans.add(s);
            return;
        }
        //call
        if(l<n)  generate(n,l+1,r,s+"(",ans);
        if(r<l)   generate(n,l,r+1,s+")",ans);   

    }


    public List<String> generateParenthesis(int n) {

        List<String> ans =  new ArrayList<>();
        generate(n,0,0,"",ans);   
        System.out.println(ans);      
        return ans;       // it will return ans after we fill up string list
        
    }
}