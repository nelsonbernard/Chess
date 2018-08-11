import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    private int rows = 10;
    private int columns = 10;
    private int tileWidth, tileHeight;
    private PieceType[][] pieceTypeArray = new PieceType[rows][columns];
    private Graphics2D g2d;

    public Board(int width, int height){
        this.tileWidth = (width - 50) / rows;
        this.tileHeight = (height - 50) / columns;
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(width, height));

        initializeBoard();
    }

    private void initializeBoard(){
        PieceType[][] pieces = new PieceType[][]{
                {PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN},
                {PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN},
                {PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN},
                {PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN},
                {PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN},
                {PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN},
                {PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN},
                {PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN},
                {PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN},
                {PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN}};

        this.pieceTypeArray = pieces;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setBackground(Color.red);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){

                if(i % 2 == 0)
                    if(j % 2 == 0)
                        g2d.setColor(Color.WHITE);
                    else
                        g2d.setColor(Color.BLACK);
                else
                    if(j % 2 != 0)
                        g2d.setColor(Color.WHITE);
                    else
                        g2d.setColor(Color.BLACK);

                g2d.fillRect(this.tileWidth * i + 25, this.tileHeight * j, this.tileWidth, this.tileHeight);
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(this.pieceTypeArray[i][j] == PieceType.PAWN){
                    g2d.setColor(Color.GREEN);
                    g2d.fillRect((this.tileWidth * i) + 50, (this.tileHeight * j) + 25, this.tileWidth / 2, this.tileHeight / 2);
                }
            }
        }
    }
}
