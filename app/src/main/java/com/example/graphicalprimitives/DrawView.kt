package com.example.graphicalprimitives  // Replace with your actual package name

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class DrawView(context: Context, attrs: AttributeSet?) : View(context, attrs) {

    private val paint = Paint()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Draw Circle
        paint.color = Color.RED
        canvas.drawCircle(200f, 200f, 100f, paint)

        // Draw Ellipse
        paint.color = Color.BLUE
        canvas.drawOval(100f, 400f, 300f, 500f, paint)

        // Draw Rectangle
        paint.color = Color.GREEN
        canvas.drawRect(100f, 600f, 300f, 750f, paint)

        // Draw Text
        paint.color = Color.BLACK
        paint.textSize = 50f
        canvas.drawText("Hello Graphics!", 100f, 850f, paint)
    }
}