package com.company.Piece;

import com.company.Board.Board;

public interface Piece {



    //ALGEBRAIC NOTATION
    enum squareCoord {

        a8(0),  b8(1),  c8(2),  d8(3),  e8(4),  f8(5),  g8(6),  h8(7),
        a7(16), b7(17), c7(18), d7(19), e7(20), f7(21), g7(22), h7(23),
        a6(32), b6(33), c6(34), d6(35), e6(36), f6(37), g6(38), h6(39),
        a5(48), b5(49), c5(50), d5(51), e5(52), f5(53), g5(54), h5(55),
        a4(64), b4(65), c4(66), d4(67), e4(68), f4(69), g4(70), h4(71),
        a3(80), b3(81), c3(82), d3(83), e3(84), f3(85), g3(86), h3(87),
        a2(96), b2(97), c2(98), d2(99), e2(100),f2(101),g2(102),h2(103),
        a1(112),b1(113),c1(114),d1(115),e1(116),f1(117),g1(118),h1(119);

        public final int Coord;

        squareCoord(int Coord) {
            this.Coord = Coord;
        }

    }

    // SET PIECE USING ALGEBRAIC NOTATION
    default void setPiece(squareCoord RF, Piece piece, Piece[] Board) {

        //uses rank and file to get Board index
        Board[RF.Coord] = piece;

    }

    // CHECKS IF MOVE IS VALID
    boolean canMove(squareCoord start, squareCoord end);

    // CAPTURE FUNCTION
     boolean hasCaptured(Piece[]Board);

    // CAPTURED FUNCTION
    boolean isCaptured(Piece[] Board);

    //DISPLAY FUNCTION
    void displayPiece(String type);






}
