package com.example.cemil.inten_open_url_projesi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebViewActivity : AppCompatActivity() {
    var mywebview: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        val gelen_url = intent//Diğer Activity den gelen Url yi alıyoruz.
        val gelen: String = gelen_url.getStringExtra("url")//gelen Url yi stringe çevirerek bir değişkene atıyoruz
        webSite(gelen)//Fonksiyonumuza aldığımız string değişkenini gönderiyoruz ve işlemleri başlatıyor. Ardında aldığı Url yi WevView'imizde açıyor

    }
    fun webSite(s:String){
        mywebview = findViewById<WebView>(R.id.webview)
        mywebview!!.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        mywebview!!.loadUrl(s)

    }
}
