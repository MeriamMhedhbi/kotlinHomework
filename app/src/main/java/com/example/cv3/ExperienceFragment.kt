package com.example.cv3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ExperienceFragment : Fragment() {
    var itemsList = ArrayList<Experience>()
    private lateinit var customExpAdapter: CustomExpAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        val v = inflater.inflate(R.layout.fragment_experience, container, false)

        val recyclerView: RecyclerView = v.findViewById(R.id.recyclerViewExp)
        customExpAdapter = CustomExpAdapter(itemsList)
        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = customExpAdapter
        prepareItems()
        // Inflate the layout for this fragment

        return v

    }

    private fun prepareItems() {

        itemsList.add(Experience(R.drawable.ic_logo_esprit,"Esprit","Ariena","01/09/2013","12/12/2015"," type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."))
        itemsList.add(Experience(R.drawable.ic_logo_linkedin,"Linkedin","USA","01/09/2013","01/09/2013"," type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."))
        itemsList.add(Experience(R.drawable.ic_logo_microsoft,"Microsoft","USA","01/09/2013","01/09/2013"," type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."))
    }

}