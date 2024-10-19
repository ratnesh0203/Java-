public class Prob20 {
    public static boolean isValid(String s) {
        if(s == null || s.length() == 0){
         return true;
        } 
        if( s == "()" || s == "{}" || s == "[]"){
            return true;
        }
        return false;
     }
     public static void main(String[] args) {
        String str = "()";
        System.out.println(isValid(str));
     }
}
