package com.immersion.riot.match.infra.client;

import com.immersion.riot.config.RiotFeignConfiguration;
import com.immersion.riot.match.infra.dto.MatchQueryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "match", url = "${riot.api.url.asia}", configuration = RiotFeignConfiguration.class)
public interface MatchClient {

    @GetMapping("/lol/match/v5/matches/by-puuid/{puuid}/ids")
    List<String> getMatchList(@PathVariable String puuid, @RequestParam long startTime, @RequestParam int count);

    @GetMapping("/lol/match/v5/matches/{matchId}")
    MatchQueryResponse getMatchInfo(@PathVariable String matchId);

}
