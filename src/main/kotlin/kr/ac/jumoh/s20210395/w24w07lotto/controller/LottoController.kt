package kr.ac.jumoh.s20210395.w24w07lotto.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class LottoController {
    @GetMapping("/lotto/numbers")
    fun generateNumbers() : String {
        return "lotto"
    }
}