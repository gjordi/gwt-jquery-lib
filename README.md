gwt-jquery-lib
==============

[JQuery](jquery.com) Library for GWT projects.

# Usage

Add the dependency to your Maven POM:

```xml
<dependency>
	<groupId>com.bytebybyte.gwt</groupId>
	<artifactId>jquery-lib</artifactId>
	<version>2.1.1</version>
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
