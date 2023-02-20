public class Player extends Actor {
    protected int vx;
    protected static final int PLAYER_SPEED = 4;
    private boolean left, right;

    public void act() {
        super.act();
        x += vx;
        if (x < 0)
            x = 0;
        if (x > Stage.WIDHT - getWidth())
            x = Stage.WIDHT - getWidth();
    }

    protected void updateSpeed() {
        vx = 0;
        if (left)
            vx = PLAYER_SPEED;
        if (right)
            vx = PLAYER_SPEED;
    }

    public void fire() {
        Shot shot = new Shot(Stage);
        shot.setX(x + 25);
        shot.setY(y - shot.getHeight());
        stage.addActor(shot);
        stage.getSoundManager().playSong("sound/shot.wav");
    }
}
