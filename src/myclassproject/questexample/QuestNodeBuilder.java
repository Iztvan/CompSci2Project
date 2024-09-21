package myclassproject.questexample;

import static myclassproject.questexample.QuestStoryEntities.*;

import java.util.List;
import com.actions.*;
import com.sequences.*;
import com.storygraph.*;

public class QuestNodeBuilder extends NodeBuilder {
	public QuestNodeBuilder(List<Node> list) {
		super(list);
	}

	@BuilderMethod
	public void rootActions() {
		var root = get(NodeLabels.root.toString());
		root.add(new CreateAll(List.of(cottage, town, sword))).add(new CreateCharacterSequence(bandit))
				.add(new CreateCharacterSequence(player)).add(new SetPosition(bandit, cottage, "Chest"))
				.add(new SetPosition(player, cottage)).add(new Face(bandit, player)).add(new Draw(bandit, sword))
				.add(new SetCameraFocus(player)).add(new ShowMenu());
	}

	@BuilderMethod
	public void atCottageActions() {
		var node = get(NodeLabels.atCottage.toString());
		node.add(new HideMenu()).add(new EnableInput());
	}

	@BuilderMethod
	public void banditTalkActions() {
		var node = get(NodeLabels.banditTalk.toString());
		node.add(new DialogSequence(player, bandit, List.of("Will you accept the quest?"),
				List.of("I will!", "I refuse!")));
	}

	@BuilderMethod
	public void acceptActions() {
		var node = get(NodeLabels.accept.toString());
		node.add(new HideDialog()).add(new Take(player, sword, bandit))
		.add(new Pocket(player, sword));
	}

	@BuilderMethod
	public void refuseActions() {
		var node = get(NodeLabels.refuse.toString());
		node.add(new HideDialog()).add(new NarrationSequence("And you lived happily ever after!"));
	}

	@BuilderMethod
	public void resetActions() {
		var node = get(NodeLabels.reset.toString());
		node.add(new HideNarration()).add(new FadeOut()).add(new SetPosition(player, cottage))
				.add(new Draw(bandit, sword)).add(new ShowMenu()).add(new FadeIn());
	}

	@BuilderMethod
	public void inventoryActions() {
		var node = get(NodeLabels.inventory.toString());
		node.add(new ListSequence(player, List.of(sword)));
	}

	@BuilderMethod
	public void accept2Actions() {
		var node = get(NodeLabels.accept2.toString());
		node.add(new HideList());
	}

	@BuilderMethod
	public void atCityActions() {
		var node = get(NodeLabels.atCity.toString());
		node.add(new DisableInput()).add(new Exit(player, cottageDoor, true)).add(new Enter(player, cityDoor, true))
				.add(new EnableInput());
	}

	@BuilderMethod
	public void atCity2Actions() {
		var node = get(NodeLabels.atCity2.toString());
		node.add(new DisableInput()).add(new Exit(player, cityExit, true)).add(new Enter(player, cityExit, true))
				.add(new EnableInput());
	}
}
