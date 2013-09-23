<h1>Assignment 2 </h1>
Coded using Java, using TDD and appropriate OO patterns.
<h2>A* Algorithm </h2>
A* algorithm a path finding algorithm that calculates the cost to walk from a start of the map to the end. The algorithm uses a cost metric, the difficulty that is needed to reach the tile, and a heuristic, in this case the Manhattan distance (|x1 - x2| + |y1 - |y2|), to find the cheapest path to traverse the terrain. The algorithm ensures that tiles are not checked multiple times or that it circles back.

The git repository contains a file called 'output.txt'. This file contains the path walked by the algorithm that has been implemented here.

To run the algorithm, please first build the contents of the repository by simply running ant. The algorithm can then be run from the root directory as 'java -jar dist/Assignment2.jar <full path to map>'.
