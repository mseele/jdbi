/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jdbi.v3.commonstext;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jdbi.v3.commonstext.internal.UseStringSubstitutorTemplateEngineImpl;
import org.jdbi.v3.sqlobject.config.ConfiguringAnnotation;

@Retention(RetentionPolicy.RUNTIME)
@ConfiguringAnnotation(UseStringSubstitutorTemplateEngineImpl.class)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface UseStringSubstitutorTemplateEngine {
    String prefix() default StringSubstitutorTemplateEngine.DEFAULT_PREFIX;
    String suffix() default StringSubstitutorTemplateEngine.DEFAULT_SUFFIX;
    char escape() default StringSubstitutorTemplateEngine.DEFAULT_ESCAPE;
}
