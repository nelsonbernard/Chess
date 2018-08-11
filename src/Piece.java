public abstract class Piece {

    private int m_x;
    private int m_y;
    private PieceType m_pieceType;
    private boolean isAlive;

    public Piece(int x, int y, PieceType type){
        this.m_x = x;
        this.m_y = y;
        this.m_pieceType = type;
        this.isAlive = true;
    }

    public int getXPosition() {
        return m_x;
    }

    public void setXPosition(int m_x) {
        this.m_x = m_x;
    }

    public int getYPosition() {
        return m_y;
    }

    public void setYPosition(int m_y) {
        this.m_y = m_y;
    }

    public PieceType getPieceType() {
        return m_pieceType;
    }

    public void setPieceType(PieceType m_pieceType) {
        this.m_pieceType = m_pieceType;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean getAlive(){
        return isAlive;
    }
}
