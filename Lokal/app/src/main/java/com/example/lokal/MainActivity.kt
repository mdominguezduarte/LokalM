package com.example.lokal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


/** Status bar is keeped
 * app bar must be changed
 * Implement data binding library
 * Add Timer: https://developer.android.com/codelabs/kotlin-android-training-live-data-transformations#3
 * https://developer.android.com/training/data-storage/room
 * https://github.com/google-developer-training/android-kotlin-fundamentals-apps/tree/master/RecyclerViewFundamentals
 * https://github.com/google-developer-training/android-kotlin-fundamentals-apps/tree/master/RecyclerViewGridLayout

*/

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** example of autocomplete that will use with database
    // Get a reference to the AutoCompleteTextView in the layout
    val textView = findViewById(R.id.autocomplete_country) as AutoCompleteTextView
    // Get the string array
    val countries: Array<out String> = resources.getStringArray(R.array.countries_array)
// Create the adapter and set it to the AutoCompleteTextView
    ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries).also { adapter ->
        textView.setAdapter(adapter)
    }
     */
/** example of hide keyboard
    private fun addNickname(view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)

        nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }

*/
}