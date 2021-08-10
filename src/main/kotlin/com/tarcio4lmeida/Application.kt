package com.tarcio4lmeida

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.tarcio4lmeida")
		.start()
}

