public class Actor {
    protected int x, y;
    protected int WIDHT, HEIGHT;
    protected String[] sprinteNames;
    protected Stage stage;
    protected SpriteManager sprinteManager;
    protected int currentFrame;
    protected int frameSpeed, t;
    protected boolean remove;

    public Actor(Stage stage) {
        this.stage = stage;
        sprinteManager = stage.getSpriteManager();
        currentFrame = 0;
        frameSpeed = 1;
        t = 0;
    }

    public void paint(Graphics2D g) {
        Object spriteManager;
        g.drawImage(spriteManager.getSprite(spriteNames[currentFrame]), x, y, stage);
    }

    public void setRemove() {
        remove = true;
    }

    public boolean isSetToRemove() {
        return remove;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, WIDHT, HEIGHT);
    }

    public void act() {
        t++;
        if (t % frameSpeed == 0) {
            t = 0;
            currentFrame = (currentFrame + 1) % spriteNames.length;

        }
    }
}
