package com.frankchang.customview_demo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


public class MyCustomView extends View {

    public MyCustomView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 取得畫面寬、高
        int width = getWidth();
        int height = getHeight();

        // 設置畫筆
        Paint p1 = new Paint();
        p1.setColor(Color.RED);

        Paint p2 = new Paint();
        p2.setColor(Color.GREEN);
        p2.setTextSize(100f);

        // 讀取圖檔
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.func_exit);

        // 開始繪圖
        canvas.drawCircle(150, 150, 100, p1);
        canvas.drawText("Demo", width / 3, height / 3, p2);
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, width / 2, height / 2, null);
        }
    }

}
