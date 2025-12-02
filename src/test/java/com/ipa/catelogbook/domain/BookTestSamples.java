package com.ipa.catelogbook.domain;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class BookTestSamples {

    private static final Random random = new Random();
    private static final AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));

    public static Book getBookSample1() {
        return new Book().id(1L).name("name1").description("description1").price(1L);
    }

    public static Book getBookSample2() {
        return new Book().id(2L).name("name2").description("description2").price(2L);
    }

    public static Book getBookRandomSampleGenerator() {
        return new Book()
            .id(longCount.incrementAndGet())
            .name(UUID.randomUUID().toString())
            .description(UUID.randomUUID().toString())
            .price(longCount.incrementAndGet());
    }
}
