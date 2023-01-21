package com.game.entity;

import com.game.entity.Profession;
import com.game.entity.Race;

import java.util.Date;

public class Player {
    private Long id;
    private String name;
    private String title;
    private Race race;
    private Profession profession;
    private Integer experience;
    private Integer level;
    private Integer untilNextLevel;
    private Date birthday;
    private Boolean banned;


    public Player(Long id, String name, String title, Race race, Profession profession, Integer experience, Integer level, Integer untilNextLevel, Date birthday, Boolean banned) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.race = race;
        this.profession = profession;
        this.experience = experience;
        this.level = level;
        this.untilNextLevel = untilNextLevel;
        this.birthday = birthday;
        this.banned = banned;
    }

    public Integer calculateLevel(Integer experience) {
        return (int) (Math.sqrt((2500 + 250 * experience) - 50) / 100);
    }

    public Integer requiredExperienceForNextLevel(Integer level, Integer experience) {
        return (50 * (level + 1) * (level + 2)) - experience;
    }
}

//String name - Имя персонажа (до 12 знаков включительно)
//String title - Титул персонажа (до 30 знаков включительно)
//Race race - Расса персонажа
//Profession profession - Профессия персонажа
//Integer experience - Опыт персонажа. Диапазон значений 0..10,000,000
//Integer level - Уровень персонажа
//Integer untilNextLevel - Остаток опыта до следующего уровня
//Date birthday - Дата регистрации - Диапазон значений года 2000..3000 включительно
//Boolean banned - Забанен / не забанен
