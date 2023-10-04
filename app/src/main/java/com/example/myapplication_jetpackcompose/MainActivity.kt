import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
// ... Other imports for Jetpack Compose
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content of this activity to the MessageCard Composable
        setContent {
            MessageCard("Android")
        }
    }
}

@Composable
fun MessageCard(name: String) {
    // Define a Composable function called MessageCard that takes a 'name' parameter
    Text(text = "Hello $name!") // Display a Text Composable with a greeting message
}

@Preview
@Composable
fun PreviewMessageCard() {
    // Define a Composable function called PreviewMessageCard
    MessageCard("Android") // Display the MessageCard Composable with a specific 'name'
}
