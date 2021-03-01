import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Principal {

    public static void main(String[] args){

        int[] test = {5,2,8,1,3};
        completeMissingNumber(sortArray(test));
    }

    public static int[] sortArray(int[] a){

        int[] b = new int[a.length];

        for(int k=0; k<b.length; k++){

            int min = getMinArrayValue(a);
            b[k] = min;
            a = deleteArrayElement(min, a);
        }
        return b;
    }

    public static int[] deleteArrayElement(int min, int[] a){
        int[] c = new int[a.length-1];
        int j = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] != min) {
                c[j] = a[i];
                j++;
            }
        }
        return c;
    }
    public static int getMinArrayValue(int[] a){
        int min = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        return min;
    }

    public static int getMaxArrayValue(int[] a){
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    public static int[] completeMissingNumber(int[] a){
        int min = getMinArrayValue(a);
        int max = getMaxArrayValue(a);
        int[] finalArray = new int[max-min+1];

        System.out.println("list completed");
        for(int i=0; i<=max-min; i++){
          finalArray[i] = min + i;
            System.out.print(finalArray[i] + " - ");
        }
        return a;
    }

    @Test
    public void validateMaxValue(){
        int a[] = {1,2,6,8,9};
        int maxValue = getMaxArrayValue(a);
        assertEquals(maxValue,9);
    }

    @Test
    public void validateMinValue(){
        int a[] = {5,12,3,8,21};
        int maxValue = getMinArrayValue(a);
        assertEquals(maxValue,3);
    }
}
