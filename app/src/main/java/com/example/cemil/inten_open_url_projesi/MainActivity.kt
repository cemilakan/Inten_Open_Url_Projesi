package com.example.cemil.inten_open_url_projesi

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun uygulamada_Ac(view: View) {
        val intent = Intent(applicationContext, WebViewActivity::class.java)
        intent.putExtra("url", urlText.text.toString())//EditText'te bulunan Url Adresini Gönderiyoruz.
        startActivity(intent)//Ve diğer yani WebViewActivity'mizi açıyoruz.
    }

    fun webSite(view: View) {
        val webSite = Intent(Intent.ACTION_VIEW)
        webSite.data = Uri.parse(urlText.text.toString())//EditText'te buluann Url Adresini alıp açma isteğimizi programa yolluyoruz
        startActivity(webSite)
    }

}
