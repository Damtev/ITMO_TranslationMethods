$/ = undef;
$text = <>;
$text =~ s/^( *\n)*//;
$text =~ s/( *\n| *)*$//;
$text =~ s/(\s*\n){2,}/\n\n/g;
$text =~ s/^ *//mg;
$text =~ s/ *$//mg;
$text =~ s/( )\1+/\1/g;
print $text;
