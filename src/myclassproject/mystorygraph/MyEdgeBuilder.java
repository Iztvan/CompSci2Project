package myclassproject.mystorygraph;

import java.util.List;
import static myclassproject.mystorygraph.MyStoryEntities.*;
import com.storygraph.BuilderMethod;
import com.storygraph.Node;
import com.storygraph.NodeBuilder;
import com.storygraph.Edge;



public class MyEdgeBuilder extends NodeBuilder {
	/**
	 * Initializes the list of story graph nodes.
	 * @param list A list of all story graph nodes.
	 */

	 
	public MyEdgeBuilder(List<Node> list) {
		super(list);
	}

	/**
	 * Write a method for each node. 
	 * Use get to get a reference to the node using its label.
	 * The method should add the edges of the node one by one. 
	 * These methods must have a BuilderMethod annotation.
	 */
	//Istvan
	@BuilderMethod
	public void rootEdges() {
		var root = get(NodeLabels.root.toString());
		var choice = new MenuChoice(MenuChoice.Options.Start);
		var nextNode = get(MyNodeLabels.atVillage.toString());
		root.add(new Edge(choice, nextNode));
	}
	@BuilderMethod
	public void ideasEdges() {
		var node = get(MyNodeLabels.ideas.toString());
		var choice = new PlayerInteraction(ChoiceLabels.babyGronk.toString(), 
		babyGronk
	}


	@BuilderMethod
	public void atVillageEdges() {
		var node = get(MyNodeLabels.atVillage.toString());
		var choice = new PlayerInteraction(ChoiceLabels.babyGronk.toString(), 

	
	
	@BuilderMethod
	public void rootEdges() {
		//Example:
		//var root = get(NodeLabels.root.toString());
		//var choice = new MenuChoice(MenuChoice.Options.Start);
		//var nextNode = get(NodeLabels.atCottage.toString());
		//root.add(new Edge(choice, nextNode));
	}
}
