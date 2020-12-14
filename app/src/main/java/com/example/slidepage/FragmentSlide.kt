package com.example.slidepage

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView


private const val ARG_PARAM1 = "param1"

class FragmentSlide : Fragment() {
    private var param1: String? = null
    private lateinit var listener: (CharSequence) -> Unit

    //used to create argument for Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    //Inflate the layout for this fragment
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?,
    ): View? = inflater.inflate(R.layout.fragment_slide, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //used to process slide by slide from fragment. it means we can do anything from this code
        val textFragment by lazy {
            mutableListOf<TextView>(
                    view.findViewById(R.id.text_up),
                    view.findViewById(R.id.text_down)
            )
        }
        val etFragment = view.findViewById<EditText>(R.id.EtFragment)
        val imageFragment = view.findViewById<ImageView>(R.id.imageFragment)
        when (param1) {
            "3" -> {
                textFragment[1].visibility = View.GONE
                textFragment[0].text = resources.getString(R.string.text_question_name)
                etFragment.visibility = View.VISIBLE
                imageFragment.setBackgroundResource(R.drawable.ic_rest)
                etFragment.addTextChangedListener(object : TextWatcher {
                    override fun beforeTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {}
                    override fun onTextChanged(s: CharSequence, p1: Int, p2: Int, p3: Int) {
                        listener(s)
                    }

                    override fun afterTextChanged(s: Editable?) {}
                })
            }
            "2" -> {
                textFragment[0].text = resources.getString(R.string.text_angry)
                textFragment[1].text = resources.getString(R.string.text_angry_detail)
                etFragment.visibility = View.GONE
                imageFragment.setBackgroundResource(R.drawable.ic_angry)
            }
            "1" -> {
                textFragment[0].text = resources.getString(R.string.text_tired)
                textFragment[1].text = resources.getString(R.string.text_tired_detail)
                etFragment.visibility = View.GONE
                imageFragment.setBackgroundResource(R.drawable.ic_tired)
            }
            else -> {
                textFragment[0].text = resources.getString(R.string.text_sad)
                textFragment[1].text = resources.getString(R.string.text_sad_detail)
                etFragment.visibility = View.GONE
                imageFragment.setBackgroundResource(R.drawable.ic_sad)
            }
        }
    }

    //Companion object used to adapter call fragment and don't need to create object , just call the object
    companion object {
        @JvmStatic
        fun newInstance(param1: String, listener: (CharSequence) -> Unit) =
                FragmentSlide().apply {
                    this.listener = listener
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                    }
                }
    }
}