# Codelerity CORE

Codelerity CORE provides a lightweight subset of [PraxisCORE][praxiscore], a
modular JVM runtime for cyberphysical programming, supporting real-time coding of
real-time systems. With a distributed forest-of-actors architecture, runtime code
changes and comprehensive introspection, Codelerity CORE brings aspects of Erlang,
Smalltalk and Extempore into the Java world.

Codelerity CORE and PraxisCORE are open-source projects originally developed
by Neil C Smith, and supported by [Codelerity Ltd][codelerity].

## Requirements and build

Codelerity CORE requires Java 21 or above.

The build uses Maven via the Maven Wrapper. To build, execute `mvnw package`. The
fully built runtime will be found at `codelerity-core-bin/target/codelerity-core` and
`codelerity-core-bin/target/codelerity-core-bin-VERSION-bin.zip`.

To run the test suite, execute
`./codelerity-core-bin/target/codelerity-core/bin/codelerity -f ./testsuite/`.

## License

Codelerity CORE is licensed under the terms of the GNU Lesser General Public License v3.

Some modules have different but compatible licenses.

[codelerity]: https://www.codelerity.com
[praxiscore]: https://www.praxislive.org/core/