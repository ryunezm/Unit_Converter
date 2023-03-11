package com.ryunezm.apps.javacurrconv.model.enums;

public enum Time {
    second("Second", "s", 1, true),
    quettaseconds("Quettaseconds", "Qs", 1e30, false),
    ronnaseconds("Ronnaseconds", "Rs", 1e27, false),
    yottaseconds("Yottaseconds", "Ys", 1e24, false),
    zettaseconds("Zettaseconds", "Zs", 1e21, false),
    exaseconds("Exaseconds", "Es", 1e18, false),
    petaseconds("Petaseconds", "Ps", 1e15, false),
    teraseconds("Teraseconds", "Ts", 1e12, false),
    gigaseconds("Gigaseconds", "Gs", 1e9, false),
    megaseconds("Megaseconds", "Ms", 1e6, false),
    kiloseconds("Kiloseconds", "ks", 1e3, false),
    hectoseconds("Hectoseconds", "hs", 1e2, false),
    decaseconds("Decaseconds", "das", 1e1, false),
    deciseconds("Deciseconds", "ds", 1e-1, false),
    centiseconds("Centiseconds", "cs", 1e-2, false),
    milliseconds("Miliseconds", "ms", 1e-3, true),
    microseconds("Microseconds", "µs", 1e-6, true),
    nanoseconds("Nanoseconds", "ns", 1e-9, false),
    picoseconds("Picoseconds", "ps", 1e-12, false),
    femtoseconds("Femtoseconds", "fs", 1e-15, false),
    attoseconds("Attoseconds", "as", 1e-18, false),
    zeptoseconds("Zeptoseconds", "zs", 1e-21, false),
    yoctoseconds("Yoctoseconds", "ys", 1e-24, false),
    rontoseconds("Rontoseconds", "rs", 1e-27, false),
    quectoseconds("Quectoseconds", "qs", 1e-30, false),
    minutes("Minutes", "min", 1/60, true),
    hour("Hours", "h", 1/3600, true),
    days("Days", "day", 1/86400, true),
    weeks("Weeks", "week", 1/604800, true),
    years("Years", "year", 1/31557600, true);

    private String name;
    private String symbol;
    private double factor;
    private boolean commonness;

    Time(String name, String symbol, double factor, boolean commonness) {
        this.name = name;
        this.symbol = symbol;
        this.factor = factor;
        this.commonness = commonness;
    }
}
