package com.example.mykotlinapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.mykotlinapplication.databinding.FragmentQuizBinding

class QuizFragment : Fragment() {

    private lateinit var quizFragmentBinding : FragmentQuizBinding
    val arguments : QuizFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        quizFragmentBinding = FragmentQuizBinding.inflate(
            inflater,
            container,
            false
        )

        val name = arguments.name
        val welcomeTextWithPlaceholders = resources.getString(R.string.welcome_banner_text)
        val welcomeText = String.format(welcomeTextWithPlaceholders, name)
        val welcomeBanner = quizFragmentBinding.quizBanner
        welcomeBanner.text = welcomeText

        return quizFragmentBinding.root
    }
}
