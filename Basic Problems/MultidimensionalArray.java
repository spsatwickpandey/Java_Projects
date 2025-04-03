public class MultidimensionalArray{
    public static void main(String[] args) {
        int i,j;
        int nums[][] = new int[3][4];
    
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                nums[i][j]=(int)(Math.random()*10);
            }
        }
    
        for(int n[]:nums){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
