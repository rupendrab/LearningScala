# LearningScala

## Install sbt (in ~/Documents/sbt)

Create the below directories

cd ~/Documents/scalacode
cd test/src/sandbox 

create build.sbt

cat build.sbt

sbt
commands to try:
compile
test
run
console
exit

To exit from console (scaca-repl)
:q or sys.exit or control-d

## Install Eclipse

Eclipse IDE for Java Developers
Run First Time, exit and then edit eclipse.ini file to increase

-XX:MaxPermSize=512m
-Xmx2048m

## Get scala

http://scala-ide.org

Download -> Stable
Copy the appropriate link: http://download.scala-ide.org/sdk/lithium/e44/scala211/stable/site
Go to eclipse
Help -> Install New Software
Add the new link, call it scala-ide
Select "Scale IDE for Eclipse" and click "Next"
Go through the Install Process
Restart eclipse when prompted
Set workspace to: ~/Documents/scalacode/test/src/sandbox

Find the github repo for sbteclipse

https://github.com/typesafehub/sbteclipse

cd ~/.sbt/0.13/
mkdir plugins
cd plugins/
vi plugins.sbt
cat plugins.sbt 
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")

cd ~/Documents/scalacode/test/src/sandbox
sbt
-sbt-create
[info] Loading global plugins from /Users/bandyr/.sbt/0.13/plugins
[info] Updating {file:/Users/bandyr/.sbt/0.13/plugins/}global-plugins...
[info] Resolving org.fusesource.jansi#jansi;1.4 ...
[info] downloading https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/com.typesafe.sbteclipse/sbteclipse-plugin/scala_2.10/sbt_0.13/4.0.0/jars/sbteclipse-plugin.jar ...
[info] 	SUCCESSFUL  com.typesafe.sbteclipse#sbteclipse-plugin;4.0.0!sbteclipse-plugin.jar (2494ms)
[info] downloading https://repo1.maven.org/maven2/org/scalaz/scalaz-core_2.10/7.1.0/scalaz-core_2.10-7.1.0.jar ...
[info] SUCCESSFUL  org.scalaz#scalaz-core_2.10;7.1.0!scalaz-core_2.10.jar(bundle) (1040ms)
[info] downloading https://repo1.maven.org/maven2/org/scalaz/scalaz-effect_2.10/7.1.0/scalaz-effect_2.10-7.1.0.jar ...
[info] SUCCESSFUL org.scalaz#scalaz-effect_2.10;7.1.0!scalaz-effect_2.10.jar(bundle) (364ms)
[info] Done updating.
[info] Set current project to sandbox (in build file:/Users/bandyr/Documents/scalacode/test/src/sandbox/)
> compile
[success] Total time: 0 s, completed Oct 3, 2015 1:41:05 PM
> eclipse
[info] About to create Eclipse project files for your project(s).
[info] Successfully created Eclipse project files for project(s):
[info] sandbox
> exit

Now go to eclipse and import existing project from directory: ~/Documents/scalacode/test/src/sandbox

