package com.example.gamepractice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //@TODO: Setup your drawing tools
        ImageView ivFrame = (ImageView) findViewById(R.id.imageView);
        Bitmap b = Bitmap.createBitmap(300, 500, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(b);
        Paint paintbrush = new Paint();

        // @TODO: Set the color of your background & paintbrush
        canvas.drawColor(Color.BLACK);
        paintbrush.setColor(Color.argb(255,255,255,255));

        // @TODO: Add your code to draw things
        canvas.drawLine(10,50,200,50,paintbrush);
        canvas.drawRect(110, 110, 120, 120, paintbrush);
        canvas.drawCircle(200,200, 10,paintbrush);

        // @TODO: Write some text on the screen
        paintbrush.setTextSize(50);
        canvas.drawText("HELLO, THIS IS A GAME!", 0, 400, paintbrush);

        // @TODO: Put canvas in the frame
        ivFrame.setImageBitmap(b);

    }
}
