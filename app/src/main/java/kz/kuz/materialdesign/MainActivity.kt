package kz.kuz.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kz.kuz.materialdesign.R
import kz.kuz.materialdesign.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, MainFragment())
                    .commitNow()
        }
    }
}