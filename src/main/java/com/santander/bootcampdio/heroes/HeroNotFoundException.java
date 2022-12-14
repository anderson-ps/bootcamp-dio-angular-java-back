package com.santander.bootcampdio.heroes;

public class HeroNotFoundException extends RuntimeException {
    public HeroNotFoundException(Long id) {
        super("Hero id: " + id + " not found.");
    }
}
