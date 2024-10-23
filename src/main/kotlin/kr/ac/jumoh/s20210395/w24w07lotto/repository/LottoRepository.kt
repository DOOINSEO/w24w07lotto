package kr.ac.jumoh.s20210395.w24w07lotto.repository

import kr.ac.jumoh.s20210395.w24w07lotto.model.LottoNumber

interface LottoRepository {
    fun save(lottoNumber: LottoNumber): LottoNumber
    fun find(): LottoNumber? //? = save 안돼있으면 null반환
}//인터페이스는 객체를 못 만듬
//스프링 컨테이너가 서비스와 repository를 엮어줌