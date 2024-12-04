package myclassproject.testgraph;

import com.storygraph.Node;
import com.storygraph.NodeBuilder;
import myclassproject.mystorygraph.
import java.util.List;

public class IzzyTestNodeBuilder extends NodeBuilder {
    public IzzyTestNodeBuilder(List <Node> list ) {
        super(list);
    }

    @Override
    @BuilderMethod
   public void feedActions() {
    var node = createNode(MyNodeLabels.feedActions.toString());
   }