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
        val firstFragment = Appetizers()
        val secondFragment = PlaceOrder()
        val thirdFragment = ContactFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FLFragment, firstFragment)
            commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.my_first_menu, menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
             R.id.order -> supportFragmentManager.beginTransaction().apply {
                 replace(R.id.FLFragment, PlaceOrder())
                 commit()
             }

            R.id.contact -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.FLFragment, ContactFragment())
                commit()
            }

            R.id.info -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.FLFragment, Appetizers())
                commit()
            }
        }
        return true
    }
}



