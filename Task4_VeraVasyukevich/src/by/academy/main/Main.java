package by.academy.main;

import java.lang.String;

public class Main {
private static final int SIZE = 10;

    public static void main(String[] args) {
        String[][] matrix = newMatrix();
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length;j++){
                System.out.println(matrix[i][j]);
            }
        }
        System.out.println();
}
public static String[][] newMatrix(){
    String[][] matrix = new String[SIZE][SIZE];
    for (int i=0; i< matrix.length; i++){
        for (int j=0;j<matrix[i].length;j++){
            if ((j + 1) % 3 == 0) {
                matrix[i][j] = getRandomNumber(1) + " ";
            } else
                matrix[i][j] = (getRandomSymbol(6) + " ");
        }
        }
    return  matrix;
    }

    private static int getRandomNumber(int num){

        return (int)(Math.random()*10);

    }

    private static String  getRandomSymbol(int count){
        String abc = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            int numb = (int) (Math.random() * abc.length());
            char c = abc.charAt(numb);
            result.append(c);
        }
        return result.toString();

    }

}
//очень сложно,  сделала плохо, можно даже сказать не сделала