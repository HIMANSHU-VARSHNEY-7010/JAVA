//  Q4) Create a two dimensional array of integers and display:
//      sum of all elements of each column
//      sum of all elements of each row
public class Java1_4 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{ {1,2,3} , {8,7,6} , {4,5,9} };
        System.out.println("Array:-");
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sums:-");
        for(int i=0 ; i<arr.length ; i++){
            int sum = 0;
            for(int j=0 ; j<arr[0].length ; j++){
                sum += arr[i][j];
            }
            System.out.println("Row " + (i+1) + " : " + sum);
        }
        for(int j=0 ; j<arr[0].length ; j++){
            int sum = 0;
            for(int i=0 ; i<arr.length ; i++){
                sum += arr[i][j];
            }
            System.out.println("Column " + (j+1) + " : " + sum);
        }
    }
}