package com.example.wecater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.my_first_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.order -> Toast.makeText(this, "Place Order Option Selected", Toast.LENGTH_SHORT).show()
            R.id.contact -> Toast.makeText(this, "Contact Us Option Selected", Toast.LENGTH_SHORT).show()
            R.id.info -> Toast.makeText(this, "Info Option Selected", Toast.LENGTH_SHORT).show()
        }

        return true
    }
}