public class sparse{
    public static void main(String[] args) {
        int rows, cols, size, count=0;
        int a[][]={{0,0,1},{1,0,0},{0,5,6},};
        rows=a.length;
        cols=a[0].length;
        size=rows*cols;
        for(int i =0;i<=2;i++){
            for(int j=0;j<=2;j++){
                if(a[i][j]==0){
                    count++;
                }
            }
        }
        if (count>(size/2)){
            System.out.println("Matrix is Sparse matrix");
        }
        else{
            System.out.println("Not Sparse matrix");
        }
        }
}