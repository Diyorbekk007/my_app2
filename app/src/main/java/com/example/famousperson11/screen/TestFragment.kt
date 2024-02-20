package com.example.famousperson11.screen

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.children
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.famousperson11.R
import com.example.famousperson11.data.model.QuestionData
import com.example.famousperson11.data.repository.QuestionRepository
import com.example.famousperson11.databinding.TestScreenBinding
import com.example.famousperson11.presenter.TestPresenter

class TestFragment : Fragment(R.layout.test_screen) {
    private var _binding: TestScreenBinding? = null
    private val binding: TestScreenBinding get() = _binding!!
    private lateinit var presenter: TestPresenter
    private lateinit var repository: QuestionRepository
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = TestScreenBinding.bind(view)
        repository = QuestionRepository(requireContext())
        presenter = TestPresenter(view = this, repository = repository)
        loadUi()
        loadUiClickable()
    }

    private fun loadUi() {
        val id = requireArguments().getInt("famous_id", 0)
        presenter.loadUi(id)
    }

    fun setQuestionInformation(data: QuestionData) {
        binding.question.text = data.questionText
        binding.firstAnswer.text = data.variantA
        binding.secondAnswer.text = data.variantB
        binding.thirdAnswer.text = data.variantC
        binding.fourthAnswer.text = data.variantD
    }

    fun changeNextIcon(isLast: Boolean) {
        if (isLast)
            binding.quizNextButton.setImageResource(R.drawable.baseline_done)
        else
            binding.quizNextButton.setImageResource(R.drawable.back_button)
    }

    fun changePrevVisibility(isFirst: Boolean) {
        binding.quizBackButton.isVisible = !isFirst
    }

    private fun loadUiClickable() {
        binding.backScreen.setOnClickListener {
            presenter.back()
        }
        binding.quizNextButton.setOnClickListener {
            var checkedIndex = 0
            binding.radioGr.children.forEachIndexed { index, view ->
                if (view.id == binding.radioGr.checkedRadioButtonId)
                    checkedIndex = index
            }
            presenter.next(checkedIndex)
        }
        binding.quizBackButton.setOnClickListener {
            presenter.previous()
        }
    }

    fun openResult(count: Int) {
        Toast.makeText(
            requireContext(),
            count.toString(),
            Toast.LENGTH_SHORT
        ).show()

        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle("Result")

        builder.setMessage("Sizning natinjangiz $count")


        builder.setPositiveButton("OK") { dialog, _ ->

            dialog.cancel()

        }
        val dialog = builder.create()

        dialog.show()


    }


    fun back() {
        parentFragmentManager.popBackStack()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}