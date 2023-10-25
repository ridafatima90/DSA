package recursion;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static recursion.Result.crosswordPuzzle;

class Result {

    public static List<String> crosswordPuzzle(List<String> crossword, String words) {
        // Write your code here
        char[][]puzzle = new char[crossword.size()][crossword.get(0).length()];

        for(int i = 0; i < crossword.size(); i++){
            puzzle[i]= crossword.get(i).toCharArray();
        }

        solve(puzzle, words.split(";"),0,0);

//        List<String>modifiedCrossword = new ArrayList<>();
//        for(char[]row: puzzle) {
//            modifiedCrossword.add(new String(row));
//        }
//        return modifiedCrossword;

//        for(int i = 0; i < crossword.size(); i++){
//            crossword.set(i, new String(puzzle[i]));
//        }

        return crossword;
    }


    private static boolean solve(char[][] puzzle, String[] words, int row, int col){
        if(row == puzzle.length){
            return col== puzzle[0].length || solve(puzzle, words, 0, col + 1);
        }

        if (col == puzzle[row].length) {
            // Reached the end of columns for the current row, move to the next row
            return solve(puzzle, words, row + 1, 0);
        }

        if(puzzle[row][col] == '-'){
            for(String word: words){
                if(tryHorizontal(puzzle, word, row, col)){
                    if(solve(puzzle, words, row, col+1)){
                        return true;
                    }
                    undoHorizontal(puzzle, word, row, col);
                }

                if(tryVertical(puzzle, word, row, col)){
                    if(solve(puzzle, words, row+1, 0)){
                        return true;
                    }
                    undoVertical(puzzle, word, row, col);
                }
            }
        }else {
            return solve(puzzle, words, row, col + 1);
        }
        return false;
    }

    private static boolean tryHorizontal(char[][] puzzle, String word, int row, int col){

        if(col + word.length() > puzzle[row].length){
            return false;
        }

        for(int i = 0; i< word.length(); i++){
            char current = puzzle[row][col + i];
            if(current != '-' && current != word.charAt(i)){
                return false;
            }
        }

        for(int i = 0; i < word.length(); i++){
            puzzle[row][col + i] = word.charAt(i);
        }

        return true;
    }


    private static boolean tryVertical(char[][]puzzle, String word, int row, int col){

        if(row + word.length() > puzzle.length){
            return false;
        }

        for(int i = 0; i < word.length(); i++){
            char current = puzzle[row + i][col];
            System.out.println("row: " + (row + i) + ", col: " + col + ", char: " + word.charAt(i) + ", current: " + current);
            if(current != '-' && current != word.charAt(i)){
                return false;
            }
        }

        for(int i = 0; i < word.length(); i++){
            puzzle[row +i][col] = word.charAt(i);
        }

        return true;
    }

    public static void undoHorizontal(char[][] puzzle, String word, int row, int col){
        for(int i = 0; i< word.length(); i++){
            char current = puzzle[row][col + i];
            if(current == word.charAt(i))
                puzzle[row][col + i] = '-';
        }
    }

    public static void undoVertical(char[][] puzzle, String word, int row, int col){
        for(int i = 0; i< word.length(); i++){
            char current = puzzle[row+i][col];
            if(current == word.charAt(i))
                puzzle[row+ i][col] = '-';
        }
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> crossword = List.of(
                "+-++++++++",
                "+-++++++++",
                "+-++++++++",
                "+-----++++",
                "+-+++-++++",
                "+-+++-++++",
                "+++++-++++",
                "++------++",
                "+++++-++++",
                "+++++-++++"
        );


        String words = "LONDON;DELHI;ICELAND;ANKARA";

        List<String> result = crosswordPuzzle(crossword, words);
        for (String row : result) {
            System.out.println(row);
        }



    }
}
