package com.company.Board;


import com.company.Square.File;
import com.company.Square.Square;
import com.company.Square.SquareColor;
import com.company.Square.Location;

public class Board {


   private Square[][] chessBoard = new Square[8][8];

    public Board(){

        for(int r = 0; r < chessBoard.length; r++) {
             int column = 0;
             SquareColor currentColor;
             if(r % 2 == 0) {
                 currentColor = SquareColor.WHITE;
            }
            else{
                 currentColor = SquareColor.BLACK;
            }
            for(File file : File.values()) {
                Square square = new Square(currentColor, new Location(file, r));
                chessBoard[r][column] = square;
                if(currentColor == SquareColor.BLACK){
                    currentColor = SquareColor.WHITE;
                }
                else{
                    currentColor = SquareColor.BLACK;
                }
                column++;
            }
        }

    }

    public void printBoard() {
        System.out.print("\033[H\033[2J");

        for(Square[] row : chessBoard) {
            for(Square square : row) {
                System.out.print(square);
            }
            System.out.println();
        }
    }



}
