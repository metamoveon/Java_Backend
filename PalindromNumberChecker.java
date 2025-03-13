public class PalindromNumberChecker {
    void main(){
        int [] expectedTrue1 = {1,2,3,3,2,1};
        System.out.println("expectedTrue1 :"+isPalindrome(expectedTrue1));
        int [] expectedTrue2 = {1,2,3,2,1};
        System.out.println("expectedTrue2 :"+isPalindrome(expectedTrue2));
        int [] expectedFalse = {1,2,3,5,7,9,4,3,2};
        System.out.println("expectedFales :"+isPalindrome(expectedFalse));

    }

    private static boolean isPalindrome(int[]arr){
        for(int left=0 ,right = arr.length-1; left <= right; left++,right--){
            if(arr[left] != arr[right]){
                return false;
            }
        }
        return true;

    }
}
