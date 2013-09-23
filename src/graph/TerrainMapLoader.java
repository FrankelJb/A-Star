package graph;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jonathan
 * Date: 2013/09/17
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class TerrainMapLoader {

    public WorldMap load(String filePath) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        WorldMap worldMap = null;

        try {
            String line = reader.readLine();
            List<String[]> terrains = new ArrayList<String[]>();

            while(line != null){
                String[] terrain = new String[line.length()];
                for (int i = 0; i < line.length(); i++) {
                    terrain[i] = String.valueOf(line.charAt(i));
                }

                terrains.add(terrain);
                line = reader.readLine();
            }

            worldMap = new WorldMap(terrains.size(), terrains.get(0).length);
            worldMap.buildMap(terrains.toArray(new String[terrains.size()][]));

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return worldMap;
    }
}



