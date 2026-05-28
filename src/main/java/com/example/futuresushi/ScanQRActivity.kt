package com.example.futuresushi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.ResultPoint
import com.journeyapps.barcodescanner.*

class ScanQRActivity : AppCompatActivity() {

    private lateinit var barcodeView: DecoratedBarcodeView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_scan_qr)

        barcodeView = findViewById(R.id.barcodeScanner)

        barcodeView.decodeContinuous(callback)

    }

    private val callback = object : BarcodeCallback {

        override fun barcodeResult(result: BarcodeResult?) {

            result?.text ?: return

            // OPEN MENU

            startActivity(
                Intent(this@ScanQRActivity, MenuActivity::class.java)
            )

            finish()

        }

        override fun possibleResultPoints(resultPoints: MutableList<ResultPoint>?) {

        }

    }

    override fun onResume() {

        super.onResume()

        barcodeView.resume()

    }

    override fun onPause() {

        super.onPause()

        barcodeView.pause()

    }

}