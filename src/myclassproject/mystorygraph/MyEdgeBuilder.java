package myclassproject.mystorygraph;

import static myclassproject.mystorygraph.MyStoryEntities.*;

import java.util.List;
import com.playerInput.PlayerInteraction.Icons;
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

	//Orel
	@BuilderMethod
	public void bullyEdges() {
		var node = get(NodeLabels.bully.toString());
		var choice = new PlayerInteraction(ChoiceLabels.RevUp.toString(), johnJohn, Icons.talk, "Rev up those fryers, cause I'm starving.");
		var nextNode = get(NodeLabels.consequences.toString());
		node.add(new Edge(choice, nextNode));
	}

	//Istvan
	@BuilderMehod 
	 public void feedEdges() {
		
		var node = get(MyNodeLabels.feed.toString());
		var choice1 = new PlayerInteraction(ChoiceLabels.NiceOfYou.toString(), manMan, icons.talk, "ManMan, this is really nice of you.");
		var nextNode1 = get(MyNodeLabels.yeah.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(ChoiceLabels.OhBrother.toString(), manMan, icons.talk, "Oh brother, I already know where this is going.");
		var nextNode2 = get(MyNodeLabels.override.toString());
		node.add(new Edge(choice2, nextNode2));
	 }

	 //Orel
	 @BuilderMethod
	 public void consequencesEdges() {
		var node = get(NodeLabels.consequences.toString());
		var choice = new PlayerInteraction(ChoiceLabels.ContTwo.toString(), galaxyGas, Icons.drink, "Continue");
		var nextNode = get(NodeLabels.override.toString());
		node.add(new Edge(choice, nextNode));
	 }

	//Istvan
	 @BuilderMethods
	public void overrideEdges() {
		var node = get(MyNodeLabels.override.toString());
		var choice = new PlayerInteraction(ChoiceLabels.ContThree.toString(), galaxyGas, icons.drink, "Continue");
	 }

<<<<<<< HEAD
	//Justin
=======

	 //Istvan
	 @BuilderMethod
	 public void cleanEdges()  {
		var node = get(MyNodeLabels.clean.toString());



>>>>>>> bacc849b3e927ad3dc5e07e71886214795ce72ed
	@BuilderMethod
<<<<<<< HEAD
	public void messEdges() {
		var node = get(NodeLabels.mess.toString());
		var choice1 = new PlayerInteraction(ChoiceLabels.DrunkMan.toString(), drunkMan, Icons.research, "Investigating drunk man.");
		var nextNode1 = get(NodeLabels.leave.toString());
=======
	public void atVillageEdges() {
		var node = get(MyNodeLabels.atVillage.toString());
		var choice = new PlayerInteraction(ChoiceLabels.babyGronk.toString(), 

	}
	//Orel
	@BuilderMethod
	 public void bullyEdges() {
		var node = get(MyNodeLabels.bully.toString());



		var choice1 =  new PlayerInteraction(ChoiceLabels.How.toString(), Gilbert, icons.talk "How did this happen to you?");
		var nextNode1 = get(MyNodeLabels.background.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(ChoiceLabels.TrulyYou.toString(), Gilbert, icons.talk "Is this truly you?");
		var nextNode2 = get(MyNodeLabels.background.toString());
		node.add(new Edge(choice2, nextNode2));
	 }

}

=======
		var choice1 = new CloseNarrationChoice("JohnJohn takes you and your group to a waffle house (bad idea) and start trying to cause commotion");
		var nextNode1 = get(MyNodeLabels.nothing.toString());
>>>>>>> bacc849b3e927ad3dc5e07e71886214795ce72ed
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new CloseNarrationChoice();
		var nextNode2 = get(NodeLabels.find.toString());
		node.add(new Edge(choice2, nextNode2));
	}

	//Istvan
	@BuilderMethod
	public void yeahEdges() {
		var node = get(MyNodeLabels.yeah.toString());
		var choice = new PlayerInteraction(ChoiceLabels.LongTime.toString(), manMan, icons.talk, "They been in there an awfully long time.");
		var nextNode = get(MyNodeLabels.nothing.toString());
		node.add(new Edge(choice, nextNode));
	 }

	//Justin
	@BuilderMethod
	public void nothingEdges() {
		var node = get(MyNodeLabels.nothing.toString());
		var choice = new PlayerInteraction(ChoiceLabels.EatThese.toString(), manMan, icons.talk, "Yeah, I don't think ANYONE is going to be able to eat these.");
		var nextNode = get(MyNodeLabels.eat.toString());
		node.add(new Edge(choice, nextNode));
	 }

	//Istvan
	@BuilderMethod
	public void eatEdges()  {
		var node = get(MyNodeLabels.eat.toString());
		var choice = new PlayerInteraction(ChoiceLabels.YouDid.toString(), manMan, icons.talk, "YOU DID, you know what, you're over with.");
		var nextNode = get(MyNodeLabels.override.toString());
		node.add(new Edge(choice, nextNode));
	 }

	//Orel
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
	 public void realizationEdges() {
		var node = get(MyNodeLabels.realization.toString());

		var choice1 = new CloseNarrationChoice("You realized its the circle chain that belonged to a former member of the shadow money wizard gang");
		var nextNode1 = get(MyNodeLabels.clean.toString());
		node.add(new Edge(choice1, nextNode1));
	 }
<<<<<<< HEAD
=======
		
	


>>>>>>> bacc849b3e927ad3dc5e07e71886214795ce72ed