# storybook-jsf project

The Storybook + JSF (Quarkus + MyFaces + PrimeFaces) example.

StorybookでJSF(PrimeFaces)のコンポーネントを確認するサンプルです。

## Setup

### Requirements
- JDK 11
- Node.js

### Command

```shell script
git clone git://github.com/maruTA-bis5/storybook-jsf.git
cd storybook-jsf.git
npm install
```

## Run in dev mode

In the first shell:
```shell script
./mvnw compile quarkus:dev
```

In the another shell:
```shell script
npm run storybook
```

You can access the storybook these urls:
- http://localhost:6006/
    - `npm run storybook`が提供するStorybook
    - :warning: Currently, you cannot load PrimeFaces' css and js.
- http://localhost:8080/storybook
    - `./mvnw compile quarkus:dev`を実行したときに生成されたstaticなStorybook

## License
MIT

-----

TODO rewrite below contents

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/storybook-jsf-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html.

