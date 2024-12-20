
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.R

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_user)

        val username = intent.getStringExtra("username")


        val welcomeTextView: TextView = findViewById(R.id.textView4)
        val TextView: TextView = findViewById(R.id.textView5)

        welcomeTextView.text = "Welcome, $username!"
        TextView.text= "And So the Adventure Begins."

    }
}

