package com.example.famousperson11.screen

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.famousperson11.R
import com.example.famousperson11.data.model.FamousPersonData
import com.example.famousperson11.data.repository.FamousRepository
import com.example.famousperson11.databinding.ScreenMainBinding
import com.example.famousperson11.presenter.MainPresenter

class MainScreen : Fragment(R.layout.screen_main) {
    private var _binding: ScreenMainBinding? = null
    private val binding: ScreenMainBinding get() = _binding!!
    private lateinit var repository: FamousRepository
    private lateinit var presenter: MainPresenter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = ScreenMainBinding.bind(view)
        repository = FamousRepository(requireContext())
        presenter = MainPresenter(view = this, repository = repository)

        loadUiClickable()
    }

    fun setFirstItemDetail(data: FamousPersonData) {
        binding.firstItem.image.setImageResource(data.image)
        binding.firstItem.name.text = data.name
    }

    fun setSecondItemDetail(data: FamousPersonData) {
        binding.secondItem.image.setImageResource(data.image)
        binding.secondItem.name.text = data.name
    }

    fun setThirdItemDetail(data: FamousPersonData) {
        binding.thirdItem.image.setImageResource(data.image)
        binding.thirdItem.name.text = data.name
    }

    fun setFourthItemDetail(data: FamousPersonData) {
        binding.fourthItem.image.setImageResource(data.image)
        binding.fourthItem.name.text = data.name
    }

    fun openDetailScreen(data: FamousPersonData) {
        parentFragmentManager.commit {
            replace(
                R.id.container1,
                DetailScreen::class.java,
                bundleOf("id" to data.id),
                "DetailScreen"
            )
            addToBackStack(null)
        }
    }

    private fun loadUiClickable() {
        binding.firstItem.root.setOnClickListener {
            presenter.clickFirstItem()
        }
        binding.secondItem.root.setOnClickListener {
            presenter.clickSecondItem()
        }
        binding.thirdItem.root.setOnClickListener {
            presenter.clickThirdItem()
        }
        binding.fourthItem.root.setOnClickListener {
            presenter.clickFourthItem()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}