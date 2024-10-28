package myclassproject.mystorygraph;

import static myclassproject,mystorygraph.MyStoryEntities.*;

import java.util.List;
import.com.playerInput.PlayerInteraction.Icons;
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

	//Justin
<<<<<<< HEAD
=======

>>>>>>> 400882c40b290c9887964c174b48fa7f564badaf
	@BuilderMethod
<<<<<<< HEAD
<<<<<<< HEAD
	public void atVillageEdges() {
		var node = get(MyNodeLabels.atVillage.toString());
		var choice = new PlayerInteraction(ChoiceLabels.babyGronk.toString());
	}
=======
=======
	public void atVillageEdges() {
		var node = get(NodeLabels.atVillage.toString());
		var choice1 = new PlayerInteraction (ChoiceLabels.BabyGronk.toString(), babyGronk, Icons.talk,
				"Baby Gronk, Womp any ideas?");
		var nextNode1 = get(NodeLabels.ideas.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction (ChoiceLabels.ManMan.toString(), manMan, Icons.talk,
				"ManMan, JohnJohn, suggestions?");
		var nextNode2 = get(NodeLabels.ideas.toString());
		node.add(new Edge(choice2, nextNode2));
	}

	//Justin
<<<<<<< HEAD
=======

>>>>>>> 400882c40b290c9887964c174b48fa7f564badaf
	@BuilderMethod
>>>>>>> 5b4808f2631474320cc82047a5fc7913c94ba335
	public void suggestionsEdges() {
		var node = get(NodeLabels.suggestions.toString());
		var choice1 = new PlayerInteraction(ChoiceLabels.WhyNot.toString(), johnJohn, Icons.talk,
				"I don't see why not.");
		var nextNode1 = get(NodeLabels.bully.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(ChoiceLabels.WhyNot.toString(), manMan, Icons.talk,
				"What a lovely idea ManMan.");
		var nextNode2 = get(NodeLabels.feed.toString());
		node.add(new Edge(choice2, nextNode2));

		var choice3 = new PlayerInteraction(ChoiceLabels.NothingGoing.toString(), johnJohn, Icons.talk,
				"There's nothing going on in those heads of yours.");
		var nextNode3 = get(NodeLabels.ideas.toString());
		node.add(new Edge(choice3, nextNode3));
	}

	//Justin
	@BuilderMethod
	public void fallEdges() {
		var node = get(NodeLabels.fall.toString());
		var choice = new MenuChoice(MenuChoice.Options.Resume);
		var nextNode = get(NodeLabels.atVillage.toString());
		node.add(new Edge(choice, nextNode));
	}

	//Justin
	@BuilderMethod
	public void lickEdges() {
		var node = get(NodeLabels.lick.toString());
		var choice = new PlayerInteraction(ChoiceLabels.ContOne.toString(), galaxyGas, Icons.drink, "Continue");
		var nextNode = get(NodeLabels.override.toString());
		node.add(new Edge(choice, nextNode));
	}

	//Istvan
	public void ideasEdges() {
		var node = get(MyNodeLabels.ideas.toString());
		var choice1 = new PlayerInteraction(ChoiceLabels.DoIt.toString(), babyGronk, icons.talk, 
		"Let's do it.");
		var nextNode1 = get(MyNodeLabels.lick.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new PlayerInteraction(ChoiceLabels.ManMan.toString(), womp, icons.talk, "Room temperature IQ, I swear.");
		var nextNode2  = get(MyNodeLabels.suggestions.toString());
		node.add(new Edge(choice2, nextNode2));

		var choice3 = new PlayerInteraction(ChoiceLabels.Womp.toString(), womp, icons.talk, "Womp, any suggestions?");
		var nextNode3 = get(MyNodeLabels.fall.toString());
		node.add(new Edge(choice3, nextNode3));
	}

	//Istvan
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

	 //Istvan
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


	 //Istvan
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

	 //Istvan
	 @BuilderMethod
	 public void eatEdges()  {
		var node = get(MyNodeLabels.eat.toString());


		//your not sure if its edible
		var choice = new DialogChoice("yeah, i don't think ANYONE is going to be able to eat these"),  new PlayerInteraction(ChoiceLabels.eat.toString(), manMan, icons.talk "Who said anything about eating them?");

		var nextNode = get(MyNodeLabels.override.toString());
		node.add(new Edge(choice, nextNode));
	 }

	 //Istvan
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

<<<<<<< HEAD
>>>>>>> 718182f48d8c547b0b6e29af3ec0ba90d1002499
	@BuilderMethod
	public void atVillageEdges() {
		var node = get(MyNodeLabels.atVillage.toString());
		var choice = new PlayerInteraction(ChoiceLabels.babyGronk.toString(), 
=======
>>>>>>> 5b4808f2631474320cc82047a5fc7913c94ba335
	}
	//Orel
	@BuilderMethod
	 public void bullyEdges() {
		var node = get(MyNodeLabels.bully.toString());

		var choice1 = new CloseNarrationChoice("JohnJohn takes you and your group to a waffle house (bad idea) and start trying to cause commotion");
		var nextNode1 = get(MyNodeLabels.nothing.toString());
		node.add(new Edge(choice1, nextNode1));

		//you go along with johnjohn's idea
		var choice2 = new DialogChoice("Rev up those fryers!");
		var nextNode2 = get(MyNodeLabels.consequences.toString());
		node.add(new Edge(choice2, nextNode2));
	 }
	 @BuilderMehod 
	 public void messEdges() {
		
		//you go along with manman's idea
		var node = get(MyNodeLabels.mess.toString());

		var choice1 = new CloseNarrationChoice("The group, startled at first, now looks purplexed.");
		var nextNode1 = get(MyNodeLabels.nothing.toString());
		node.add(new Edge(choice1, nextNode1));


		var choice2 = new DialogChoice("Investigate the drunk man");
		var nextNode2 = get(MyNodeLabels.find.toString());
		node.add(new Edge(choice2, nextNode2));

		var choice3 = new DialogChoice("ignore");
		var nextNode3 = get(MyNodeLabels.leave.toString());
		node.add(new Edge(choice3, nextNode3));
	 }
	 @BuilderMethod
	 public void hearEdges() {
		var node = get(MyNodeLabels.hear.toString());

		var choice1 = new CloseNarrationChoice("You hold off of your attack and the rest of your group follows the drunken man gets up");
		var nextNode1 = get(MyNodeLabels.jump.toString());
		node.add(new Edge(choice1, nextNode1));
	 }
	 @BuilderMethod
	 public void jumpEdges() {
		var node = get(MyNodeLabels.jump.toString());

		var choice1 = new CloseNarrationChoice("After dealing with the drunk man with maximum efficiency, one of the members in your party is getting ready to make him bite the curb but you notice something unmistakable...");
		var nextNode1 = get(MyNodeLabels.realization.toString());
		node.add(new Edge(choice1, nextNode1));
	 }
	 @BuilderMethod
	 public void relizationEdges() {
		var node = get(MyNodeLabels.realization.toString());

		var choice1 = new CloseNarrationChoice("You realized its the circle chain that belonged to a former member of the shadow money wizard gang");
		var nextNode1 = get(MyNodeLabels.clean.toString());
		node.add(new Edge(choice1, nextNode1));
	 }
		
	
