// Helper Class
// Written by Richard Paige
public final class Canada {
    
    public final static State Alberta              = new State("AB", "Alberta");
    public final static State BritishColumbia      = new State("BC", "British Columnbia");
    public final static State Manitoba             = new State("MB", "Manitoba");
    public final static State NewBrunswick         = new State("NB", "New Brunswick");
    public final static State Newfoundland         = new State("NL", "Newfoundland");
    public final static State NorthwestTerritories = new State("NT", "Northwest Territories");
    public final static State NovaScotia           = new State("NS", "Nova Scotia");
    public final static State Nunavut              = new State("NU", "Nunavut");
    public final static State Ontario              = new State("ON", "Ontario");
    public final static State PrinceEdwardIsland   = new State("PE", "Prince Edward Island");
    public final static State Quebec               = new State("QC", "Quebec");
    public final static State Saskatchewan         = new State("SK", "Saskatchewan");
    public final static State Yukon                = new State("YT", "Yukon");


    // Set the capitals for each province.

    private static void capital(State state, String name, double longitude, double latitude) {
        state.capital(new City(name, state, longitude, latitude));
    }

    private static void initializeCapitals() {
        capital(Alberta,              "Edmonton",      53.5461, -113.4938);
        capital(BritishColumbia,      "Victoria",      48.4284, -123.3656);
        capital(Manitoba,             "Winnipeg",      49.8951,  -66.6431);
        capital(NewBrunswick,         "Fredericton",   45.9636,  -66.6431);
        capital(Newfoundland,         "St. John's",    47.5615,  -52.7126);
        capital(NorthwestTerritories, "Yellowknife",   62.4540, -114.2718);
        capital(NovaScotia,           "Halifax",       44.6488,  -63.5752);
        capital(Nunavut,              "Iqaluit",       63.7467,  -68.5170);
        capital(Ontario,              "Toronto",       43.6532,  -79.3832);
        capital(PrinceEdwardIsland,   "Charlottetown", 46.2382,  -63.1311);
        capital(Quebec,               "Quebec",        46.8139,  -71.2080);
        capital(Saskatchewan,         "Regina",        50.4452, -104.6189);
        capital(Yukon,                "Whitehorse",    60.7212, -135.0568);
    }


    // Set the neighbors for each province.

    private static void initializeNeighbors() {
        Alberta.neighbors(new State[] {
            Saskatchewan,
            NorthwestTerritories,
            BritishColumbia
        });

        BritishColumbia.neighbors(new State[] {
            Alberta,
            NorthwestTerritories,
            Yukon
        });

        Manitoba.neighbors(new State[] {
            Ontario,
            Nunavut,
            Saskatchewan
        });

        NewBrunswick.neighbors(new State[] {
            NovaScotia,
            Quebec
        });

        Newfoundland.neighbors(new State[] {
            Quebec
        });

        NorthwestTerritories.neighbors(new State[] {
            Nunavut,
            Yukon,
            BritishColumbia,
            Alberta,
            Saskatchewan
        });

        NovaScotia.neighbors(new State[] {
            NewBrunswick
        });

        Nunavut.neighbors(new State[] {
            NorthwestTerritories,
            Manitoba
        });

        Ontario.neighbors(new State[] {
            Quebec,
            Manitoba
        });

        PrinceEdwardIsland.neighbors(new State[] {
        });

    
        Quebec.neighbors(new State[] { 
            NewBrunswick,
            Newfoundland,
            Ontario
        });

        Saskatchewan.neighbors(new State[] { 
            Manitoba,
            NorthwestTerritories,
            Alberta
        });

        Yukon.neighbors(new State[] {
            NorthwestTerritories,
            BritishColumbia
        });
    }


    // List of all the provinces.

    public final static State[] states = {
        Alberta,
        BritishColumbia,
        Manitoba,
        NewBrunswick,
        Newfoundland,
        NorthwestTerritories,
        NovaScotia,
        Nunavut,
        Ontario,
        PrinceEdwardIsland,
        Quebec,
        Saskatchewan,
        Yukon,
    };

    private static boolean initialized = false;
    public static void initialize() {
        initializeCapitals();
        initializeNeighbors();
        initialized = true;
    }

    public static State find(String name) {
        if (!initialized) initialize();
        for (State state : states) {
            if (state.name().equals(name) || state.code().equals(name)) return state;
        }
        return null;
    }
}
