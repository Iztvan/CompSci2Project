package myclassproject.testgraph;

import com.storygraph.Node;
import com.storygraph.NodeBuilder;
import myclassproject.mystorygraph.MyNodeLabels;
import java.util.List;
import com.storygraph.Edge;
import com.storygraph.choices.MenuChoice;
import com.storygraph.NodeLabels;

public class IzzyTestEdgeBuilder extends MyEdgeBuilder {
    public IzzyTestEdgeBuilder(List <Node>  list) {
        super(list);
    }

    @Override
    @BuilderMethod
    public void rootEdges() {
        var root = get(NodeLabels.root.toString());
        var choice = new MenuChoice(MenuChoice.Options.Start);
        var nextNode = get(MyNodeLabels.atVillage.toString());
        root.add(new Edge(choice, nextNode));
    }

    @Override
    @BuilderMethod
    public void feedEdges() {
        // Get the source node
        var feedNode = get(MyNodeLabels.feed.toString());
        
        // Create choices for different feeding paths
        var choice1 = new MenuChoice("Feed the animals");
        var choice2 = new MenuChoice("Feed yourself");
        var choice3 = new MenuChoice("Don't feed anyone");
        
        // Get destination nodes
        var animalNode = get(MyNodeLabels.feedAnimals.toString());
        var selfNode = get(MyNodeLabels.feedSelf.toString());
        var noFeedNode = get(MyNodeLabels.noFeed.toString());
        
        // Add edges connecting choices to destinations
        feedNode.add(new Edge(choice1, animalNode));
        feedNode.add(new Edge(choice2, selfNode));
        feedNode.add(new Edge(choice3, noFeedNode));
    }
}