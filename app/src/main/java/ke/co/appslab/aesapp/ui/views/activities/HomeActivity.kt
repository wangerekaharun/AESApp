package ke.co.appslab.aesapp.ui.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ke.co.appslab.aesapp.R

/**
 *  Home Activity which is the Launcher Activity
 */

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}