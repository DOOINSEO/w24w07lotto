package kr.ac.jumoh.s20210395.w24w07lotto.controller

import kr.ac.jumoh.s20210395.w24w07lotto.service.LottoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class LottoController(val service: LottoService) {
    @GetMapping("/lotto/numbers")
    fun generateNumbers(model: Model) : String {
        val lottoNumber = service.GetLuckyNumbers()
        model.addAttribute(
            "numbers",
            lottoNumber.numbers // 이걸 시험에(모델 객체를 넘겨주는 것)
        )
        return "lotto"
    }
}