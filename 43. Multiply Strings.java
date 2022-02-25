 StringBuilder sb = new StringBuilder();
        int n = num1.length();
        int m = num2.length();
        
        if(n==0||m==0||"0".equals(num1)||"0".equals(num2)){
            return "0";
        }
        if("1".equals(num1)) return num2;
        if("1".equals(num2)) return num1;
        
        int[] ans = new int[n+m];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int product=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                
                product+= ans[i+j+1];
                ans[i+j+1] = product%10;
                ans[i+j] += product/10;
                
            }
            }
            for(int z:ans){
                if(z==0&& sb.length()==0){
                    continue;
                }
                sb.append(z);
            }
            return sb.toString();
        
    }
}
