/*
 * Copyright 2004-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Gant script that handles general initialization of a Griffon applications
 *
 * @deprecated Use "create-app --inplace" or "upgrade".
 * @author Graeme Rocher (Grails 0.4)
 * @author Peter Ledbrook (Grails 0.4)
 */

includeTargets << griffonScript("_GriffonInit")

target('default': "legacy init target") {
    init()
}
