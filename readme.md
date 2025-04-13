# Example repository using sbt-scalafix

Run from a terminal console
```
git clone https://github.com/scalacenter/scalafix-sbt-example
cd scalafix-sbt-example
sbt "scalafix RemoveUnused"
git diff
```

At the end, you should see a diff like this

```diff
--- a/myproject/src/main/scala/a/A.scala
+++ b/myproject/src/main/scala/a/A.scala
@@ -1,4 +1,4 @@
-import scala.concurrent.Future
+
```




