package com.game.service;

import com.game.controller.PlayerOrder;
import com.game.entity.Player;
import com.game.entity.Profession;
import com.game.entity.Race;

import java.util.List;

public interface PlayerService {

    List<Player> getPlayersList();

    Integer getPlayersCount(String name, String title, Race race, Profession profession,
                            Long after, Long before, Boolean banned, Integer minExperience,
                            Integer maxExperience, Integer minLevel, Integer maxLevel);

    Player createPlayer(Player player);

    Player getPlayer(Long id);

    Boolean isValidPlayer(Player player);

    Player update(Player player, Long id);

    void delete(Long id);

    List<Player> sort(List<Player> players, PlayerOrder order);

    List<Player> getPage(List<Player> players, Integer pageNumber, Integer pageSize);

    List<Player> filteredPlayers(String name, String title, Race race, Profession profession,
                                 Long after, Long before, Boolean banned, Integer minExperience,
                                 Integer maxExperience, Integer minLevel, Integer maxLevel);


}
