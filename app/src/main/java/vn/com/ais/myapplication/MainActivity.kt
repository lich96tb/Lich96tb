package vn.com.ais.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.PopupWindow
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = LayoutInflater.from(this).inflate(R.layout.layout_sugess, layoutParent, false)
        layoutParent.addView(view)

        HeightProvider(this).init().setHeightListener { height ->
            if (scrollables != null && height > 0) {
                scrollables.scrollTo(0,scrollables.scrollY+200)
            }
            Log.e("AAAAAAAAAAAAAaa ",height.toString())
            view.translationY = (-height).toFloat()
        }

    }
}