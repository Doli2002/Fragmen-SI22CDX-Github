package com.uti.fragmen_si22cdx

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.uti.fragmen_si22cdx.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // buat variabel menu
    lateinit var menu: String
    // buat variabel "binding"
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        //deklarasi "binding"
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //buat event
        //   1. event "img_menu1"
        binding.imgMenu1.setOnClickListener {
            //  buka "MenuFragment1"
            openFragment1()

        }
        //   2. event "img_menu2"
        binding.imgMenu2.setOnClickListener {
            //atur margin top = 64
            val margin_param = binding.frmContent.layoutParams as ViewGroup.MarginLayoutParams
            margin_param.topMargin = (64 * this@MainActivity.resources.displayMetrics.density).toInt()
            //  buka "MenuFragment2"
            // isi nilai menu variabel "2"
            menu = "2"

            supportFragmentManager.beginTransaction().replace(R.id.frm_content, Menu2Fragment())
                .commit()
        }

        //   3. event "img_menu3"
        binding.imgMenu3.setOnClickListener {
            val margin_param = binding.frmContent.layoutParams as ViewGroup.MarginLayoutParams
            margin_param.topMargin = (64 * this@MainActivity.resources.displayMetrics.density).toInt()
            // isi menu variabel 3
            menu = "3"

            //  buka "MenuFragment3"
            // definisikan variabel "fragment"
            val fragment = Menu3Fragment()
            // definisikan variable bundle
            val bundle = Bundle()
            // isi parameter "bundle" untuk dikirim
            bundle.putString(
                "content3",
                "Ini Contoh Fragment 3 Boy. Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3.Ini Contoh Fragment 3. diah"
            )
            // setup bundle dengan fragment
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.frm_content, fragment)
                .commit()
        }

        //buat event tombol button "Back"
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // jika "menu" = "2" atau "menu" = "3"
                if (menu == "2" || menu == "3") {

                    // buka fragment1
                    openFragment1()
                }
                // jika menu == "21"
                else if (menu == "21")
                {
                    //tampilkan menu utama "lay_menu"
                    binding.layMenu.visibility = View.VISIBLE
                    //panggil event "imgMenu2"
                    binding.imgMenu2.performClick()
                }
                //jika "menu"="1"
                else {
                    //tutup aplikasi
                    finish()
                }
            }

        })

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // buat fungsi "openFragment1"
    fun openFragment1() {
        // isi nilai variabel "menu"="1"
        menu = "1"
        //  buka "MenuFragment1"
        supportFragmentManager.beginTransaction().replace(R.id.frm_content, Menu1Fragment())
            .commit()
    }

}