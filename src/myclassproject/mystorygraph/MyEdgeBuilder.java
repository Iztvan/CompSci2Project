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

		//Baby Gronk' idea
		var choice1 = new PlayerInteraction(ChoiceLabels.askbabyGronk.toString(), 
		babyGronk, icons.talk, 
		"We should go scam some old people who don't know anything about the internet.");
		var nextNode1 = get(MyNodeLabels.lick.toString());
		node.add(new Edge(choice1, nextNode1));
		
		//John John's idea
		var choice2 = new PlayerInteraction(ChoiceLabels.askJohnJohn.toString(), johnJohn, icons.talk, "We could just target bully someone trying to work their food service shift");
		var nextNode2 = get(MyNodeLabels.bully.toString());
		node.add(new Edge(choice2, nextNode2));
		
		//ManMan's idea
		var choice3 = new PlayerInteraction(ChoiceLabels.askManMan.toString(), manMan, icons.talk, "What a lovely idea ManMan.");
		var nextNode3 = get(MyNodeLabels.feed.toString());
		node.add(new Edge(choice3, nextNode3));

		//Womp's idea
		var choice4 = new PlayerInteraction(ChoiceLabels.askWomp.toString(), womp, icons.talk, "....");
		var nextNode4  = get(MyNodeLabels.womp.toString());
		node.add(new Edge(choice4, nextNode4));
	}

	@BuilderMehod 
	 public void feedEdges() {
		
		//you go along with manman's idea
		var node = get(MyNodeLabels.feed.toString());
		var choice1 = new DialogChoice("ManMan, this is really nice of you.");
		var nextNode1 = get(MyNodeLabels.yeah.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new DialogChoice("Oh brother, I already know where this is going");
		var nextNode2 = get(MyNodeLabels.override.toString());
		node.add(new Edge(choice2, nextNode2));
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
