BEGIN {
C = 0;
}

{
if ($1 == "d") {
C++;
printf("%s\t%s\n",$5,$11);
}
}

END {
printf("The number of packets dropped = %d\n", C);
}
