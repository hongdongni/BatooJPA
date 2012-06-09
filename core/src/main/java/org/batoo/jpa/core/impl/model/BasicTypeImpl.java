/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.batoo.jpa.core.impl.model;

import javax.persistence.metamodel.BasicType;

import org.batoo.jpa.core.impl.metamodel.MetamodelImpl;


/**
 * Implementation of {@link BasicType}.
 * 
 * @param <X>
 *            The type of the represented basic type
 * 
 * @author hceylan
 * @since $version
 */
public final class BasicTypeImpl<X> extends TypeImpl<X> implements BasicType<X> {

	/**
	 * @param metamodel
	 *            the metamodel
	 * @param javaType
	 *            the java type of the type
	 * 
	 * @since $version
	 * @author hceylan
	 */
	public BasicTypeImpl(MetamodelImpl metamodel, Class<X> javaType) {
		super(metamodel, javaType);
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	@Override
	public PersistenceType getPersistenceType() {
		return PersistenceType.BASIC;
	}

}