gwt-jquery-lib
==============

JQuery Library for GWT projects

# Installation

Install the package For use as a dependency in other projects locally:

> mvn clean install

Or deploy it to your company repository:
 
> mvn clean deploy

# Usage

Add the dependency to your Maven POM:

```xml
<dependency>
	<groupId>com.bytebybyte.gwt</groupId>
	<artifactId>jquery-lib</artifactId>
	<version>2.1.1-SNAPSHOT</version>
	<scope>provided</scope>
</dependency>
```

And to your .gwt.xml file:

```xml
<module>
	...
	<inherits name="com.bytebybyte.gwt.jquery.JQueryLib" />
	...
</module>
```
