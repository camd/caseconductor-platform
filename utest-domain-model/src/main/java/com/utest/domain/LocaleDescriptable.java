/**
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
 *
 * 
 * @author Vadim Kisen
 *
 * copyright 2010 by uTest 
 */
package com.utest.domain;

public interface LocaleDescriptable extends java.io.Serializable
{
	public static final String	NAME		= "name";
	public static final String	SORT_ORDER	= "sortOrder";
	public static final String	LOCALE_CODE	= "localeCode";

	Integer getEntityId();

	// String getDescription();
	String getName();

	String getLocaleCode();

	Integer getSortOrder();
}
