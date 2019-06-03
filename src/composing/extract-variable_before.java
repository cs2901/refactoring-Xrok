void renderBanner() {
    final boolean arg1 = platform.toUpperCase().indexOf("MAC") > -1;
    final boolean arg2 = browser.toUpperCase().indexOf("IE") > -1;
    final boolean arg3 = resize > 0;

  if ( arg1 && arg2 && wasInitialized() &&arg3 )
  {
    // do something
  }
}