Parallel Test execution
==========================

Gradle と Maven でのテスト並列実行例です。

SlowTest[1-4]がそれぞれ10秒くらいかかるので、全部実行すると1分ちょっと。クラス単位で同時に実行するので20秒きるくらいになります。


うごかしかた
-------------
*Javaは必須*

特になんてなくても `gradlew test` でおk

Gradleは `gradle test` で、Mavenでなきゃヤダって方は `mvn test` でどうぞ。それぞれ別途インストールした上で。