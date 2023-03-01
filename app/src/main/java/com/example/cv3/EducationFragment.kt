package com.example.cv3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EducationFragment : Fragment() {

    var itemsList = ArrayList<Education>()
    private lateinit var customEducAdapter: CustomEducAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val v = inflater.inflate(R.layout.fragment_education, container, false)

        val recyclerView: RecyclerView = v.findViewById(R.id.recycler_view_educ)
        customEducAdapter = CustomEducAdapter(itemsList)
        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = customEducAdapter
        prepareItems()
        // Inflate the layout for this fragment

        return v

    }

    private fun prepareItems() {
        itemsList.add(Education(R.drawable.ic_logo_cambridge,"Cambridge","uk","01/09/2013","12/12/2015"))
        itemsList.add(Education(R.drawable.ic_logo_harvard,"Harvard","US","01/09/2013","12/12/2015"))
        itemsList.add(Education(R.drawable.ic_logo_esprit,"Esprit","Tunisia","01/09/2013","12/12/2015"))
    }

}