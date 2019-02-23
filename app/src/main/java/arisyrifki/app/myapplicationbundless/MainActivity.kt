package arisyrifki.app.myapplicationbundless

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            openLoginActivity(this@MainActivity, "Kalian Keren cuy!")
        }


        btnProfile.setOnClickListener {
            openProfileActivity(this@MainActivity)
        }
    }
}
