while (<>) {
	s/\((.*?)\)/\(\)/g;
	print;
}
