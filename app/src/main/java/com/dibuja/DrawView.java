package com.dibuja;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;

public class DrawView extends View {
	Paint paint = new Paint();

	public DrawView(Context context) {
		super(context);
	}

	@Override
	public void onDraw(Canvas canvas) {
	   //.drawRect(left, top, right, bottom, paint)
        paint.setColor(Color.RED);
		canvas.drawRect(30, 30, 80, 80, paint);
	    paint.setColor(Color.CYAN);
		canvas.drawRect(33, 60, 77, 77, paint);
		paint.setColor(Color.YELLOW);
		canvas.drawRect(33, 33, 77, 60, paint);
		
		//.drawCircle(cx, cy, radius, paint);
		paint.setColor(Color.RED);
		canvas.drawCircle(100, 100, 20, paint);
		
		//.drawText(text, x, y, paint)
		canvas.drawText("Texto con CANVAS", 200, 30, paint);
		
		//.drawLine(startX, startY, stopX, stopY, paint)
        paint.setColor(Color.BLUE);
        canvas.drawLine(0, 0, 350, 100, paint);


		paint.setColor(Color.GREEN);
		canvas.drawLine(250, 300, 200, 400, paint);
		canvas.drawLine(300, 350, 200, 400, paint);

		canvas.drawLine(300, 350, 400, 400, paint);
		canvas.drawLine(350, 300, 400, 400, paint);

		canvas.drawLine(350, 300, 450, 240, paint);
		canvas.drawLine(330, 240, 450, 240, paint);

		canvas.drawLine(250, 300, 150, 240, paint);
		canvas.drawLine(270, 240, 150, 240, paint);

		canvas.drawLine(270, 240, 300, 140, paint);
		canvas.drawLine(330, 240, 300, 140, paint);


		/*canvas.drawArc(,0,72,true,paint);*/

		/*float[ ] estatura = new float[12];
		paint.setColor(Color.GREEN);
		canvas.drawLines(estatura,paint);*/

        /*Path trazo = new Path();
        trazo.addCircle(150, 450, 100, Path.Direction.CCW);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(trazo, paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(20);
        paint.setTypeface(Typeface.SANS_SERIF);
        canvas.drawTextOnPath("Cecyt 9 \"Juan de Dios Bátiz\" graficos en Android ", trazo, 150, 40, paint);*/

        Path circulos = new Path();
		circulos.addCircle(150, 530, 100, Path.Direction.CCW);
		circulos.addCircle(450, 530, 100, Path.Direction.CCW);
		paint.setColor(Color.BLUE);
		paint.setStrokeWidth(8);
		paint.setStyle(Paint.Style.STROKE);
		canvas.drawPath(circulos, paint);
		canvas.drawTextOnPath("Ibañez Celis Israel  6IM7", circulos, 300, 50, paint);

	}

}
