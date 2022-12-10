package com.example.retrofitexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitexample.databinding.FragmentPostsListBinding


class PostsListFragment : Fragment() {

    lateinit var binding: FragmentPostsListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPostsListBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = PostResponseListAdapter()
        binding.recyclerView.adapter = adapter

        val viewModel = ViewModelProvider(requireActivity())[PostListViewModel::class.java]
        viewModel.getAll().observe(requireActivity()){
            if (it != null) {
                adapter.items = it
            }
        }

    }

}

class FragmentPostsListBinding {

}
