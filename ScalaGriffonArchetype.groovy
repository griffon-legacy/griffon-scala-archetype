/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class ScalaGriffonArchetype {
    // the archetype version
    String version = '1.0'
    // the version or versions of Griffon the archetype is designed for
    String griffonVersion = '0.9.5-rc2 > *'
    // the archetype license
    String license = 'Apache Software License 2.0'
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-scala-archetype'
    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Griffon Scala Archetype'
    String description = '''
Enables [Scala][1] based artifacts on a Griffon application.

Usage
----
Simply specify the name of the archetype (*scala*) when invoking the `create-app`
command, like this

    griffon create-app sample -archetype=scala

Configuration
-------------
There's no additional configuration required by this archetype.

[1]: http://scala-lang.org/
'''
}
