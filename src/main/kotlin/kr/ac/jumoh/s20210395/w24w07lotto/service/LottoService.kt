package kr.ac.jumoh.s20210395.w24w07lotto.service

import kr.ac.jumoh.s20210395.w24w07lotto.model.LottoNumber
import kr.ac.jumoh.s20210395.w24w07lotto.repository.InMemoryLottoRepository
import org.springframework.stereotype.Service
import kotlin.random.Random
@Service
class LottoService (val lottoRepository: InMemoryLottoRepository) {
    fun GetLuckyNumbers() : LottoNumber {
        val numbers = mutableSetOf<Int>() //val => var로 바꿔야 됨
                                      //다른 numbers 불러옴(주소가 다름)

        while (numbers.size < 6) {
            numbers.add(Random.nextInt(1, 46))
        }

        val lottoNumber = LottoNumber(numbers.toSortedSet().toIntArray())

        return lottoRepository.save(lottoNumber)
    }
}