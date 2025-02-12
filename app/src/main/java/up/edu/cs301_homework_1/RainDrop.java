package up.edu.cs301_homework_1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

public class RainDrop {
    protected int x;
    protected int y;
    protected int rad = 30;
    protected Paint myPaint; // how the spot is drawn
    protected Random rando = new Random();

    /** gives the spot a random colored paint */
    protected void setRandomPaint() {
        int color = Color.rgb(rando.nextInt(256), rando.nextInt(256), rando.nextInt(256));
        myPaint = new Paint();
        myPaint.setColor(color);
    }

    public RainDrop() {
        x = rando.nextInt(800);
        y = rando.nextInt(800);
        setRandomPaint();
    }

    public RainDrop(int inX, int inY) {
        x = inX;
        y = inY;
        setRandomPaint();
    }

    public void draw(Canvas canvas) {
        canvas.drawCircle(x, y, rad, myPaint);
    }
}//class RainDrop
