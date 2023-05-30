package com.dicoding.tourifyapp.ui.screen.login

import androidx.lifecycle.ViewModel
import com.dicoding.tourifyapp.data.remote.repository.UserRepository

class LoginViewModel(
    private val userRepository: UserRepository
): ViewModel() {

    fun doLogin(email: String, password: String) = userRepository.doLogin(email, password)
}