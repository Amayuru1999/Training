public class PalindromeChecker {
        public static boolean isPalindrome(String str){
            str=str.replaceAll("\\s","").toLowerCase();

            int length=str.length();

            if(length <= 1){
                return true;
            }
            for(int i=0;i<length/2;i++){
                if(str.charAt(i) != str.charAt(length-i-1)){
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        String input="Amayuru";
        System.out.println(isPalindrome(input));
    }
}
