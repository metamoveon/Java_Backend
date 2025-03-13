public class IsTheArraySorted {
    public static void main(String[] args) {
        int [] expectedTrue = {1,2,3,4,5,6,7,8,9};
        System.out.println("Result :"+isASCsorted(expectedTrue));
        int [] expectedFalse = {1,2,3,4,6,5,7,8,9};
        System.out.println("Result :"+isASCsorted(expectedFalse));
    }

    private static boolean isASCsorted(int [] arr){
        if(arr.length == 0 || arr.length == 1){
            return true;
        }
    
        for(int i =1; i < arr.length; i++){
            int current = arr[i];
            int previous = arr[i-1];
            if(current<previous){
                return false;
            }
        }
        return true;
    }
}