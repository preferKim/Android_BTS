package com.preferkim.bts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        // 화면을 보여주는 코드
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. (프로그램이)화면을 클릭되었다는 것을 알아야함
        val image1 = findViewById<ImageView>(R.id.btsImage_1)
        image1.setOnClickListener { // image1을 클릭하면, "1번 클릭 완료" 메시지를 띄운다
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌! (메인 액티비티에서 서브 액티비티 실행)
            val intent = Intent(this, BTS1Activity::class.java) // 다음화면으로 이동하기 위한 인텐트 객체 생성
            startActivity(intent)
        }
    }
}