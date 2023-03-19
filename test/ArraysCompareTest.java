import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraysCompareTest {

    @Test
    public void testRandomArray(){
        int [] numbers = {12,3,4,1};
        int [] expected = {1,3,4,12};
        Arrays.sort(numbers);
        assertArrayEquals(expected,numbers);//for arrays, we don't use assertEquals as it is
    }

    @Test
    public void testRandomArray_Null() {  //to test null pointer exception
        int[] numbers = null;
        int[] expected = null;
        try {
        Arrays.sort(numbers);
    } catch (NullPointerException e){}
        //assertArrayE(expected,numbers);//for arrays we dont use assertEquals as it is
    }

    @Test(expected = NullPointerException.class)//another way to test null pointer exception
    public void testArraySort_NullArray()
    {
       // int [] numbers = {};//empty array is not null
        int [] numbers = null;
        Arrays.sort(numbers);
    }

    //test the performance of th array
    @Test(timeout = 50)
    public void testPerfomance(){

        int array[] = {12,34,56};
        for(int i =1 ; i<=1000000; i++){
            array[0] = i;
            Arrays.sort(array);

        }
    }



}