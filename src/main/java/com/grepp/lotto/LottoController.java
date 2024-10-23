package com.grepp.lotto;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class LottoController {

    @GetMapping("/lotto")
    public List<Integer> getLottoNumbers() {
        // 1부터 45까지 숫자를 리스트로 생성
        List<Integer> numbers = IntStream.rangeClosed(1, 45).boxed().collect(Collectors.toList());

        // 리스트를 섞어서 랜덤으로 6개 선택
        Collections.shuffle(numbers);
        return numbers.stream().limit(6).sorted().collect(Collectors.toList());
    }
}
