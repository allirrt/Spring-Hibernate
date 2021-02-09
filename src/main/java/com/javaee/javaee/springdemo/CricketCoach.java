package com.javaee.javaee.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: сеттер - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: сеттер - setTeam");
        this.team = team;
    }

    public CricketCoach() {
        System.out.println("CricketCoach: конструктор без аргументов");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: запуск сеттера - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Игать в боулинг 15 минут";
    }

    @Override
    public String getDalyFortune() {
        return fortuneService.getFortune();
    }
}
