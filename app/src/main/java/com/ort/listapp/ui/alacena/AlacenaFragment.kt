package com.ort.listapp.ui.alacena

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.ort.listapp.R
import com.ort.listapp.databinding.FragmentAlacenaBinding
import com.ort.listapp.databinding.FragmentListaBinding

class AlacenaFragment : Fragment() {

    companion object {
        fun newInstance() = AlacenaFragment()
    }

    private lateinit var binding: FragmentAlacenaBinding
    private val viewModel: AlacenaViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAlacenaBinding.inflate(inflater, container, false)
        return binding.root
    }

}