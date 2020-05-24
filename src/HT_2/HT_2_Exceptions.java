package HT_2;

public class HT_2_Exceptions {

    public static void main(String[] args) {
        String[][] arStringNm = new String[4][4];

        arStringNm[0][0] = "111";
        arStringNm[0][1] = "23";
        arStringNm[0][2] = "4";
        arStringNm[0][3] = "444400";
        arStringNm[1][0] = "rf";
        arStringNm[1][1] = "251";
        arStringNm[1][2] = "4444";
        arStringNm[1][3] = "24644";
        arStringNm[2][0] = "346";
        arStringNm[2][1] = "124";
        arStringNm[2][2] = "23456";
        arStringNm[2][3] = "10004";
        arStringNm[3][0] = "345";
        arStringNm[3][1] = "23523";
        arStringNm[3][2] = "346";
        arStringNm[3][3] = "1234";

        try{
            System.out.println(ArrayCheck.arrayCheck(arStringNm));
        } catch (MyArraySizeException e){
            System.out.println(e.message);
        } catch (MyArrayDataException e) {
            System.out.println(e.message);
        }
    }

}
