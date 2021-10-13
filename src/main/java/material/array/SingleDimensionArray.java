package material.array;

public class SingleDimensionArray {

    int array[] = null;

    public SingleDimensionArray(int lengthOfArray){
        array = new int[lengthOfArray];
    }

    public boolean insertToArray(int targetIndex, int value){
        if (targetIndex > array.length - 1){
            throw  new IllegalArgumentException("index " + targetIndex + " is exceeding array max index");
        }
        array[targetIndex] = value;
        return true;
    }

    public void traverseArray(){
        int length = array.length;
        for (int i=0; i < length; i++){
            System.out.println("element at index " + i + " is " + array[i]);
        }
    }

    public void searchInArray(int value){
        int length = array.length;
        for (int i=0; i < length; i++){
            if(array[i] == value)
            System.out.println("value " + value + " found at index " + i);
        }
    }
}
