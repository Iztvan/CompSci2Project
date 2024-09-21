package myclassproject.mystorygraph;

import static myclassproject.mystorygraph.MyStoryEntities.*;

import java.util.List;
import com.storygraph.*;
import com.storygraph.DialogSequence; // Add missing import statement

public class MyNodeBuilder extends NodeBuilder {
	public MyNodeBuilder(List<Node> list) {
		super(list);
	}

	/**
	 * Write a method for each node. 
	 * Use get to get a reference to the node using its label.
	 * The method adds Camelot actions that execute in order when visiting that node. 
	 * These methods must have a BuilderMethod annotation.
	 */
	@BuilderMethod
	public void rootActions() {
		var root = get(NodeLabels.root.toString());
		root.add(new CreateAll(List.of(alley, circleChain, ale, honeyBun, village))).add(new CreateCharacterSequence(player))
				.add(new CreateCharacterSequence(manMan)).add(new CreateCharacterSequence(babyGronk)).add(new CreateCharacterSequence(womp))
				.add(new CreateCharacterSequence(johnJohn)).add(new CreateCharacterSequence(gilbert))
				.add(new SetPosition(player, village, "Center")).add(new SetPosition(babyGronk, village)).add(new SetPosition(manMan, village))
				.add(new SetPosition(johnJohn, village)).add(new SetPosition(womp, village)).add(new SetPosition(gilbert, alley))
				.add(new Face(player, womp)).add(new SetCameraFocus(player)).add(new ShowMenu());
	}
		
	@BuilderMethod
	public void atVillageActions() {
		var node = get(NodeLabels.atVillage.toString());
		node.add(new HideMenu()).add(new EnableInput())
		.add(new NarrationSequence("Once upon a time, there was a group of wizards that would go on to fight the shadow government, ruled by King Crash Out XI. This group of wizards would become the Shadow Money Wizard Gang, but for now they are chilling in an alley, a village they have just stumbled upon. You are Quandale, the group leader of the gang. Right now, you are consulting your group as to what the next move is"))
		.add(new DialogSequence(player, womp, List.of("Baby Gronk, Womp any ideas?"))).add(new Face(player, johnJohn)).add(new DialogSequence(player, johnJohn, List.of("ManMan, JohnJohn, suggestions?")));
}

	@BuilderMethod
	public void ideasActions() {
		var node = get(NodeLabels.ideas.toString());
		node.add(new NarrationSequence("You are very desperate for bread so you turn to Baby Gronk who has an idea.")).add(new Face(player, babyGronk))
		.add(new DialogSequence(babyGronk, player, List.of("We should go scam some old people who don't know anything about the internet."), List.of("Let's do it.", "Room temperature IQ, I swear.")));
		
	}
	// the narrator speaks again
	@BuilderMethod
	public void suggestionsActions() {
		var node = get(NodeLabels.suggestions.toString());
		node.add(new NarrationSequence("No gang is successful if they have no motion. You, as the group leader, make every single decision for the gang and they reply to your every command. You are starving for clout so you consider faking like you actually care about your community and record a video of you guys helping people out or take out your bordem on some innocent person trying to meet ends met You decide to let the group have a say in a decision, for once."))
		.add(new DialogSequence(player, manMan, List.of("We should put this pent up energy towards something positive like feeding the homeless."), List.of("What a lovely idea ManMan.", "What about you JohnJohn?")))
		.add(new DialogSequence(player, johnJohn, List.of("We just target bully someone trying to work their food service shift."), List.of("I like the way you think JohnJohn.", "There's nothing going on in those heads of yours.")));
	}

	@BuilderMethod
	public void feedActions() {
		var node = get(NodeLabels.feed.toString());
		node.add(new NarrationSequence("ManMan takes you and your group to the convenience store and buy as many honey buns as possible, he grabs a few honey buns and puts them into a microwave for some unspecified amount of time"))
		.add(new DialogSequence(player, manMan, List.of("ManMan, this is really nice of you.", "Oh brother, I already know where this is going.")));
	}

	@BuilderMethod
	public void yeahActions() {
		var node = get(NodeLabels.yeah.toString());
		node.add(new NarrationSequence("Some time goes by and some rancide smell provades the space, you investigate and see ManMan looking at the microwave with malicious intent. the stack of honeybuns didnt decrease insize yet, after all this time theres still honeybuns in the microwave."))
		.add(new DialogSequence(player, manMan, List.of("They been in there an awfully long time")));
	}

	@BuilderMethod
	public void nothingActions() {
		var node = get(NodeLabels.nothing.toString());
		node.add(new NarrationSequence("i just want them to have a warm snack.  you look at manman then back at the microwave, the honey buns are glowing white hot, and you feel the heat imminating from them."))
		.add(new DialogSequence(player, manMan, List.of("yeah, i don't think ANYONE is going to be able to eat these")));
	}
	
	@BuilderMethod
	public void eatActions() {
		var node = get(NodeLabels.eat.toString());
		node.add(new DialogSequence(player, manMan, List.of("who said anything about eating")))
		.add(new Draw(player, galaxyGas))
		.add(new NarrationSequence("you take a hit of your galaxy gas"));
	}

	@BuilderMethod
	public void bullyActions() {
		var node = get(NodeLabels.bully.toString());
		node.add(new NarrationSequence("JohnJohn takes you and your group to a waffle house (bad idea) and start trying to cause commotion")).add(new DialogSequence(player, johnJohn, List.of("Rev up those fryers!")));
	}

	@BuilderMethod
	public void consequencesActions() {
		var node = get(NodeLabels.consequences.toString());
		node.add(new NarrationSequence("The cashier at the waffle house is not having it and they immediately jump you, Baby Gronk, ManMan, and even womp who was dragged inside, they put a mask on you and your gang and yell at someone to bring out the galaxy gas."));
	}
	
	


