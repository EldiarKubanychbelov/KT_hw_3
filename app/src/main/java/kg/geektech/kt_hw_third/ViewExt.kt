package kg.geektech.kt_hw_third


import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.rv_item.view.*

fun ImageView.load(url:String) {

    Glide.with(context).load(url).centerCrop().into(image_view)
}