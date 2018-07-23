# GA4GH SANDBOX

Sandbox for a [GA4GH](https://github.com/ga4gh/workflow-execution-service-schemas/) backend implementation.

Service model was generated using the following swagger definition:

https://raw.githubusercontent.com/ga4gh/workflow-execution-service-schemas/0f20538/swagger/proto/workflow_execution.swagger.json

To update the model:
1) Go to https://editor.swagger.io
2) Use the menu command "File > Import URL"
3) Then use the command "Generate Client > jaxrs-cfx-client"
4) Unzip the downloaded package and copy the model classes


## Get started

To run unit tests use

```
./gradlew test
```

To run the local server use:

```
make run
```

Default port is 8080. To change check the file `src/main/resources/application.groovy`


The fun part is at these files:

```
./src/main/groovy/ga4gh/WesController.groovy
./src/test/groovy/ga4gh/WesControllerTest.groovy
```


## Hot reloading

To automatically reload class, resources changes without having to stop, compile and relaunch
the application use the command `make hotreload`, after `make run`.

For details see [Micronaut eloading](https://docs.micronaut.io/latest/guide/index.html#reloading).
