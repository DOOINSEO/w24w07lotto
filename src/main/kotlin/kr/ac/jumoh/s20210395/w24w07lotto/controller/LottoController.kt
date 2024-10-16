package kr.ac.jumoh.s20210395.w24w07lotto.controller

import kr.ac.jumoh.s20210395.w24w07lotto.service.LottoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class LottoController(val service: LottoService) {
    @GetMapping("/lotto/numbers")
    fun generateNumbers(model: Model) : String {
        model.addAttribute(
            "numbers",
            service.GetLuckyNumbers()
        )
        return "lotto"
    }
}