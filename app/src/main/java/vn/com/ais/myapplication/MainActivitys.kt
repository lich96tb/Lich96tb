//package vn.com.ais.myapplication
//
//import android.content.Context
//import android.view.View
//import androidx.appcompat.app.AppCompatActivity
//import vn.com.ais.myapplication.R
//
//class MainActivitys : AppCompatActivity() {
//    private var mContext: Context? = null
//    private var mActivity: Activity? = null
//    private var mRelativeLayout: RelativeLayout? = null
//    private var mButton: Button? = null
//    private var mPopupWindow: PopupWindow? = null
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        // Get the application context
//        mContext = applicationContext
//
//        // Get the activity
//        mActivity = this@MainActivity
//
//        // Get the widgets reference from XML layout
//        mRelativeLayout = findViewById<View>(R.id.rl) as RelativeLayout
//        mButton = findViewById<View>(R.id.btn) as Button
//
//        // Set a click listener for the text view
//        mButton.setOnClickListener(object : OnClickListener() {
//            fun onClick(view: View?) {
//                val inflater: LayoutInflater =
//                    mContext.getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
//
//                val customView: View = inflater.inflate(R.layout.custom_layout, null)
//                mPopupWindow = PopupWindow(
//                    customView,
//                    LayoutParams.WRAP_CONTENT,
//                    LayoutParams.WRAP_CONTENT
//                )
//                if (Build.VERSION.SDK_INT >= 21) {
//                    mPopupWindow.setElevation(5.0f)
//                }
//
//                val closeButton: ImageButton = customView.findViewById(R.id.ib_close) as ImageButton
//
//                // Set a click listener for the popup window close button
//                closeButton.setOnClickListener(object : OnClickListener() {
//                    fun onClick(view: View?) {
//                        mPopupWindow.dismiss()
//                    }
//                })
//                mPopupWindow.showAtLocation(mRelativeLayout, Gravity.CENTER, 0, 0)
//            }
//        })
//    }
//}