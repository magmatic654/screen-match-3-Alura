package com.aluracursos.screenmatch.models;

public class Serie extends Title{
    int seasons;
    int episodiesForSeason;
    int minutesForEpisode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodiesForSeason() {
        return episodiesForSeason;
    }

    public void setEpisodiesForSeason(int episodiesForSeason) {
        this.episodiesForSeason = episodiesForSeason;
    }

    public int getMinutesForEpisode() {
        return minutesForEpisode;
    }

    public void setMinutesForEpisode(int minutesForEpisode) {
        this.minutesForEpisode = minutesForEpisode;
    }
}
