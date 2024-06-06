public class BinarySearch {
    public static int binarySearch(int[] arr, int element){

        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;

            if (element==arr[mid])
                return mid;
            else if (element<arr[mid]) {
                end = mid-1;
            } else if (element > arr[mid]) {
                start = mid+1;
            }
            else {
                System.out.println("incorrect input");
            }
        }
        return -1;
    }
    public static void main(String[] args){

        int[] arr1 = {34,342,54,65,76,45};

        int result = binarySearch(arr1, 65);
        System.out.println(result);
    }

}
