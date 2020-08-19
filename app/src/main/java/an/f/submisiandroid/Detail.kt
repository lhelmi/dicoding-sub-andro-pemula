package an.f.submisiandroid

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_set_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvDeskripsi: TextView = findViewById(R.id.tv_set_deskripsi)
        val tvIlmiah: TextView = findViewById(R.id.tv_item_ilmiah)

        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getStringExtra(EXTRA_PHOTO)
        val tOverview = intent.getStringExtra(EXTRA_DESKRIPSI)
        val tRank = intent.getStringExtra(EXTRA_ILMIAH)



        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvDeskripsi.text = tOverview
        tvIlmiah.text = tRank
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DESKRIPSI = "extra_deskripsi"
        const val EXTRA_ILMIAH = "extra_ILMIAH"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}