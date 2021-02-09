package com.javaee.javaee.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Run a hard 5k";
    }

    @Override
    public String getDalyFortune() {
        return "Jast DO it" + fortuneService.getFortune();
    }

    public void doMyStartupStuff() {
        System.out.println("Метод вызывается при инициализации бина");
    }

    public void doMyDestroyStuff() {
        System.out.println("Метод вызывается при завершении");
    }
}
