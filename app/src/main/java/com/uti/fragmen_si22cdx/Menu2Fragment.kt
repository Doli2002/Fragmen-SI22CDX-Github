package com.uti.fragmen_si22cdx

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.uti.fragmen_si22cdx.databinding.FragmentMenu2Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Menu2Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Menu2Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //definisikan variabel "binding"
        val binding = FragmentMenu2Binding.inflate(layoutInflater)

        //buat event "btn_sub_fragment2
        binding.btnSubFragment2.setOnClickListener {
            // sembunyikan menu utama "lay_menu"
            (requireActivity() as MainActivity).binding.layMenu.visibility = View.GONE

            //isi menu = "21"

            (requireActivity() as MainActivity).menu = "21"
            //buka "Menu2SubFragment"
            (requireActivity() as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.frm_content,Menu2SubFragment()).commit()
        }


        // Inflate the layout for this fragment
        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Menu2Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Menu2Fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}