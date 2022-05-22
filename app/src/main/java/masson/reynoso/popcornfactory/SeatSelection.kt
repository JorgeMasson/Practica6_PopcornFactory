package masson.reynoso.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class SeatSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat_selection)

        val title: TextView = findViewById(R.id.title_seats)
        var posMovie = -1

        val bundle = intent.extras

        if(bundle != null) {
            title.setText(bundle.getString("name"))
            posMovie = bundle.getInt("id")
        }

        val btn_confirm: Button = findViewById(R.id.btn_confirm)

        btn_confirm.setOnClickListener {
            Toast.makeText(this, "Enjoy the movie!", Toast.LENGTH_LONG).show()
        }

        val row1: RadioGroup = findViewById(R.id.row1)
        val row2: RadioGroup = findViewById(R.id.row2)
        val row3: RadioGroup = findViewById(R.id.row3)
        val row4: RadioGroup = findViewById(R.id.row4)

        row1.setOnCheckedChangeListener{group, checkedId->
            if(checkedId > -1 ){
                row2.clearCheck()
                row3.clearCheck()
                row4.clearCheck()

                row1.check(checkedId)
            }
        }

        row2.setOnCheckedChangeListener{group, checkedId->
            if(checkedId > -1 ){
                row1.clearCheck()
                row3.clearCheck()
                row4.clearCheck()

                row2.check(checkedId)
            }
        }

        row3.setOnCheckedChangeListener{group, checkedId->
            if(checkedId > -1 ){
                row1.clearCheck()
                row2.clearCheck()
                row4.clearCheck()

                row3.check(checkedId)
            }
        }

        row4.setOnCheckedChangeListener{group, checkedId->
            if(checkedId > -1 ){
                row1.clearCheck()
                row3.clearCheck()
                row2.clearCheck()

                row4.check(checkedId)
            }
        }

    }
}