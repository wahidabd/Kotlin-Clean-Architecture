package com.wahidabd.moviecleanarchitecture.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.wahidabd.moviecleanarchitecture.R
import com.wahidabd.moviecleanarchitecture.core.data.dto.LoginRequest
import com.wahidabd.moviecleanarchitecture.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val pass = binding.etPass.text.toString()

            val req = LoginRequest(email = email, password = pass)

//            lifecycleScope.launch(Dispatchers.Default){
                viewModel.login(req).observe(this, {
                    Toast.makeText(this@MainActivity, "${it.access_token} ${it.user.email}", Toast.LENGTH_SHORT).show()
                })

//            }
        }


    }
}