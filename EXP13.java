
class EXP13 {
  static void bubbleSort(int[] arr){
    int n = arr.length;
    int temp =0;
    for(int i=0; i<n; i++){
      for(int j=1; j<(n-i); j++){
        if(arr[j-1] > arr[j]){
          temp = arr[j-1];  //swap elements
        arr[j-1] = arr[j];
        arr[j] = temp;
        }
      }
    }
  }
    public static void main(String args[]){
      int arr[] = {56,23,89,12,0,35,85,8990,9876};
      System.out.print("Array before Sorting: ");
      for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
      }
      System.out.println();
      bubbleSort(arr); //sorting array 
      System.out.print("Array after sorting: ");
      for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
      }
  }
}
