import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class SpriteManager extends ResourceCache {
    protected Object loadResource(URL url) {
        try {
            return ImageIO.read(url);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar o Jogo." + "Por favor, verifique a instalação.",
                    "Erro!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            return null;
        }
    }

}
