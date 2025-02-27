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
package com.utest.webservice.builders;

import java.util.Map;

public class ResourceManager
{
	private static Map<String, String>	resourceUrls;
	private static Map<String, String>	resourceNamedClasses;

	ResourceManager()
	{
	}

	public static String getResourcePath(String resourceKey_)
	{
		return resourceUrls.get(resourceKey_);
	}

	public static String getResourceNamedClass(String resourceKey_)
	{
		return resourceNamedClasses.get(resourceKey_);
	}

	public void setResourceUrls(Map<String, String> resourceUrls)
	{
		ResourceManager.resourceUrls = resourceUrls;
	}

	public void setResourceNamedClasses(Map<String, String> resourceNamedClasses)
	{
		ResourceManager.resourceNamedClasses = resourceNamedClasses;
	}

}
