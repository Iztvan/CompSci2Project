package myclassproject.testgraph;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.storygraph.Graph;
import com.storygraph.NodeBuilder;
import myclassproject.questexample.MyNodeLabels;

public class IzzyTestGraph extends Graph {
    public IzzyTestGraph() {
        super(Stream.of(
            new NodeBuilder().withLabel(NodeLabels.START).build(),
            new NodeBuilder().withLabel(NodeLabels.MIDDLE).build(),
            new NodeBuilder().withLabel(NodeLabels.END).build()
        ).collect(Collectors.toList()));
    }

    @Override
    public NodeBuilder getNodeBuilder() {
        return new IzzyTestNodeBuilder(nodes);
}

    @override
    public NodeBuilder getEdgeBuilder() {
        return new IzzyTestEdgeBuilder(nodes);
    }
}
