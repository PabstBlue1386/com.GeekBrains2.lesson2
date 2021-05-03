import exeptions.IsNotANum;
import exeptions.MaxSizeArray;

public class MainApp {

    public static void main(String[] args) {

        String[][] array = new String[][]{
                {"72", "23", "64", "43"},
                {"45", "34", "32", "75"},
                {"63", "93", "12", "79"},
                {"82", "47", "2", "20"}};
        try {
            System.out.println("Сумма элеменов массива: " + sum(array));
        } catch (MaxSizeArray a) {
            a.getMesseage();
        } catch (IsNotANum a) {
            System.out.println("Здесь не число: " + a.getCord());
        }


    }

    public static int sum(String[][] arr) throws IsNotANum, MaxSizeArray {
        int summa = 0;

        int maxSizeArray = 4;
        if (arr.length > 4) {
            throw new MaxSizeArray("Превышен максимальный размер массива: ", maxSizeArray);
        }


        for (int i = 0; i < arr.length; i++) {


            if (arr[i].length > maxSizeArray) {
                throw new MaxSizeArray("Превышен максимальный размер массива: ", maxSizeArray);
            }
            for (int j = 0; j < arr[i].length; j++) {

                try {

                    summa = summa + Integer.parseInt(arr[i][j]);


                } catch (NumberFormatException a) {

                    throw new IsNotANum(i, j);

                }


            }
        }
        return summa;
    }


}
