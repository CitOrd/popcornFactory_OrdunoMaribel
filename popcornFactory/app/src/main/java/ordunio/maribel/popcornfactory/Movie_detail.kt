package ordunio.maribel.popcornfactory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_movie_detail.*

class Movie_detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val  bundle= intent.extras
        if(bundle != null){

           movie_header.setImageResource(bundle.getInt("header"))
            movie_title_detail.setText(bundle.getString("titulo"))
           movie_summary.setText(bundle.getString("sinopsis"))
            seatsleft.setText(bundle.getInt("numberSeats"))

        }
    }
}