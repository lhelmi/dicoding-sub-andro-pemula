package an.f.submisiandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvKura: RecyclerView
    private var list: ArrayList<Cat> = arrayListOf()
    private var title: String = "Beranda"
    var doubleBackToExitOnce:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        setActionBarTitle(title)

        rvKura = findViewById(R.id.rv_kura)
        rvKura.setHasFixedSize(true)

        list.addAll(CatData.listData)
        showRecyclerList()
    }

    override fun onBackPressed() {
        if(doubleBackToExitOnce){
            super.onBackPressed()
            return
        }

        this.doubleBackToExitOnce = true

        //displays a toast message when user clicks exit button
        Toast.makeText(applicationContext,"Tekan sekali lagi jika ingin keluar",Toast.LENGTH_SHORT).show()

        //displays the toast message for a while
        Handler().postDelayed({
            kotlin.run { doubleBackToExitOnce = false }
        }, 2000)

    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null){
            (supportActionBar as ActionBar).title = title
        }
    }

    private fun showRecyclerList() {
        rvKura.layoutManager = LinearLayoutManager(this)
        val listUnivAdapter = CardCatAdapter(list)
        rvKura.adapter = listUnivAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.optionmenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.miCompose -> {
                val iAbout = Intent(this@MainActivity, About::class.java)
                startActivity(iAbout)
            }
        }

    }

}
