package com.yourcompany.opengltexture;

import android.opengl.GLES20;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.opengl.GLUtils;

class SampleRenderWorker implements OpenGLRenderer.Worker {

    private double _tick = 0;

    @Override
    public void onCreate() {

    }

    @Override
    public boolean onDraw() {


        /*
        // Create an empty, mutable bitmap
        Bitmap bitmap = Bitmap.createBitmap(128, 128, Bitmap.Config.ARGB_4444);
        // get a canvas to paint over the bitmap
        Canvas canvas = new Canvas(bitmap);

        // Draw the text
        Paint textPaint = new Paint();
        textPaint.setTextSize(16);
        textPaint.setAntiAlias(true);
        textPaint.setARGB(0xff, 0x00, 0x00, 0x00);
        // draw the text centered
        canvas.drawText("Hello World", 16, 112, textPaint);

        //Generate one texture pointer...

        GLES20.glActiveTexture(GLES20.GL_TEXTURE0);
        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, 0); //textureID = 0
        //GLES20.glEnable(GLES20.GL_BLEND); // this, and the next line
        //GLES20.glBlendFunc(GLES20.GL_ONE, GLES20.GL_ONE_MINUS_SRC_ALPHA); // and this were key! I'm still not completely sure as to what this is doing, but it works!
        GLUtils.texImage2D(GLES20.GL_TEXTURE_2D, 0, GLES20.GL_RGBA, bitmap, 0);

        //Clean up
        bitmap.recycle();
        */

        //original opengl example

        _tick = _tick + Math.PI / 60;
        float green = (float) ((Math.sin(_tick) + 1) / 2);
        GLES20.glClearColor(0f, green, 0f, 1f);
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT | GLES20.GL_DEPTH_BUFFER_BIT);

        return true;
    }

    @Override
    public void onDispose() {

    }
}
