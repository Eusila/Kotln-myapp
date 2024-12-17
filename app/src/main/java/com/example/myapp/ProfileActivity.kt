import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.R

class ProfileActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_user)


        val nameText = intent.getStringExtra("name")


        val welcomeTextView: TextView = findViewById(R.id.textView4)
        val textView: TextView = findViewById(R.id.textView5)


        welcomeTextView.text = "Welcome, $nameText!"
        textView.text = "And so the Adventure begins."
    }
}
