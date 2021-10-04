package com.firecraftmc.ct.enums;

public enum Goal {
    TOWN("Lynch every criminal and evildoer."), 
    MAFIA("Kill anyone that will not submit to the Mafia"), 
    COVEN("Kill all who would oppose the Coven."), 
    APOCALYPSE("Bring forth the Apocalypse."), 
    KILL_OPPOSE("Kill everyone who would oppose you."),
    AMNESIAC("Remember who you were and complete that roles goal."), 
    ARSONIST("Live to see everyone burn."), 
    EXECUTIONER("Get your target lynched at any cost."),
    JESTER("Get yourself lynched at any cost."), 
    GUARDIAN_ANGEL("Keep your target alive until the end of the game."), 
    CONVERT("Convert everyone who would oppose you.");

    private final String text;

    Goal(String text) {
        this.text = text;
    }
}
