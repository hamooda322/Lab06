class Main{
    public static void binarySearch(int arr[], int first, int last, int key){
//algorithm for binary search for the array
        int mid = (first + last)/2;
        while( first <= last ){
           //if statement to see if an item is less than or equal to target value
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                //break loop if element is found. No need to keep going.
                break;
                //else statement for array search
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        //if statement if item is greater than target value
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
    public static void main(String args[]){
        //declares integers in array
        int arr[] = {10,20,30,40,50};
        int key = 30;
        int last=arr.length-1;
        //declaring binary search
        binarySearch(arr,0,last,key);
    }
}