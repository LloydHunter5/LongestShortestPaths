public class Main {
    public static void main(String[] args) {
        State[] states;
        if(args.length > 0 && args[0].equals("-canada")) {
            Canada.initialize();
            states = Canada.states;
        }else{
            States.initialize();
            states = States.states;
        }

        int len = states.length;

        // Creates a graph with weighted edges of all states in the USA
        double[][] pLengths = new double[len][len];
        // Initialize parents array to keep track of the shortest path
        int[][] parents = new int[len][len];
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++) {
                State s1 = states[i];
                State s2 = states[j];
                pLengths[i][j] = Double.MAX_VALUE;
                parents[i][j] = j;
                for(State neighbor : s1.neighbors()){
                    if(neighbor.equals(s2)) {
                        pLengths[i][j] = states[i].capital().distance(states[j].capital());
                    }
                }
            }
        }
        // Sets all self-loops to 0 (no travel distance needed)
        for(int i = 0; i < len; i++) pLengths[i][i] = 0;

        // Dijkstra's Algorithm, every start state -> every end state to find the shortest path
        for(int k = 0; k < len; k++) {
            for (int i = 0; i < len; i++) {
                //Actual algorithm
                for (int j = 0; j < len; j++){
                    // if there's a known path from the start state i to state k,
                    // and a known path from state k to the end state j
                    if(pLengths[i][k] != Double.MAX_VALUE && pLengths[k][j] != Double.MAX_VALUE){
                        // Edge relaxation
                        if(pLengths[i][j] > pLengths[i][k] + pLengths[k][j]){
                            pLengths[i][j] = pLengths[i][k] + pLengths[k][j];
                            parents[i][j] = parents[i][k];
                        }
                    }
                }
            }
        }


        //Finds the longest path in pLengths
        // lengths are stored as pLengths[start][end]
        double max = 0;
        int x = 0, y = 0;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                // if there's a possible path from i to j, and the path is longer than max
                if(pLengths[i][j] != Double.MAX_VALUE && max < pLengths[i][j]){
                    max = pLengths[i][j];
                    x = i;
                    y = j;
                }
            }
        }


        int[] path = new int[len];
        int count = 0;
        // reverse the path stored in parents
        while(x != y){
            path[count++] = x;
            x = parents[x][y];
        }
        System.out.print(states[x].code() + " to " + states[path[0]].code() + " is ");
        System.out.printf("%.0f",max);
        System.out.print(" km: " + states[x].code());
        // display the longest shortest path between two states
        while(count != 0){
            System.out.print(" " + states[path[--count]].code());
        }
    }
}
