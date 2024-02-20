package com.example.famousperson11.screen

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.famousperson11.R
import com.example.famousperson11.data.model.FamousPersonData
import com.example.famousperson11.data.repository.FamousRepository
import com.example.famousperson11.databinding.ScreenDetailsBinding
import com.example.famousperson11.presenter.DetailPresenter

class DetailScreen : Fragment(R.layout.screen_details) {
    private var _binding: ScreenDetailsBinding? = null
    private val binding: ScreenDetailsBinding get() = _binding!!
    private lateinit var presenter: DetailPresenter
    private lateinit var repository: FamousRepository

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = ScreenDetailsBinding.bind(view)
        repository = FamousRepository(requireContext())
        presenter = DetailPresenter(view = this, repository = repository)
        loadUi()
        loadUiClickable()
    }

    private fun loadUi() {
        val id = requireArguments().getInt("id", 0)
        presenter.loadUi(id)
    }

    fun setFamousInformation(data: FamousPersonData) {
        binding.image.setImageResource(data.image)
        binding.name.text = data.name
        binding.description.text = data.description
    }

    private fun loadUiClickable() {
        binding.back.setOnClickListener {
            presenter.back()
        }
        binding.startTest.setOnClickListener {
            presenter.openTest()
        }
    }

    fun openTest(id: Int) {
        parentFragmentManager.commit {
            replace(
                R.id.container1,
                TestFragment::class.java,
                bundleOf("famous_id" to id),
                "TestFragment"
            )
            addToBackStack(null)
        }
    }

    fun back() {
        parentFragmentManager.popBackStack()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}