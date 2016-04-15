# MapleSenia-Server
An emulator for a MapleStory game server, done in Java.

## Description
This is from the now-defunct MapleSenia Server Project, uploaded for archiving purposes **only**.  No new bug submissions, feature requests, patches, or pull requests will be accepted.

This emulator supports most features of the game up to version 117.2, though much functionality (such as Azwan, and Inner Abilities) remains uncoded.

All classes should be playable.  Maximum level is 250.

Note that no scripts are provided (event, NPC, item, portal, reactor, or otherwise); you will have to import them from a different repack or make your own.

## Configuration
In order to run the server, you will need to edit __worldGMS.properties__ and __channel.properties__ and fill in the values as appropriate.  Although not required, you would also most likely want to edit the server constants in __constants/GameConstants.java__.

## Libraries
This project requires the following libraries to build/run:
Apache MINA 2.0 (mina-core.jar)
Oracle JDBC Driver for MySQL 5.1.27 (mysql-connector-java-bin.jar)
PKGNX 2.0.4 (pkgnx-2.0.4-jar-with-dependencies.jar)
SLF4J 1.7.5 (slfj4-api.jar, slf4j-jdk14.jar)

## Copyright & Licensing
This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General Public License version 3 as published by the Free Software Foundation. You may not use, modify or distribute this program under any other version of the GNU Affero General Public License.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License (http://www.gnu.org/licenses/) for more details.