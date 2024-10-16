package kr.ac.jumoh.s20210395.w24w07lotto.service

import org.springframework.stereotype.Service
import kotlin.random.Random
@Service
class LottoService {
    fun GetLuckyNumbers() : Array<Int> {
        val numbers = arrayOf(0, 0, 0, 0, 0, 0)

        for (i in numbers.indices)
            numbers[i] = Random.nextInt(45) + 1

        return numbers
    }
}