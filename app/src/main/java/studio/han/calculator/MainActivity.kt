package studio.han.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        num_0.setOnClickListener {input("0") }
        num_1.setOnClickListener {input("1") }
        num_2.setOnClickListener {input("2") }
        num_3.setOnClickListener {input("3") }
        num_4.setOnClickListener {input("4") }
        num_5.setOnClickListener {input("5") }
        num_6.setOnClickListener {input("6") }
        num_7.setOnClickListener {input("7") }
        num_8.setOnClickListener {input("8") }
        num_9.setOnClickListener {input("9") }
        dot.setOnClickListener {input(".") }
        delete.setOnClickListener {input("del") }
        left_bracket.setOnClickListener {input("(") }
        right_bracket.setOnClickListener {input(")") }

    }

    private fun input(ch: String) {
        edit.setText(edit.text.toString() + ch)
        edit.setSelection(edit.text.length)
    }
}
