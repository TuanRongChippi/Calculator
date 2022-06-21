package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val one = findViewById<Button>(R.id.one)
        val two = findViewById<Button>(R.id.two)
        val three = findViewById<Button>(R.id.three)
        val four = findViewById<Button>(R.id.four)
        val five = findViewById<Button>(R.id.five)
        val six = findViewById<Button>(R.id.six)
        val seven = findViewById<Button>(R.id.seven)
        val eight = findViewById<Button>(R.id.eight)
        val nine = findViewById<Button>(R.id.nine)
        val zero = findViewById<Button>(R.id.zero)

        val cong = findViewById<Button>(R.id.cong)
        val tru = findViewById<Button>(R.id.tru)
        val nhan = findViewById<Button>(R.id.nhan)
        val chia = findViewById<Button>(R.id.chia)
        val cham = findViewById<Button>(R.id.cham)
        val delete = findViewById<Button>(R.id.delete)
        val bang = findViewById<Button>(R.id.bang)
        val pheptinh = findViewById<TextView>(R.id.pheptinh)

        one.setOnClickListener {
            val pt = pheptinh.text.toString() + "1"
            pheptinh.setText(pt)
        }
        two.setOnClickListener {
            val pt = pheptinh.text.toString() + "2"
            pheptinh.setText(pt)
        }
        three.setOnClickListener {
            val pt = pheptinh.text.toString() + "3"
            pheptinh.setText(pt)
        }
        four.setOnClickListener {
            val pt = pheptinh.text.toString() + "4"
            pheptinh.setText(pt)
        }
        five.setOnClickListener {
            val pt = pheptinh.text.toString() + "5"
            pheptinh.setText(pt)
        }
        six.setOnClickListener {
            val pt = pheptinh.text.toString() + "6"
            pheptinh.setText(pt)
        }
        seven.setOnClickListener {
            val pt = pheptinh.text.toString() + "7"
            pheptinh.setText(pt)
        }
        eight.setOnClickListener {
            val pt = pheptinh.text.toString() + "8"
            pheptinh.setText(pt)
        }
        nine.setOnClickListener {
            val pt = pheptinh.text.toString() + "9"
            pheptinh.setText(pt)
        }
        zero.setOnClickListener {
            val pt = pheptinh.text.toString() + "0"
            pheptinh.setText(pt)
        }
    // các toán tử
        cong.setOnClickListener {
            val pt = pheptinh.text.toString() + "+"
            pheptinh.setText(pt)
        }
        tru.setOnClickListener {
            val pt = pheptinh.text.toString() + "-"
            pheptinh.setText(pt)
        }
        nhan.setOnClickListener {
            val pt = pheptinh.text.toString() + "*"
            pheptinh.setText(pt)
        }
        chia.setOnClickListener {
            val pt = pheptinh.text.toString() + "/"
            pheptinh.setText(pt)
        }
        cham.setOnClickListener {
            val pt = pheptinh.text.toString() + "."
            pheptinh.setText(pt)
        }
        delete.setOnClickListener {
            pheptinh.setText("")
        }

        bang.setOnClickListener {

            try {
                val value = ExpressionBuilder(pheptinh.text.toString()).build()
                val result = value.evaluate()
//                Log.e("ada", result.toString())
//                  Phần log này để kiểm tra
                if (result == result.toDouble())
                {
                    pheptinh.setText(result.toString())
                } else {
                    pheptinh.setText(result.toInt().toString())
                }
            } catch (e:Exception) {

            }
        }
    }
}