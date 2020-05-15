package com.example.demolistviewcovid_19;

// Day la Constructer nhan du lieu tu ActivityMain
public class CovidModel {
    int flags;
    String names;
    String confirmed;
    String recovered;
    String deaths;

    public CovidModel(int flags, String names, String confirmed, String recovered, String deaths) {
        this.flags = flags;
        this.names = names;
        this.confirmed = confirmed;
        this.recovered = recovered;
        this.deaths = deaths;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }
}
