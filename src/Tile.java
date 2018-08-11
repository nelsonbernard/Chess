// Sets up a single tile class
// Used later to generate 64 tiles for game board
public abstract class Tile {

    int tileNum;

    Tile(int tileNum){
        this.tileNum = tileNum;
    }

    public abstract boolean isTileOccupied();
    public abstract PieceType getPiece();

    public static final class EmptyTile extends Tile{

        EmptyTile(int tileNum){
            super(tileNum);
        }

        @Override
        public boolean isTileOccupied(){
            return false;
        }

        @Override
        public PieceType getPiece(){
            return null;
        }
    }

    public static final class OccupiedTile extends Tile{

        PieceType pieceTypeOnTile;

        OccupiedTile(int tileNum, PieceType pieceType){
            super(tileNum);
            this.pieceTypeOnTile = pieceType;
        }

        @Override
        public boolean isTileOccupied(){
            return true;
        }

        @Override
        public PieceType getPiece(){
            return this.pieceTypeOnTile;
        }
    }


}
