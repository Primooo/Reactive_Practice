package com.rp.sec01;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Lec02MonoJust {

    public static void main(String[] args) {

        // publisher
        Mono<Integer> mono = Mono.just(1);
        Flux<Integer> seqFlux = Flux.just(1, 2, 3);

        System.out.println(mono);

        mono.subscribe(i -> System.out.println("Received : " + i));
        seqFlux.subscribe(i -> System.out.println("Received : " + i));

    }

}
