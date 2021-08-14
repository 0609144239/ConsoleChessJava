package com.company.Piece;

public class Pawn implements Piece{

    private String p = "";
    private String P = "";



    @Override
    public void setPiece(squareCoord RF, Piece piece, Piece[] Board) {

    }

    @Override
    public boolean canMove(squareCoord start, squareCoord end) {
        return false;
    }

    @Override
    public boolean hasCaptured(Piece[] Board) {
        return false;
    }

    @Override
    public boolean isCaptured(Piece[] Board) {
        return false;
    }

    @Override
    public void displayPiece(String type) {

    }


}
