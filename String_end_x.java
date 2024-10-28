//MOve all 'x' to the end of the String

public class String_end_x {
    public static void moveAllX(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i=0;i<count;i++){
            newString+='x';
            }
            System.out.print(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }
        else{
            newString += currchar;
            moveAllX(str,idx+1,count,newString);
        }
    }
   public static void main(String args[]){
    String str = "axbcxxd";
    int idx = 0;
    int count=0;
    moveAllX(str, idx, count,"");

   } 
}
