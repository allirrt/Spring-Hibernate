package com.javaee.javaee.springdemo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on butting practice";
    }

    @Override
    public String getDalyFortune() {
        return fortuneService.getFortune();
    }
}
