public class JaggedArray {
    public static void main(String[] args) {
        int i,j;
        int nums[][] = new int[4][4];

        nums[0] = new int[5];
        nums[1] = new int[3];
        nums[2] = new int[2];
        nums[3] = new int[1];

        for(i=0;i<nums.length;i++){
            for(j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random()*10);
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
