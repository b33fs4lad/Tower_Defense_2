package tile;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import main.GameScreen;

public class TileManager {

    GameScreen gameScreen;
    Tile[] tile;

    public TileManager(GameScreen gameScreen) {

        this.gameScreen = gameScreen;
        tile = new Tile[6];
        getTileImage();

    }

    public void getTileImage(){

        try {
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/grass holder.png"));
            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/path holder.png"));

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g2){
        g2.drawImage(tile[0].image, 0, 0, 64, 64, null);
    }
}
