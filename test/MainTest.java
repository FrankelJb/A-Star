import graph.WorldMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.util.ArrayList;


/**
 * Created with IntelliJ IDEA.
 * User: jonathan
 * Date: 2013/09/23
 * Time: 11:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    private String mapFilePath = "testmap.txt";


    @Before
    public void setup() throws FileNotFoundException, UnsupportedEncodingException {
        String[][] worldMapArrays = new String[5][5];
        String worldMapString = "@*^^^~~*~.**...^..*~~~*~X";
        for (int i = 0; i < worldMapString.length(); i++) {
            worldMapArrays[i / 5][i % 5] = String.valueOf(worldMapString.charAt(i));
        }

        PrintWriter writer = new PrintWriter(mapFilePath, "UTF-8");
        for (int i = 0; i < worldMapArrays.length; i++) {
            for (int j = 0; j < worldMapArrays[i].length; j++) {
                writer.print(worldMapArrays[i][j]);
            }
            writer.println();
        }
        writer.close();
    }

    @Test
    public void TestMain() throws IOException {
        //Run the main method and produce an output map using the map printed in the setup
        String[] args = new String[1];
        args[0] = mapFilePath;
        Main.main(args);

        //Using the provided solution create a new terrain matrix that will be used to test the approximate correctness
        String[][] testOutputMap = new String[5][5];
        String worldMapString = "##^^^~~#~.**.#.^..#~~~*~#";
        for (int i = 0; i < worldMapString.length(); i++) {
            testOutputMap[i / 5][i % 5] = String.valueOf(worldMapString.charAt(i));
        }

        //Put all the data from the output file into an array
        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String line = reader.readLine();
        String[][] outputMap = new String[5][5];
        int lineNumber = 0;
        while(line != null){
            String[] terrain = new String[line.length()];
            for (int i = 0; i < line.length(); i++) {
                terrain[i] = String.valueOf(line.charAt(i));
            }
            outputMap[lineNumber++] = terrain;
            line = reader.readLine();
        }

        //Test that all the entries are equal
        for (int i = 0; i < testOutputMap.length; i++) {
            for (int j = 0; j < testOutputMap[i].length; j++) {
                assertEquals(testOutputMap[i][j], outputMap[i][j]);
            }
        }
    }

    @After
    public void cleanFiles(){
        File[] fileList = new File[2];
        fileList[0] = new File(mapFilePath);
        fileList[1] = new File("output.txt");
        for (File file : fileList) {
            file.delete();
        }
    }
}
