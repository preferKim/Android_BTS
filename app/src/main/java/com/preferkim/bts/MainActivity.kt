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

        // 남은 6개의 image들의 id를붙이고, 각각 클릭시, 각각의 액티비티로 이동!
        val image2 = findViewById<ImageView>(R.id.btsImage_2)
        val image3 = findViewById<ImageView>(R.id.btsImage_3)
        val image4 = findViewById<ImageView>(R.id.btsImage_4)
        val image5 = findViewById<ImageView>(R.id.btsImage_5)
        val image6 = findViewById<ImageView>(R.id.btsImage_6)
        val image7 = findViewById<ImageView>(R.id.btsImage_7)

        image2.setOnClickListener {
            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, BTS2Activity::class.java)
            startActivity(intent)
        }

        image3.setOnClickListener {
            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, BTS2Activity::class.java)
            startActivity(intent)
        }

        image4.setOnClickListener {
            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, BTS2Activity::class.java)
            startActivity(intent)
        }

        image5.setOnClickListener {
            Toast.makeText(this, "5번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, BTS2Activity::class.java)
            startActivity(intent)
        }

        image6.setOnClickListener {
            Toast.makeText(this, "6번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, BTS2Activity::class.java)
            startActivity(intent)
        }

        image7.setOnClickListener {
            Toast.makeText(this, "7번 클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, BTS2Activity::class.java)
            startActivity(intent)
        }
    }
}