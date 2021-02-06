package com.mooc.ppjoke.ui.find

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.mooc.libnavannotation.FragmentDestination
import com.mooc.ppjoke.R

@FragmentDestination(pageUrl = "main/tabs/find", asStarter = false)
class FindFragment : Fragment() {

    private lateinit var findViewModel: FindViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        findViewModel =
            ViewModelProviders.of(this).get(FindViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_find, container, false)
        val textView: TextView = root.findViewById(R.id.text_find)
        findViewModel.text.observe(this, Observer {
            textView.text = it
        })
        Log.d("onCreateView", "FindFragment")
        return root
    }
}