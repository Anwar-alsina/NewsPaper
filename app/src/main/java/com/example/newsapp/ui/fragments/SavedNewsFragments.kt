package com.example.newsapp.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentBreakingNewsBinding
import com.example.newsapp.databinding.FragmentSavedNewsBinding

class SavedNewsFragments: Fragment(R.layout.fragment_saved_news) {
    private var _binding: FragmentSavedNewsBinding? = null
    private val binding : FragmentSavedNewsBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSavedNewsBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("TAG", "onViewCreated: ${binding.textView.text}" )
    }

}