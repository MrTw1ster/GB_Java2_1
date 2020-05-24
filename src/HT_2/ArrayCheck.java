package HT_2;

public class ArrayCheck {

    public static int arrayCheck(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Array length not equals to 4");
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum+= Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("Incorrect data format [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}