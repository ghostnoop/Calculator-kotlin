package com.example.calculator_kotlin


class MainRepository private constructor() {


    companion object {
        @Volatile
        private var instance: MainRepository? = null

        fun getInstance(): MainRepository = instance
            ?: synchronized(this) {
                instance
                    ?: MainRepository().also { instance = it }
            }

    }
}