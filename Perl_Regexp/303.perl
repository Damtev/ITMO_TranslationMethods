$/ = undef;
$text = <>;
@all_links = ();
push(@all_links, $+{mb_link}) while $text =~ m{<a.*?href=["'](.*?://)?(?<mb_link>.*?)["'].*?>}g;

$set_links = ();
for $link (@all_links) {
	if ($link =~ m/^(\w+)([\w\d\.-]*).*$/) {
		$link =~ s/^(\w+)([\w\d\.-]*).*$/\1\2/;
		$set_links{ $link } = 1;
	}
}

for $link (sort keys %set_links) {
	print "$link\n";
}

