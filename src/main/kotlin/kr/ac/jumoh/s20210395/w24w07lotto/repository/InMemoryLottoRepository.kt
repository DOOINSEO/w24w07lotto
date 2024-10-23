package kr.ac.jumoh.s20210395.w24w07lotto.repository

import kr.ac.jumoh.s20210395.w24w07lotto.model.LottoNumber
import org.springframework.stereotype.Repository

@Repository
class InMemoryLottoRepository :LottoRepository {
    private var storeLottoNumber : LottoNumber? = null
    override fun save(lottoNumber: LottoNumber): LottoNumber {
        storeLottoNumber = lottoNumber

        return storeLottoNumber!!
    }

    override fun find(): LottoNumber? {
        return storeLottoNumber
    }
}