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
		var root = get(MyNodeLabels.root.toString());
		var choice = new MenuChoice(MenuChoice.Options.Start);
		var nextNode = get(MyNodeLabels.atVillage.toString());
		root.add(new Edge(choice, nextNode));
	}

	//Justin

	@BuilderMethod
	public void atVillageEdges() {
		var node = get(MyNodeLabels.atVillage.toString());
		var choice1 = new PlayerInteraction (MyChoiceLabels.BabyGronk.toString(), babyGronk, Icons.talk,
				"Baby Gronk, Womp any ideas?");
		var nextNode1 = get(MyNodeLabels.ideas.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction (MyChoiceLabels.ManMan.toString(), manMan, Icons.talk,
				"ManMan, JohnJohn, suggestions?");
		var nextNode2 = get(MyNodeLabels.ideas.toString());
		node.add(new Edge(choice2, nextNode2));
	}

	//Justin

	@BuilderMethod
	public void suggestionsEdges() {
		var node = get(MyNodeLabels.suggestions.toString());
		var choice1 = new PlayerInteraction(MyChoiceLabels.WhyNot.toString(), johnJohn, Icons.talk,
				"I don't see why not.");
		var nextNode1 = get(MyNodeLabels.bully.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(MyChoiceLabels.WhyNot.toString(), manMan, Icons.talk,
				"What a lovely idea ManMan.");
		var nextNode2 = get(MyNodeLabels.feed.toString());
		node.add(new Edge(choice2, nextNode2));

		var choice3 = new PlayerInteraction(MyChoiceLabels.NothingGoing.toString(), johnJohn, Icons.talk,
				"There's nothing going on in those heads of yours.");
		var nextNode3 = get(MyNodeLabels.ideas.toString());
		node.add(new Edge(choice3, nextNode3));
	}

<<<<<<< HEAD
=======
	//Istvan
	@BuilderMethod
	public void ideasEdges() {
		var node = get(MyNodeLabels.ideas.toString());
		var choice1 = new PlayerInteraction(MyChoiceLabels.DoIt.toString(), babyGronk, Icons.talk, 
		"Let's do it.");
		var nextNode1 = get(MyNodeLabels.lick.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.ManMan.toString(), womp, Icons.talk, "Room temperature IQ, I swear.");
		var nextNode2  = get(MyNodeLabels.suggestions.toString());
		node.add(new Edge(choice2, nextNode2));

		var choice3 = new PlayerInteraction(MyChoiceLabels.Womp.toString(), womp, Icons.talk, "Womp, any suggestions?");
		var nextNode3 = get(MyNodeLabels.fall.toString());
		node.add(new Edge(choice3, nextNode3));
	}

>>>>>>> 22edca2b85f064a7d8cf653f1f74385784f29100
	//Justin
	@BuilderMethod
	public void fallEdges() {
		var node = get(MyNodeLabels.fall.toString());
		var choice = new MenuChoice(MenuChoice.Options.Resume);
		var nextNode = get(MyNodeLabels.atVillage.toString());
		node.add(new Edge(choice, nextNode));
	}

	//Justin
	@BuilderMethod
	public void lickEdges() {
		var node = get(MyNodeLabels.lick.toString());
		var choice = new PlayerInteraction(MyChoiceLabels.ContOne.toString(), galaxyGas, Icons.drink, "Continue");
		var nextNode = get(MyNodeLabels.override.toString());
		node.add(new Edge(choice, nextNode));
	}

<<<<<<< HEAD
	//Istvan
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
=======
	//Orel
	@BuilderMethod
	public void bullyEdges() {
		var node = get(MyNodeLabels.bully.toString());
		var choice = new PlayerInteraction(MyChoiceLabels.RevUp.toString(), johnJohn, Icons.talk, "Rev up those fryers, cause I'm starving.");
		var nextNode = get(MyNodeLabels.consequences.toString());
		node.add(new Edge(choice, nextNode));
>>>>>>> 22edca2b85f064a7d8cf653f1f74385784f29100
	}

	//Istvan
	@BuilderMethod 
	public void feedEdges() {
		
		//you go along with manman's idea
		var node = get(MyNodeLabels.feed.toString());
<<<<<<< HEAD

		var choice1 = new CloseNarrationChoice("ManMan takes you and your group to the convenience store and buy as many honey buns as possible, he grabs a few honey buns and puts them into a microwave for some unspecified amount of time");
=======
		var choice1 = new PlayerInteraction(MyChoiceLabels.NiceOfYou.toString(), manMan, Icons.talk, "ManMan, this is really nice of you.");
>>>>>>> 22edca2b85f064a7d8cf653f1f74385784f29100
		var nextNode1 = get(MyNodeLabels.yeah.toString());
		node.add(new Edge(choice1, nextNode1));

<<<<<<< HEAD

		var choice2 = new DialogChoice("ManMan, this is really nice of you.");
		var nextNode2 = get(MyNodeLabels.yeah.toString());
=======
		var choice2 = new PlayerInteraction(MyChoiceLabels.OhBrother.toString(), manMan, Icons.talk, "Oh brother, I already know where this is going.");
		var nextNode2 = get(MyNodeLabels.override.toString());
>>>>>>> 22edca2b85f064a7d8cf653f1f74385784f29100
		node.add(new Edge(choice2, nextNode2));
<<<<<<< HEAD

		var choice3 = new DialogChoice("Oh brother, I already know where this is going");
		var nextNode3 = get(MyNodeLabels.override.toString());
		node.add(new Edge(choice3, nextNode3));
	 }
=======
	}
>>>>>>> 22edca2b85f064a7d8cf653f1f74385784f29100

<<<<<<< HEAD
	 //Istvan
	 @BuilderMethod
	 public void yeahEdges() {
		var node = get(MyNodeLabels.yeah.toString());
=======
	//Orel
	@BuilderMethod
	public void consequencesEdges() {
		var node = get(MyNodeLabels.consequences.toString());
		var choice = new PlayerInteraction(MyChoiceLabels.ContTwo.toString(), galaxyGas, Icons.drink, "Continue");
		var nextNode = get(MyNodeLabels.override.toString());
		node.add(new Edge(choice, nextNode));
	}
>>>>>>> 22edca2b85f064a7d8cf653f1f74385784f29100

<<<<<<< HEAD
		var choice1 = new CloseNarrationChoice("Some time goes by and some rancide smell provades the space, you investigate and see ManMan looking at the microwave with malicious intent. the stack of honeybuns didnt decrease insize yet, after all this time theres still honeybuns in the microwave.");
		var nextNode1 = get(MyNodeLabels.nothing.toString());
=======
	//Istvan
	@BuilderMethod
	public void overrideEdges() {
		var node = get(MyNodeLabels.override.toString());
		var choice = new CloseNarrationChoice();
		var nextNode = get(MyNodeLabels.mess.toString());
		node.add(new Edge(choice, nextNode));
	}

	//Justin
	@BuilderMethod
	public void messEdges() {
		var node = get(MyNodeLabels.mess.toString());
		var choice1 = new PlayerInteraction(MyChoiceLabels.DrunkMan.toString(), gilbert, Icons.research, "Investigating drunk man.");
		var nextNode1 = get(MyNodeLabels.leave.toString());
>>>>>>> 22edca2b85f064a7d8cf653f1f74385784f29100
		node.add(new Edge(choice1, nextNode1));

<<<<<<< HEAD
		//you go along with manman's idea
		var choice2 = new DialogChoice("They been in there an awfully long time");
		var nextNode2 = get(MyNodeLabels.nothing.toString());
=======
		var choice2 = new CloseNarrationChoice();
		var nextNode2 = get(MyNodeLabels.find.toString());
>>>>>>> 22edca2b85f064a7d8cf653f1f74385784f29100
		node.add(new Edge(choice2, nextNode2));
<<<<<<< HEAD
=======
	}

	//Istvan
	@BuilderMethod
	public void yeahEdges() {
		var node = get(MyNodeLabels.yeah.toString());
		var choice = new PlayerInteraction(MyChoiceLabels.LongTime.toString(), manMan, Icons.talk, "They been in there an awfully long time.");
		var nextNode = get(MyNodeLabels.nothing.toString());
		node.add(new Edge(choice, nextNode));
>>>>>>> 22edca2b85f064a7d8cf653f1f74385784f29100
	 }


	 //Istvan
	 @BuilderMethod
	 public void nothingEdges() {
		var node = get(MyNodeLabels.nothing.toString());
<<<<<<< HEAD
		var choice1 = new CloseNarrationChoice("you look at manman then back at the microwave, the honey buns are glowing white hot, and you feel the heat imminating from them.");
		var nextNode1 = get(MyNodeLabels.eat.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new PlayerInteraction(ChoiceLabels.longTime.toString(), manMan, icons.talk, "i just want them to have a warm snack.");
		var nextNode2 = get(MyNodeLabels.eat.toString());
		node.add(new Edge(choice2, nextNode2));
	 }
	 }
=======
		var choice = new PlayerInteraction(MyChoiceLabels.EatThese.toString(), manMan, Icons.talk, "Yeah, I don't think ANYONE is going to be able to eat these.");
		var nextNode = get(MyNodeLabels.eat.toString());
		node.add(new Edge(choice, nextNode));
	}
>>>>>>> 22edca2b85f064a7d8cf653f1f74385784f29100

	 //Istvan
	 @BuilderMethod
	 public void eatEdges()  {
		var node = get(MyNodeLabels.eat.toString());
<<<<<<< HEAD


		//your not sure if its edible
		var choice = new DialogChoice("yeah, i don't think ANYONE is going to be able to eat these"),  new PlayerInteraction(ChoiceLabels.eat.toString(), manMan, icons.talk "Who said anything about eating them?");

=======
		var choice = new PlayerInteraction(MyChoiceLabels.YouDid.toString(), manMan, Icons.talk, "YOU DID, you know what, you're over with.");
>>>>>>> 22edca2b85f064a7d8cf653f1f74385784f29100
		var nextNode = get(MyNodeLabels.override.toString());
		node.add(new Edge(choice, nextNode));
	}

<<<<<<< HEAD
	 //Istvan
	 @BuilderMethods
	public void overrideEdges() {
		var node = get(MyNodeLabels.override.toString());
=======
	//Justin
	@BuilderMethod
	public void leaveEdges() {
		var node = get(MyNodeLabels.leave.toString());
		var choice = new CloseNarrationChoice();
		var nextNode = get(MyNodeLabels.altercation.toString());
		node.add(new Edge(choice, nextNode));
	}
>>>>>>> 22edca2b85f064a7d8cf653f1f74385784f29100

<<<<<<< HEAD
		var choice1 = new CloseNarrationChoice("You realized that inhaling such copius amounts of galaxy gas has made your brain smooth, and once all of the pent up rot left you brain you realized just how stupid everyones idea was.");
		var nextNode1 = get(MyNodeLabels.mess.toString());
		
		var choice2 = new CloseNarrationChoice("With no backup plan you and the group decide to live in the alley for the rest of your lives as bums".);
		var nextNode2 = get(MyNodeLabels.mess.toString());
=======
	//Justin
	@BuilderMethod
	public void findEdges() {
		var node = get(MyNodeLabels.find.toString());
		var choice = new CloseNarrationChoice();
		var nextNode = get(MyNodeLabels.altercation.toString());
		node.add(new Edge(choice, nextNode));
	}
>>>>>>> 22edca2b85f064a7d8cf653f1f74385784f29100

	//Justin
	@BuilderMethod
	public void altercationEdges() {
		var node = get(MyNodeLabels.altercation.toString());
		var choice1 = new DialogChoice("Let's hear him out,");
		var nextNode1 = get(MyNodeLabels.hear.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new DialogChoice("We gotta fight back.");
		var nextNode2 = get(MyNodeLabels.jump.toString());
		node.add(new Edge(choice2, nextNode2));
	}

	//Orel
	@BuilderMethod
	public void hearEdges() {
		var node = get(MyNodeLabels.hear.toString());
		var choice1 = new CloseNarrationChoice();
		var nextNode1 = get(MyNodeLabels.realization.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new CloseNarrationChoice();
		var nextNode2 = get(MyNodeLabels.jump.toString());
		node.add(new Edge(choice2, nextNode2));
	}

	 //Orel
	@BuilderMethod
	public void jumpEdges() {
		var node = get(MyNodeLabels.jump.toString());

		var choice = new PlayerInteraction(MyChoiceLabels.Realize.toString(), gilbert, Icons.fist, "You notice something unmistakable.");
		var nextNode = get(MyNodeLabels.realization.toString());
		node.add(new Edge(choice, nextNode));
	}
	
	//Orel 
<<<<<<< HEAD
	 @BuilderMethod
	 public void cleanEdges()  {
		var node = get(MyNodeLabels.clean.toString());
=======
	@BuilderMethod
	public void realizationEdges() {
		var node = get(MyNodeLabels.realization.toString());
>>>>>>> 22edca2b85f064a7d8cf653f1f74385784f29100

		var choice = new CloseNarrationChoice();
		var nextNode = get(MyNodeLabels.clean.toString());
		node.add(new Edge(choice, nextNode));
	}

	//Istvan
	@BuilderMethod
	public void cleanEdges() {
		var node = get(MyNodeLabels.clean.toString());
		var choice1 =  new DialogChoice("How did this happen to you?");
		var nextNode1 = get(MyNodeLabels.background.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new DialogChoice("How do we know this is really you?");
		var nextNode2 = get(MyNodeLabels.background.toString());
		node.add(new Edge(choice2, nextNode2));
	}

	 //Istvan
	@BuilderMethod
	public void backgroundEdges() {
		var node = get(MyNodeLabels.background.toString());
		var choice1 = new DialogChoice("What next?");
		var nextNode1 = get(MyNodeLabels.morebackground.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new DialogChoice("Did you win?");
		var nextNode2 = get(MyNodeLabels.morebackground.toString());
		node.add(new Edge(choice2, nextNode2));
	}

	 //Istvan
	@BuilderMethod
	public void morebackgroundEdges() {
		var node = get(MyNodeLabels.morebackground.toString());
		var choice1 = new DialogChoice("When?");
		var nextNode1 = get(MyNodeLabels.when.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new DialogChoice("What you want us to do about that?");
		var nextNode2 = get(MyNodeLabels.bad.toString());
		node.add(new Edge(choice2, nextNode2));

		var choice3 = new DialogChoice("Oh nah, he violated you.");
		var nextNode3 = get(MyNodeLabels.neutral.toString());
		node.add(new Edge(choice3, nextNode3));

		var choice4 = new DialogChoice("Damn, that's crazy.");
		var nextNode4 = get(MyNodeLabels.bad.toString());
		node.add(new Edge(choice4, nextNode4));

		var choice5 = new DialogChoice("Say no more.");
		var nextNode5 = get(MyNodeLabels.good.toString());
		node.add(new Edge(choice5, nextNode5));
	}

	 //Justin
	@BuilderMethod
	public void whenEdges() {
		var node = get(MyNodeLabels.when.toString());
		var choice = new DialogChoice("When do I remember asking?");
		var nextNode = get(MyNodeLabels.bad.toString());
		node.add(new Edge(choice, nextNode));
	}
}



