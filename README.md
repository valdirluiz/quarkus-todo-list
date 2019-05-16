# quarkus-todo-list

 
### Before building the docker image run:

```
mvn package -Pnative -Dnative-image.docker-build=true
```

### Then, build the image with:


``` 
docker build -f src/main/docker/Dockerfile.native -t quarkus/quarkus-todo-list .
```

### Then run the container using:

```
docker run -i --rm -p 8080:8080 quarkus/quarkus-todo-list
 ```
