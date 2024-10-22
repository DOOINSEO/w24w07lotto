package kr.ac.jumoh.s20210395.w24w07lotto.service

import org.springframework.stereotype.Service
import kotlin.random.Random
@Service
class LottoService {
    fun GetLuckyNumbers() : IntArray {
        val numbers = mutableSetOf<Int>() //val => var로 바꿔야 됨
                                      //다른 numbers 불러옴(주소가 다름)

        while (numbers.size < 6) {
            numbers.add(Random.nextInt(1, 46))
        }

        return numbers.toSortedSet().toIntArray()
    }
}