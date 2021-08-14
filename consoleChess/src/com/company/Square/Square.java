package com.company.Square;

public class Square {

    private final SquareColor squareColor;
    private final Location location;
    private boolean isOccupied;


    //SQUARE CONSTRUCTOR
    public Square(SquareColor squareColor, Location location) {

        this.squareColor = squareColor;
        this.location = location;
        this.isOccupied = false;
    }

    //CLEAR SQUARE
    public void clearSquare() {

        this.isOccupied = false;
    }

    //RETURNS SQUARE COLOR
    public SquareColor getSquareColor() {

        return squareColor;
    }

    //RETURNS SQUARE LOCATION
    public Location getLocation() {

        return location;
    }

    @Override
    public String toString() {

        return "Square[" + "squareColor=" + squareColor + ", location=" + location + ", isOccupied=" + isOccupied + ']';
    }
}
