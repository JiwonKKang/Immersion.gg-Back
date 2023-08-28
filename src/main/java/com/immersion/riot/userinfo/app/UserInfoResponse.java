package com.immersion.riot.userinfo.app;

import lombok.Data;

import java.util.List;

@Data
public class UserInfoResponse {
    private String profileImageUrl;
    private String name;
    private String id;
    private String puuid;
    private List<LeagueEntryResponse> tiers;
    private long summonerLevel;
    private double userRatingAverage;
}
