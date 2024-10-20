package com.coderhack.model;

import java.util.HashSet;
import java.util.Set;

public class BadgeUtils {

    // Method to get badges based on the score
    public static Set<String> getBadgesForScore(int score) {
        Set<String> badges = new HashSet<>();

        // Award badges based on the score range
        if (score >= 1 && score < 30) {
            badges.add(Badge.CODE_NINJA.name());
        }
        if (score >= 30 && score < 60) {
            badges.add(Badge.CODE_CHAMP.name());
        }
        if (score >= 60 && score <= 100) {
            badges.add(Badge.CODE_MASTER.name());
        }
        
        return badges;
    }
}
