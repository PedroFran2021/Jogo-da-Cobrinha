public interface Stage {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final int PLAY_HEIGHT = 520;
    public static final int SPEED = 10;

    public Object getSoundManager();

    public SpriteManager getSpriteManager();
}