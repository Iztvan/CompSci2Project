package myclassproject.testgraph;

import static myclassproject.questexample.QuestStoryEntities.*;

import java.util.List;
import com.actions.*;
import com.sequences.*;
import com.storygraph.*;

import myclassproject.questexample.NodeLabels;
import myclassproject.questexample.QuestNodeBuilder;

public class TestNodeBuilder extends QuestNodeBuilder {
	public TestNodeBuilder(List<Node> list) {
		super(list);
	}

	@Override
	@BuilderMethod
	public void rootActions() {
		var root = get(NodeLabels.root.toString());
		root.clearSequence();
		root.add(new CreateAll(List.of(cottage, town, sword))).add(new CreateCharacterSequence(bandit))
				.add(new CreateCharacterSequence(player)).add(new SetPosition(bandit, cottage, "Chest"))
				.add(new SetPosition(player, cottage)).add(new Face(bandit, player)).add(new Draw(bandit, sword))
				.add(new SetCameraFocus(player))
				.add(new SetPosition(player, town))
				.add(new ShowMenu())
				.add(new HideMenu())
				.add(new EnableInput());
	}

	
}
