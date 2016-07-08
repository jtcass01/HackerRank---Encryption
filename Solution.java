import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "", output = "";
        int rows, collumns;
        
        while(scan.hasNext()){
            input += scan.next();
        }
        rows = (int) Math.floor(Math.sqrt(input.length()));
        collumns = (int) Math.ceil(Math.sqrt(input.length()));
        
        if (collumns*rows < input.length()){
            rows++;
        }
        
        //System.out.println(rows + "+" + collumns);
        
        char matrix[][] = new char[rows][collumns];
        
        //Store message in array
        for(int row_i=0; row_i<rows; row_i++){
            for(int collumn_i=0; collumn_i<collumns; collumn_i++){
                if(((row_i*collumns)+collumn_i) < (input.length())){
                    matrix[row_i][collumn_i] = input.charAt((row_i*collumns)+collumn_i);
                }
            }
        }
        
        //Method created to test array and print its contents
        /*
        for(int row_i=0; row_i<rows; row_i++){
            for(int collumn_i=0; collumn_i<collumns; collumn_i++){
                if(((row_i*collumns)+collumn_i) < (input.length())){
                    System.out.print(matrix[row_i][collumn_i]);
                }
            }
            System.out.println();
        }*/
        
        //rewrite array into output
        for(int collumn_i=0; collumn_i<collumns; collumn_i++){
            for(int row_i=0; row_i<rows; row_i++){
                if(((row_i*collumns)+collumn_i) < (input.length())){
                    output += matrix[row_i][collumn_i];
                    //System.out.println("Hi");
                }
            }
            if(collumn_i < (collumns-1)){
                output+=" ";
            }
        }
        System.out.println(output);
        //System.out.println("Hello");
    }
}
