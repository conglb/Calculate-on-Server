# Calculate-on-Server
Server-client Architecture with Java Socket


Client send two integer to server.

Server respond LCM, GCD of them.



```

javac -d ./out/production/client ./server/src/Main.java
javac -d ./out/production/server ./client/src/Main.java
# Terminal 1
java -classpath ./out/production/client Main
# Terminal 2
java -classpath ./out/production/server Main
```