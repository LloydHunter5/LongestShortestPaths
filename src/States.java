// Helper Class
// Written by Richard Paige
public final class States {
    
    public final static State Alabama        = new State ("AL", "Alabama");
    public final static State Alaska         = new State ("AK", "Alaska");
    public final static State Arizona        = new State ("AZ", "Arizona");
    public final static State Arkansas       = new State ("AR", "Arkansas");
    public final static State California     = new State ("CA", "California");
    public final static State Colorado       = new State ("CO", "Colorado");
    public final static State Connecticut    = new State ("CT", "Connecticut");
    public final static State Delaware       = new State ("DE", "Delaware");
    public final static State DistOfColumbia = new State ("DC", "District of Columbia");
    public final static State Florida        = new State ("FL", "Florida");
    public final static State Georgia        = new State ("GA", "Georgia");
    public final static State Hawaii         = new State ("HI", "Hawaii");
    public final static State Idaho          = new State ("ID", "Idaho");
    public final static State Illinois       = new State ("IL", "Illinois");
    public final static State Indiana        = new State ("IN", "Indiana");
    public final static State Iowa           = new State ("IA", "Iowa");
    public final static State Kansas         = new State ("KS", "Kansas");
    public final static State Kentucky       = new State ("KY", "Kentucky");
    public final static State Louisiana      = new State ("LA", "Louisiana");
    public final static State Maine          = new State ("ME", "Maine");
    public final static State Maryland       = new State ("MD", "Maryland");
    public final static State Massachusettes = new State ("MA", "Massachusettes");
    public final static State Michigan       = new State ("MI", "Michigan");
    public final static State Minnesota      = new State ("MN", "Minnesota");
    public final static State Mississippi    = new State ("MS", "Mississippi");
    public final static State Missouri       = new State ("MO", "Missouri");
    public final static State Montana        = new State ("MT", "Montana");
    public final static State Nebraska       = new State ("NE", "Nebraska");
    public final static State Nevada         = new State ("NV", "Nevada");
    public final static State NewHampshire   = new State ("NH", "New Hampshire");
    public final static State NewJersey      = new State ("NJ", "New Jersey");
    public final static State NewMexico      = new State ("NM", "New Mexico");
    public final static State NewYork        = new State ("NY", "New York");
    public final static State NorthCarolina  = new State ("NC", "North Carolina");
    public final static State NorthDakota    = new State ("ND", "North Dakota");
    public final static State Ohio           = new State ("OH", "Ohio");
    public final static State Oklahoma       = new State ("OK", "Oklahoma");
    public final static State Oregon         = new State ("OR", "Oregon");
    public final static State Pennsylvania   = new State ("PA", "Pennsylvania");
    public final static State RhodeIsland    = new State ("RI", "Rhode Island");
    public final static State SouthCarolina  = new State ("SC", "South Carolina");
    public final static State SouthDakota    = new State ("SD", "South Dakota");
    public final static State Tennessee      = new State ("TN", "Tennessee");
    public final static State Texas          = new State ("TX", "Texas");
    public final static State Utah           = new State ("UT", "Utah");
    public final static State Vermont        = new State ("VT", "Vermont");
    public final static State Virginia       = new State ("VA", "Virginia");
    public final static State Washington     = new State ("WA", "Washington");
    public final static State WestVirginia   = new State ("WV", "West Virginia");
    public final static State Wisconsin      = new State ("WI", "Wisconsin");
    public final static State Wyoming        = new State ("WY", "Wyoming");


    // Set the capitals for each state.

    private static void capital(State state, String name, double longitude, double latitude) {
        state.capital(new City(name, state, longitude, latitude));
    }

    private static void initializeCapitals() {
        capital(Alabama,        "Montgomery",      32.3617, -86.2792);
        capital(Alaska,         "Juneau",          58.3014, -134.422);
        capital(Arizona,        "Phoenix",         33.4500, -112.067);
        capital(Arkansas,       "Little Rock",     34.7361, -92.3311);
        capital(California,     "Sacramento",      38.5556, -121.469);
        capital(Colorado,       "Denver",          39.7618, -104.881);
        capital(Connecticut,    "Hartford",        41.7627, -72.6743);
        capital(Delaware,       "Dover",           39.1619, -75.5267);
        capital(DistOfColumbia, "Washington",      38.9072, -77.0369);
        capital(Florida,        "Tallahassee",     30.4550, -84.2533);
        capital(Georgia,        "Atlanta",         33.7550, -84.3900);
        capital(Hawaii,         "Honolulu",        21.3000, -157.817);
        capital(Idaho,          "Boise",           43.6167, -116.200);
        capital(Illinois,       "Springfield",     39.6983, -89.6197);
        capital(Indiana,        "Indianapolis",    39.7910, -86.1480);
        capital(Iowa,           "Des Moines",      41.5908, -93.6208);
        capital(Kansas,         "Topeka",          39.0558, -95.6894);
        capital(Kentucky,       "Frankfort",       38.1970, -84.8630);
        capital(Louisiana,      "Baton Rouge",     30.4500, -91.1400);
        capital(Maine,          "Augusta",         44.3070, -69.7820);
        capital(Maryland,       "Annapolis",       38.9729, -76.5012);
        capital(Massachusettes, "Boston",          42.3581, -71.0636);
        capital(Michigan,       "Lansing",         42.7336, -84.5467);
        capital(Minnesota,      "Saint Paul",      44.9442, -93.0936);
        capital(Mississippi,    "Jackson",         32.2989, -90.1847);
        capital(Missouri,       "Jefferson City",  38.5767, -92.1736);
        capital(Montana,        "Helena",          46.5958, -112.027);
        capital(Nebraska,       "Lincoln",         40.8106, -96.6803);
        capital(Nevada,         "Carson City",     39.1608, -119.754);
        capital(NewHampshire,   "Concord",         43.2067, -71.5381);
        capital(NewJersey,      "Trenton",         40.2237, -74.7640);
        capital(NewMexico,      "Santa Fe",        35.6672, -105.964);
        capital(NewYork,        "Albany",          42.6525, -73.7572);
        capital(NorthCarolina,  "Raleigh",         35.7667, -78.6333);
        capital(NorthDakota,    "Bismarck",        46.8133, -100.779);
        capital(Ohio,           "Columbus",        39.9833, -82.9833);
        capital(Oklahoma,       "Oklahoma City",   35.4822, -97.5350);
        capital(Oregon,         "Salem",           44.9308, -123.029);
        capital(Pennsylvania,   "Harrisburg",      40.2697, -76.8756);
        capital(RhodeIsland,    "Providence",      41.8236, -71.4222);
        capital(SouthCarolina,  "Columbia",        34.0006, -81.0347);
        capital(SouthDakota,    "Pierre",          44.3680, -100.336);
        capital(Tennessee,      "Nashville",       36.1667, -86.7833);
        capital(Texas,          "Austin",          30.2500, -97.7500);
        capital(Utah,           "Salt Lake City",  40.7500, -111.883);
        capital(Vermont,        "Montpelier",      44.2597, -72.5750);
        capital(Virginia,       "Richmond",        37.5333, -77.4667);
        capital(Washington,     "Olympia",         47.0425, -122.893);
        capital(WestVirginia,   "Charleston",      38.3472, -81.6333);
        capital(Wisconsin,      "Madison",         43.0667, -89.4000);
        capital(Wyoming,        "Cheyenne",        41.1456, -104.802);
    }


    // Set the neighbors for each state.

    private static void initializeNeighbors() {
        Alabama.neighbors(new State[] {
            Mississippi,
            Tennessee,
            Georgia,
            Florida
        });

        Alaska.neighbors(new State[] {
        });

        Arizona.neighbors(new State[] {
            California,
            Nevada,
            Utah,
            NewMexico
        });

        Arkansas.neighbors(new State[] {
            Texas,
            Oklahoma,
            Missouri,
            Tennessee,
            Mississippi,
            Louisiana,
        });

        California.neighbors(new State[] {
            Oregon,
            Nevada,
            Arizona
        });

        Colorado.neighbors(new State[] {
            Utah,
            Wyoming,
            Nebraska,
            Kansas,
            Oklahoma,
            NewMexico
        });

        Connecticut.neighbors(new State[] {
            NewYork,
            Massachusettes,
            RhodeIsland
        });

        Delaware.neighbors(new State[] {
            Maryland,
            Pennsylvania,
            NewJersey
        });

        DistOfColumbia.neighbors(new State[] {
            Maryland,
            Virginia
        });

        Florida.neighbors(new State[] {
            Alabama,
            Georgia
        });

    
        Georgia.neighbors(new State[] { 
             Alabama,
            Tennessee,
            NorthCarolina,
            SouthCarolina,
            Florida
        });

        Hawaii.neighbors(new State[] { 
        });

        Idaho.neighbors(new State[] {
            Oregon,
            Washington,
            Montana,
            Wyoming,
            Utah,
            Nevada
        });

        Illinois.neighbors(new State[] {
            Missouri,
            Iowa,
            Wisconsin,
            Indiana,
            Kentucky
        });

        Indiana.neighbors(new State[] {
            Illinois,
            Michigan,
            Ohio,
            Kentucky
        });

        Iowa.neighbors(new State[] {
            Nebraska,
            SouthDakota,
            Minnesota,
            Wisconsin,
            Illinois,
            Missouri
        });

        Kansas.neighbors(new State[] {
            Colorado,
            Nebraska,
            Missouri,
            Oklahoma
        });

        Kentucky.neighbors(new State[] {
            Missouri,
            Illinois,
            Indiana,
            Ohio,
            WestVirginia,
            Virginia,
            Tennessee
        });

        Louisiana.neighbors(new State[] {
            Texas,
            Arkansas,
            Mississippi
        });

        Maine.neighbors(new State[] {
            NewHampshire
        });

        Maryland.neighbors(new State[] {
            WestVirginia,
            Pennsylvania,
            Delaware,
            DistOfColumbia,
            Virginia
        });

        Massachusettes.neighbors(new State[] {
            NewYork,
            Vermont,
            NewHampshire,
            RhodeIsland,
            Connecticut
        });

        Michigan.neighbors(new State[] {
            Wisconsin,
            Ohio,
            Indiana
        });

        Minnesota.neighbors(new State[] {
            SouthDakota,
            NorthDakota,
            Wisconsin,
            Iowa
        });

        Mississippi.neighbors(new State[] {
            Louisiana,
            Arkansas,
            Tennessee,
            Alabama
        });

        Missouri.neighbors(new State[] {
            Oklahoma,
            Kansas,
            Nebraska,
            Iowa,
            Illinois,
            Kentucky,
            Tennessee,
            Arkansas
        });

        Montana.neighbors(new State[] {
            Idaho,
            NorthDakota,
            SouthDakota,
            Wyoming
        });

        Nebraska.neighbors(new State[] {
            Colorado,
            Wyoming,
            SouthDakota,
            Iowa,
            Missouri,
            Kansas
        });

        Nevada.neighbors(new State[] {
            California,
            Oregon,
            Idaho,
            Utah,
            Arizona
        });

        NewHampshire.neighbors(new State[] {
            Vermont,
            Maine,
            Massachusettes
        });

        NewJersey.neighbors(new State[] {
            Pennsylvania,
            NewYork,
            Delaware
        });

        NewMexico.neighbors(new State[] {
            Arizona,
            Colorado,
            Oklahoma,
            Texas
        });

        NewYork.neighbors(new State[] {
            Vermont,
            NewJersey,
            Pennsylvania,
            Connecticut,
            Massachusettes
        });

        NorthCarolina.neighbors(new State[] {
            Tennessee,
            Virginia,
            SouthCarolina,
            Georgia
        });

        NorthDakota.neighbors(new State[] {
            Montana,
            Minnesota,
            SouthDakota
        });

        Ohio.neighbors(new State[] {
            Indiana,
            Michigan,
            WestVirginia,
            Pennsylvania,
            Kentucky
        });

        Oklahoma.neighbors(new State[] {
            NewMexico,
            Colorado,
            Kansas,
            Missouri,
            Arkansas,
            Texas
        });

        Oregon.neighbors(new State[] {
            Washington,
            Idaho,
            Nevada,
            California
        });

        Pennsylvania.neighbors(new State[] {
            WestVirginia,
            Ohio,
            NewYork,
            NewJersey,
            Delaware,
            Maryland
        });

        RhodeIsland.neighbors(new State[] {
            Connecticut,
            Massachusettes
        });

        SouthCarolina.neighbors(new State[] {
            Georgia,
            NorthCarolina
        });

        SouthDakota.neighbors(new State[] {
            Wyoming,
            Montana,
            NorthDakota,
            Minnesota,
            Iowa,
            Nebraska
        });

        Tennessee.neighbors(new State[] {
            Arkansas,
            Missouri,
            Kentucky,
            Virginia,
            NorthCarolina,
            Georgia,
            Alabama,
            Mississippi
        });

        Texas.neighbors(new State[] {
            NewMexico,
            Oklahoma,
            Arkansas,
            Louisiana
        });

        Utah.neighbors(new State[] {
            Nevada,
            Idaho,
            Wyoming,
            Colorado,
            Arizona
        });

        Vermont.neighbors(new State[] {
            NewYork,
            NewHampshire,
            Massachusettes
        });

        Virginia.neighbors(new State[] {
            Kentucky,
            WestVirginia,
            Maryland,
            DistOfColumbia,
            NorthCarolina,
            Tennessee
        });

        Washington.neighbors(new State[] {
            Idaho,
            Oregon
        });

        WestVirginia.neighbors(new State[] {
            Kentucky,
            Ohio,
            Pennsylvania,
            Maryland,
            Virginia
        });

        Wisconsin.neighbors(new State[] {
            Iowa,
            Minnesota,
            Michigan,
            Illinois
        });

        Wyoming.neighbors(new State[] {
            Utah,
            Idaho,
            Montana,
            SouthDakota,
            Nebraska,
            Colorado
        });
    }

    private static boolean initialized = false;
    public static void initialize() {
        initializeCapitals();
        initializeNeighbors();
        initialized = true;
    }


    // List of all the states.

    public final static State[] states = {
        Alabama,        Alaska,      Arizona,       Arkansas,     California,
        Colorado,       Connecticut, Delaware,      Florida,      Georgia,
        Hawaii,         Idaho,       Illinois,      Indiana,      Iowa,
        Kansas,         Kentucky,    Louisiana,     Maine,        Maryland,
        Massachusettes, Michigan,    Minnesota,     Mississippi,  Missouri,
        Montana,        Nebraska,    Nevada,        NewHampshire, NewJersey,
        NewMexico,      NewYork,     NorthCarolina, NorthDakota,  Ohio,
        Oklahoma,       Oregon,      Pennsylvania,  RhodeIsland,  SouthCarolina,
        SouthDakota,    Tennessee,   Texas,         Utah,         Vermont,
        Virginia,       Washington,  WestVirginia,  Wisconsin,    Wyoming,
        DistOfColumbia
    };

    public static State find(String name) {
        if (!initialized) initialize();
        for (State state : states) {
            if (state.name().equals(name) || state.code().equals(name)) return state;
        }
        return null;
    }
}
