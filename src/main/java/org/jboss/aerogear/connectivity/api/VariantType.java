/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.aerogear.connectivity.api;

/**
 * A type-safe identifier for the allowed variant types.
 */
public enum VariantType {
    
    /**
     * The type identifier for our Android variants. 
     */
    ANDROID("android"),

    /**
     * The type identifier for our iOS variants. 
     */
    IOS("ios"),

    /**
     * The type identifier for our SimplePush variants. 
     */
    SIMPLE_PUSH("simplePush");

    private final String typeName;
    
    private VariantType(String typeName) {
        this.typeName = typeName;
    }
    /**
     * Returns the actual type name of the variant type
     */
    public String getTypeName() {
        return typeName;
    }

}
