# Tapestry by examples
Some examples with Tapestry using Maven tool.

# Some examples

* https://github.com/hlship/tapestry5-tutorial
* https://baptiste-meurant.developpez.com/tutoriaux/tapestry5-spring-hibernate/ (old example)

# Deployments
## Embedded servers
### Jetty
Add the last version of the Jetty maven plugin
```xml
            <plugin>
    			<groupId>org.eclipse.jetty</groupId>
    			<artifactId>jetty-maven-plugin</artifactId>
    			<version>9.4.12.v20180830</version>
            <configuration>
                    <systemProperties>
                        <systemProperty>
                            <name>tapestry.execution-mode</name>
                            <value>development</value>
                        </systemProperty>
                    </systemProperties>
                </configuration>
            </plugin>
```

start the jetty server with the maven command :
```cmd
Jetty:run
```

### Tomcat



