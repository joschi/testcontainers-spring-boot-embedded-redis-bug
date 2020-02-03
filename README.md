# com.playtika.testcontainers:embedded-redis:1.37 and later fail to start

Run with `com.playtika.testcontainers:embedded-redis:1.38` (failing):

```
./mvnw test -Dplaytika.testcontainers.version=1.38
```

Run with `com.playtika.testcontainers:embedded-redis:1.36` (working):

```
./mvnw test -Dplaytika.testcontainers.version=1.36
```
