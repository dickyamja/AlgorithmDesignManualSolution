package material.array;

public class TwoDimensionalArray {
    int [][] array = null;

    public TwoDimensionalArray(int numOfRows, int numOfColumns){
        array = new int[numOfRows][numOfColumns];
    }

    public boolean insertToArray(int targetRowIndex, int targetColumnIndex, int value){
        int numOfRow = array.length;
        int numOfColumn = array[0].length;
        if ((targetRowIndex > numOfRow - 1) || (targetColumnIndex > numOfColumn - 1)){
            throw  new IllegalArgumentException("index [" + targetRowIndex + "][" + targetColumnIndex + "] is exceeding array max index");
        }
        array[targetRowIndex][targetColumnIndex] = value;
        return true;
    }

    public void traverseArray(){
        int numOfRow = array.length;
        int numOfColumn = array[0].length;
        for (int i=0; i < numOfRow; i++){
            for(int j=0; j < numOfColumn; j++){
                System.out.println("element at index [" + i + "][" + j + "] is " + array[i][j]);
            }
            System.out.println();
        }
    }

    public void searchInArray(int value){
        int numOfRow = array.length;
        int numOfColumn = array[0].length;
        for (int i=0; i < numOfRow; i++) {
            for (int j = 0; j < numOfColumn; j++) {
                if (array[i][j] == value)
                    System.out.println("value " + value + " found at index[" + i + "][" + j + "]");
            }
        }
    }
}
