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
	public void suggestionsEdges() {
		var node = get(MyNodeLabels.suggestions.toString());

		var choice = new CloseNarrationChoice("No gang is successful if they have no motion. You, as the group leader, make every single decision for the gang and they reply to your every command. You are starving for clout so you consider faking like you actually care about your community and record a video of you guys helping people out or take out your bordem on some innocent person trying to meet ends met You decide to let the group have a say in a decision, for once");
		var nextNode = get(MyNodeLabels.ideas.toString());
		node.add(new Edge(choice, nextNode));
	}

	@BuilderMethod
	public void ideasEdges() {
		var node = get(MyNodeLabels.ideas.toString());

		var choice1 = new CloseNarrationChoice("You are very desperate for bread so you turn to Baby Gronk who has an idea.");
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
		var choice3 = new 
		var choice3 = new PlayerInteraction(ChoiceLabels.askManMan.toString(), manMan, icons.talk, "We should put this pent up energy towards something positive like feeding the homeless");
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

		var choice1 = new CloseNarrationChoice("ManMan takes you and your group to the convenience store and buy as many honey buns as possible, he grabs a few honey buns and puts them into a microwave for some unspecified amount of time");
		var nextNode1 = get(MyNodeLabels.yeah.toString());
		node.add(new Edge(choice1, nextNode1));


		var choice2 = new DialogChoice("ManMan, this is really nice of you.");
		var nextNode2 = get(MyNodeLabels.yeah.toString());
		node.add(new Edge(choice2, nextNode2));

		var choice3 = new DialogChoice("Oh brother, I already know where this is going");
		var nextNode3 = get(MyNodeLabels.override.toString());
		node.add(new Edge(choice3, nextNode3));
	 }

	 @BuilderMethod
	 public void yeahEdges() {
		var node = get(MyNodeLabels.yeah.toString());

		var choice1 = new CloseNarrationChoice("Some time goes by and some rancide smell provades the space, you investigate and see ManMan looking at the microwave with malicious intent. the stack of honeybuns didnt decrease insize yet, after all this time theres still honeybuns in the microwave.");
		var nextNode1 = get(MyNodeLabels.nothing.toString());
		node.add(new Edge(choice1, nextNode1));

		//you go along with manman's idea
		var choice2 = new DialogChoice("They been in there an awfully long time");
		var nextNode2 = get(MyNodeLabels.nothing.toString());
		node.add(new Edge(choice2, nextNode2));
	 }



	 @BuilderMethod
	 public void nothingEdges() {
		var node = get(MyNodeLabels.nothing.toString());
		var choice1 = new CloseNarrationChoice("you look at manman then back at the microwave, the honey buns are glowing white hot, and you feel the heat imminating from them.");
		var nextNode1 = get(MyNodeLabels.eat.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new PlayerInteraction(ChoiceLabels.longTime.toString(), manMan, icons.talk, "i just want them to have a warm snack.");
		var nextNode2 = get(MyNodeLabels.eat.toString());
		node.add(new Edge(choice2, nextNode2));
	 }
	 }

	 @BuilderMethod
	 public void eatEdges()  {
		var node = get(MyNodeLabels.eat.toString());


		//your not sure if its edible
		var choice = new DialogChoice("yeah, i don't think ANYONE is going to be able to eat these"),  new PlayerInteraction(ChoiceLabels.eat.toString(), manMan, icons.talk "Who said anything about eating them?");

		var nextNode = get(MyNodeLabels.override.toString());
		node.add(new Edge(choice, nextNode));
	 }

	 @BuilderMethods
	 public void overrideEdges() {
		var node = get(MyNodeLabels.override.toString());

		var choice1 = new CloseNarrationChoice("You realized that inhaling such copius amounts of galaxy gas has made your brain smooth, and once all of the pent up rot left you brain you realized just how stupid everyones idea was.");
		var nextNode1 = get(MyNodeLabels.mess.toString());
		
		var choice2 = new CloseNarrationChoice("With no backup plan you and the group decide to live in the alley for the rest of your lives as bums".);
		var nextNode2 = get(MyNodeLabels.mess.toString());

		var choice3 = new CloseNarrationChoice("You realize a random drunk is furiously charging towards you. He tries to break the bottle of ale he's carrying on his head, but fails as the bottle is too hard. He then knocks himself out.");
		var nextNode3 = get(MyNodeLabels.mess.toString());
	 }

	@BuilderMethod
	public void atVillageEdges() {
		var node = get(MyNodeLabels.atVillage.toString());
		var choice = new PlayerInteraction(ChoiceLabels.babyGronk.toString(), 
	}
