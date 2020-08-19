package an.f.submisiandroid

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler


class Splash : Activity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@Splash, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}