while (<>) {
	s/\((.*?)\)/\(\)/g;
	print;
}