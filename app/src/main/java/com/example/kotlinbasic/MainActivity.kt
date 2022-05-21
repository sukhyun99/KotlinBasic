package com.example.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog.setOnClickListener {
            Log.d("메인화면", "로그 버튼이 클릭 됨")
        }

        btnToast.setOnClickListener {
            Toast.makeText(this, "토스트 띄우기", Toast.LENGTH_SHORT).show()
        }

        btnVariable.setOnClickListener {
            var name1 : String = "김철수"
            val name2 : String = "이영희"

            Log.d("변수", name1)
            Log.d("변수", name2)

            Toast.makeText(this, name1, Toast.LENGTH_SHORT).show()
        }

        btnCondition.setOnClickListener {
            val userAge = 40

            if (userAge >= 20) {
                Toast.makeText(this, "성인입니다", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "그래도 성인입니다", Toast.LENGTH_SHORT).show()
            }

        }

        btnCopy.setOnClickListener {
            val inputMsg = editMsg.text.toString()
            txtMsg.text = inputMsg
        }

    }
}