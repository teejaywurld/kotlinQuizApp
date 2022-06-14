package com.example.mykotlinapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mykotlinapplication.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {
        private lateinit var welcomeFragmentBinding : FragmentWelcomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        welcomeFragmentBinding = FragmentWelcomeBinding.inflate(
            inflater,
            container,
            false
        )

        val startGameButton = welcomeFragmentBinding.startBtn
        val userNameInput = welcomeFragmentBinding.usernameInput

        startGameButton.setOnClickListener {
            val username = userNameInput.text.toString()
            val navController = findNavController()

          val action = WelcomeFragmentDirections.actionWelcomeFragmentToQuizFragment(
              username
          )

            navController.navigate(action)
        }

        return welcomeFragmentBinding.root
    }
}

