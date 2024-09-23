package myclassproject.mystorygraph;

import static myclassproject.mystorygraph.MyStoryEntities.*;

import java.util.List;
import com.storygraph.*;
import com.storygraph.DialogSequence;
import myclassproject.questexample.NodeLabels;
import myclassproject.mystorygraph.DialogSequence; 

public class MyNodeBuilder extends NodeBuilder {
	public MyNodeBuilder(List<Node> list) {
		super(list);
	}

	
	 // Orel 
	@BuilderMethod
	public void rootActions() {
		var root = get(NodeLabels.root.toString());
		root.add(new CreateAll(List.of(alley, circleChain, ale, honeyBun, village))).add(new CreateCharacterSequence(player))
				.add(new CreateCharacterSequence(manMan)).add(new CreateCharacterSequence(babyGronk)).add(new CreateCharacterSequence(womp))
				.add(new CreateCharacterSequence(johnJohn)).add(new CreateCharacterSequence(gilbert)).add(new CreateCharacterSequence(cashier))
				.add(new SetPosition(player, village, "Center")).add(new SetPosition(babyGronk, village)).add(new SetPosition(manMan, village))
				.add(new SetPosition(johnJohn, village)).add(new SetPosition(womp, village)).add(new SetPosition(gilbert, alley)).add(new SetPosition(cashier, waffleHouse))
				.add(new Face(player, womp)).add(new SetCameraFocus(player)).add(new ShowMenu());
	}
		//Izzy
	@BuilderMethod
	public void atVillageActions() {
		var node = get(NodeLabels.atVillage.toString());
		node.add(new HideMenu()).add(new EnableInput())
		.add(new NarrationSequence("Once upon a time, there was a group of wizards that would go on to fight the shadow government, ruled by King Crash Out XI. This group of wizards would become the Shadow Money Wizard Gang, but for now they are chilling in an alley, a village they have just stumbled upon. You are Quandale, the group leader of the gang. Right now, you are consulting your group as to what the next move is"))
		.add(new DialogSequence(player, womp, List.of("Baby Gronk, Womp any ideas?"))).add(new Face(player, johnJohn)).add(new DialogSequence(player, johnJohn, List.of("ManMan, JohnJohn, suggestions?")));
}
	//Justin
	@BuilderMethod
	public void ideasActions() {
		var node = get(NodeLabels.ideas.toString());
		node.add(new NarrationSequence("You are very desperate for bread so you turn to Baby Gronk who has an idea.")).add(new Face(player, babyGronk))
		.add(new DialogSequence(babyGronk, player, List.of("We should go scam some old people who don't know anything about the internet."), List.of("Let's do it.", "Room temperature IQ, I swear.")));
		
	}
	//Izzy
	@BuilderMethod
	public void suggestionsActions() {
		var node = get(NodeLabels.suggestions.toString());
		node.add(new NarrationSequence("No gang is successful if they have no motion. You, as the group leader, make every single decision for the gang and they reply to your every command. You are starving for clout so you consider faking like you actually care about your community and record a video of you guys helping people out or take out your bordem on some innocent person trying to meet ends met You decide to let the group have a say in a decision, for once."))
		.add(new DialogSequence(manMan, player, List.of("We should put this pent up energy towards something positive like feeding the homeless."), List.of("What a lovely idea ManMan.", "What about you JohnJohn?")))
		.add(new DialogSequence(player, johnJohn, List.of("We just target bully someone trying to work their food service shift."), List.of("I like the way you think JohnJohn.", "There's nothing going on in those heads of yours.")));
	}
	//Izzy
	@BuilderMethod
	public void feedActions() {
		var node = get(NodeLabels.feed.toString());
		node.add(new NarrationSequence("ManMan takes you and your group to the convenience store and buy as many honey buns as possible, he grabs a few honey buns and puts them into a microwave for some unspecified amount of time"))
		.add(new DialogSequence(player, manMan, List.of("ManMan, this is really nice of you.", "Oh brother, I already know where this is going.")));
	}
	//Orel
	@BuilderMethod
	public void yeahActions() {
		var node = get(NodeLabels.yeah.toString());
		node.add(new NarrationSequence("Some time goes by and some rancide smell provades the space, you investigate and see ManMan looking at the microwave with malicious intent. the stack of honeybuns didnt decrease insize yet, after all this time theres still honeybuns in the microwave."))
		.add(new DialogSequence(player, manMan, List.of("They been in there an awfully long time")));
	}
	//Izzy
	@BuilderMethod
	public void nothingActions() {
		var node = get(NodeLabels.nothing.toString());
		node.add(new NarrationSequence("i just want them to have a warm snack.  you look at manman then back at the microwave, the honey buns are glowing white hot, and you feel the heat imminating from them."))
		.add(new DialogSequence(player, manMan, List.of("yeah, i don't think ANYONE is going to be able to eat these")));
	}
	//Izzy
	@BuilderMethod
	public void eatActions() {
		var node = get(NodeLabels.eat.toString());
		node.add(new DialogSequence(player, manMan, List.of("Who said anything about eating")))
		.add(new Draw(player, galaxyGas))
		.add(new NarrationSequence("You take a hit of your galaxy gas"));
	}
	//Orel
	@BuilderMethod
	public void bullyActions() {
		var node = get(NodeLabels.bully.toString());
		node.add(new NarrationSequence("JohnJohn takes you and your group to a waffle house (bad idea) and start trying to cause commotion")).add(new DialogSequence(player, johnJohn, List.of("Rev up those fryers!")));
	}
	//Justin
	@BuilderMethod
	public void consequencesActions() {
		var node = get(NodeLabels.consequences.toString());
		node.add(new NarrationSequence("The cashier at the waffle house is not having it and they immediately jump you, Baby Gronk, ManMan, and even womp who was dragged inside, they put a mask on you and your gang and yell at someone to bring out the galaxy gas."));
	}

	//Izzy
	@BuilderMethod
	public void overrideActions() {
		var node = get(NodeLabels.override.toString());
		node.add(new NarrationSequence("You realized that inhaling such copius amounts of galaxy gas has made your brain smooth, and once all of the pent up rot left you brain you realized just how stupid everyones idea was.")).add(new NarrationSequence("With no backup plan you and the group decide to live in the alley for the rest of your lives as bums.")).add(new NarrationSequence("While chilling in the alley on a random night, you suddenly hear footsteps charging towards your group hangout.")).add(new setPosition(Gilbert, alley)).add(new setPosition(player, alley)).add(new setPosition(johnJohn, alley)).add(new setPosition(manMan, alley)).add(new setPosition(babyGronk, alley)).add(new setPosition(womp, alley)).add(new NarrationSequence("You realize a random drunk is furiously charging towards you. He tries to break the bottle of ale he's carrying on his head, but fails as the bottle is too hard. He then knocks himself out."));
	}
	//Justin
	@BuilderMethod
	public void messActions() {
		var node = get(NodeLabels.mess.toString());
		node.add(new NarrationSequence("The group, startled at first, now looks purplexed."), List.of("Investigate the drunk man", "Ignore"));
	}
	//Justin
	@BuilderMethod
	public void findActions() {
		var node = get(NodeLabels.find.toString());
		node.add(new NarrationSequence("The group sends you over to investigate, but out of no where, the drunken man gets up and swings his bottle of ale at your shins."));
	}
	//Justin
	@BuilderMethod
	public void leaveActions() {
		var node = get(NodeLabels.leave.toString());
		node.add(new NarrationSequence("The group goes back to minding their own business, soon after, hearing a bottle crack, the druken man appears enraged, and makes a druken dash towards you and your group."));
	}
	//Izzy
	@BuilderMethod
	public void altercationActions() {
		var node = get(NodeLabels.altercation.toString());
		node.add(new NarrationSequence("You and your group immediately pounce on him surrounding him, each of you taking your stances getting ready to jump him, but mid way through your first attack you think you hear something, a plea for help."))
		.add(new setPosition(player, alley)).add(new setPosition(johnJohn, alley)).add(new setPosition(manMan, alley)).add(new setPosition(babyGronk, alley)).add(new setPosition(womp, alley)).add(new setPosition(gilbert, alley));
	}
	//Orel
	@BuilderMethod
	public void hearActions() {
		var node = get(NodeLabels.hear.toString());
		node.add(new NarrationSequence("You hold off of your attack and the rest of your group follows the drunken man gets up"));
	}
	//Orel
	@BuilderMethod
	public void jumpActions() {
		var node = get(NodeLabels.jump.toString());
		node.add(new NarrationSequence("After dealing with the drunk man with maximum efficiency, one of the members in your party is getting ready to make him bite the curb but you notice something unmistakable..."));
	}
	//Orel
	@BuilderMethod
	public void realizationActions() {
		var node = get(NodeLabels.realization.toString());
		node.add(new NarrationSequence("You realized its the circle chain that belonged to a former member of the shadow money wizard gang"));
	}
	//Justin
	@BuilderMethod
	public void cleanActions() {
		var node = get(NodeLabels.clean.toString());
		node.add(new NarrationSequence("After realizing who this random drunk man might be, you clean him up, he then starts explaining himself, he says he needs help to get is get back on the king of this country because he ruined his life"))
		.add(new DialogSequence(player, gilbert, List.of("How?", "We don't even know if it's truly you.")));
	}
	//Izzy
	@BuilderMethod
	public void backgroundActions() {
		var node = get(NodeLabels.background.toString());
		node.add(new DialogSequence(gilbert, player, List.of("I'm Gilbert, I was attending a party and it turned out to be a surprise 20 v 1. After everyone popped their balloons, King Crash Out XI vanquished everyone present to the gnawing abyss. In an attempt to win back my pride, he challenged me to go dabloon for dabloon with him."))).add(new DialogSequence(player, gilbert, List.of("What happened next?", "Did you win?")));
	}
		
	//Orel
	@BuilderMethod
	public void morebackgroundActions() {
		var node = get(NodeLabels.moreBackground.toString());
		node.add(new DialogSequence(gilbert, player, List.of("I cleared King Crash Out XI but I made a fatal mistake of boasting about my win. Not only did the King drain my bank account, he also siphoned away all of my aura.")))
			.add(new DialogSequence(player, gilbert, List.of("When?", "What you want us to do about that?", "Oh, nah muddy he violated you.", "Damn, that's crazy.", "Say no more.")));
	}	
	//Izzy
	@BuilderMethod
	public void whenActions() {
		var node = get(NodeLabels.when.toString());
		node.add(new DialogSequence(player, gilbert, List.of("Wait when?"))) 
			.add(new DialogSequence(gilbert, player, List.of("Last night."))) 
			.add(new DialogSequence(player, gilbert, List.of("No, when did I ask?"))) 
			.add(new DialogSequence(gilbert, player, List.of("Real")));
	}
	//Justin
	@BuilderMethod
	public void badActions() {
		var node = get(NodeLabels.bad.toString());
		node.add(new NarrationSequence("You are forced to live the rest of your life with negative aura"));
	}
	
	//Justin
	@BuilderMethod
	public void neutralActions() {
		var node = get(NodeLabels.neutral.toString());
		node.add(new NarrationSequence("Gilbert agrees with you and looks down at his foams in shame."));
	}
	//Justin
	@BuilderMethod
	public void goodActions() {
		var node = get(NodeLabels.good.toString());
		node.add(new NarrationSequence("Gilbert thanks you for offering your help."));
	}
 