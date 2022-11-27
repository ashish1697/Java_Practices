package Arrays;

public class pivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};

        for (int i = 0; i < nums.length; i++) {
            int sumright=0;
            int sumleft=0;
            for(int j=0;j<i ;j++){
                sumright = sumright + nums[j];

            }
            for (int k = i; k < nums.length; k++) {
                sumleft = sumleft+nums[k];
            }
            if(sumright== sumleft){
                if(i==0 || i== nums.length){
                    System.out.println( 0);
                    break;
                }else {
                    System.out.println(i);
                    break;
                }
            }
        }System.out.println( -1);
    }
}
