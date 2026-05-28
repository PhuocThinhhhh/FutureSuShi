package com.example.futuresushi

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.example.futuresushi.LoginActivity
import com.example.futuresushi.review.ReviewActivity
class MainActivity : AppCompatActivity() {

    lateinit var drawerLayout: DrawerLayout
    lateinit var menuBtn: AppCompatImageView
    lateinit var navigationView: NavigationView
    lateinit var btnScanQR: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawerLayout)
        menuBtn = findViewById(R.id.menuBtn)
        navigationView = findViewById(R.id.navigationView)
        btnScanQR = findViewById(R.id.btnScanQR)

        // OPEN MENU

        menuBtn.setOnClickListener {

            drawerLayout.open()

        }

        // CLICK MENU

        navigationView.setNavigationItemSelectedListener {

            when(it.itemId){

                // STORY

                R.id.nav_story -> {

                    Toast.makeText(
                        this,
                        "FutureSuShi - Hành trình mang tinh hoa Nhật Bản đến thực khách.",
                        Toast.LENGTH_SHORT
                    ).show()

                }

                // CHEF

                R.id.nav_chef -> {

                    Toast.makeText(
                        this,
                        "Đội ngũ đầu bếp chuyên nghiệp và tận tâm.",
                        Toast.LENGTH_SHORT
                    ).show()

                }

                // FOOD

                R.id.nav_food -> {

                    Toast.makeText(
                        this,
                        "Nguyên liệu tươi ngon được tuyển chọn mỗi ngày.",
                        Toast.LENGTH_SHORT
                    ).show()

                }

                // SPACE

                R.id.nav_space -> {

                    Toast.makeText(
                        this,
                        "Không gian hiện đại mang phong cách Nhật Bản.",
                        Toast.LENGTH_SHORT
                    ).show()

                }

                // CONTACT

                R.id.nav_contact -> {

                    Toast.makeText(
                        this,
                        "Liên hệ: 0909 999 999",
                        Toast.LENGTH_SHORT
                    ).show()

                }

            }


            drawerLayout.close()

            true
        }

        // CLICK QR
        val btnScanQR =
            findViewById<LinearLayout>(R.id.btnScanQR)

        btnScanQR.setOnClickListener {

            startActivity(
                Intent(this, ScanQRActivity::class.java)
            )

        }

        // đặt bàn

        val btnBooking =
            findViewById<LinearLayout>(R.id.btnBooking)

        btnBooking.setOnClickListener {

            startActivity(
                Intent(this, BookingActivity::class.java)
            )

        }

        // button login
        val btnLoginHeader =
            findViewById<LinearLayout>(R.id.btnLoginHeader)

        btnLoginHeader.setOnClickListener {

            startActivity(
                Intent(this, LoginActivity::class.java)
            )

        }

        // tài khoản
        val idAccount =
            findViewById<LinearLayout>(R.id.idAccount)

        idAccount.setOnClickListener {

            startActivity(
                Intent(this, ProfileActivity::class.java)
            )

        }

        //đánh giá
        val btnReview =
            findViewById<LinearLayout>(R.id.btnReview)

        btnReview.setOnClickListener {

            startActivity(
                Intent(this, ReviewActivity::class.java)
            )

        }

    }

}
