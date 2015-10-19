# maven-help
maven help
mvn dependency:tree -Dverbose -Dincludes=commons-collections
[INFO] [dependency:tree]
[INFO] org.apache.maven.plugins:maven-dependency-plugin:maven-plugin:2.0-alpha-5-SNAPSHOT
[INFO] +- org.apache.maven.reporting:maven-reporting-impl:jar:2.0.4:compile
[INFO] |  \- commons-validator:commons-validator:jar:1.2.0:compile
[INFO] |     \- commons-digester:commons-digester:jar:1.6:compile
[INFO] |        \- (commons-collections:commons-collections:jar:2.1:compile - omitted for conflict with 2.0)
[INFO] \- org.apache.maven.doxia:doxia-site-renderer:jar:1.0-alpha-8:compile
[INFO]    \- org.codehaus.plexus:plexus-velocity:jar:1.1.3:compile
[INFO]       \- commons-collections:commons-collections:jar:2.0:compile
