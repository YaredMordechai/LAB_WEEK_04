package com.example.lab_week_04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class DetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.affogato)?.text =
            getString(R.string.starbucks_desc)

        view.findViewById<TextView>(R.id.americano)?.text =
            getString(R.string.janjijiwa_desc)

        view.findViewById<TextView>(R.id.latte)?.text =
            getString(R.string.kopikenangan_desc)
    }
}
