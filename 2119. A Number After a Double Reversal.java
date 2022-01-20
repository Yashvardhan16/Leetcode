class Solution {
    public boolean isSameAfterReversals(int num) {
       Long x=Long.valueOf(num);
        boolean negative=false;
        if(num<0){
            negative=true;
            num *=-1;
        }
        long reversed=0;
        while(num>0){
            reversed = reversed*10 +num%10;
            num /=10;
        }
        long temp = reversed;
        long original=0;
        while(reversed>0){
           original = original*10 +(reversed%10);
            reversed /=10;
        }
        if(original==x){
            return true;
        }else{
            return false;
        }
    }
}
