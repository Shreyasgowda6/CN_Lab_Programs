#Creating six nodes
set node1 [$ns node]
set node2 [$ns node]
set node3 [$ns node]
set node4 [$ns node]
set node5 [$ns node]
set node6 [$ns node]
#Creating links between the nodes
$ns duplex-link $node1 $node2 1Mb 15ms FQ
$ns duplex-link $node2 $node3 1Mb 15ms FQ
$ns duplex-link $node3 $node4 1Mb 15ms FQ
$ns duplex-link $node4 $node5 1Mb 15ms FQ
$ns duplex-link $node5 $node6 1Mb 15ms FQ
$ns duplex-link $node6 $node1 1Mb 15ms FQ
