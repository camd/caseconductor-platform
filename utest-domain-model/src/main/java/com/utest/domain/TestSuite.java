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

// Generated Sep 3, 2010 1:57:10 PM by Hibernate Tools 3.2.4.GA

/**
 * TestSuite generated by hbm2java
 */
public class TestSuite extends TimelineEntity implements ProductDependable, EnvironmentDependable, Named
{

	private Integer	companyId;
	private Integer	productId;
	private String	name;
	private String	description;
	private Integer	testSuiteStatusId;
	private Integer	environmentProfileId;
	private boolean	useLatestVersions;

	public TestSuite()
	{
	}

	public TestSuite(final Integer productId, final String name, final Integer testSuiteStatusId, final boolean useLatestVersions)
	{
		super();
		this.productId = productId;
		this.name = name;
		this.testSuiteStatusId = testSuiteStatusId;
		this.useLatestVersions = useLatestVersions;
	}

	public TestSuite(final Integer productId, final String name, final String description, final Integer testSuiteStatusId, final Integer environmentProfileId,
			final boolean useLatestVersions)
	{
		super();

		this.productId = productId;
		this.name = name;
		this.description = description;
		this.testSuiteStatusId = testSuiteStatusId;
		this.environmentProfileId = environmentProfileId;
		this.useLatestVersions = useLatestVersions;
	}

	public Integer getProductId()
	{
		return this.productId;
	}

	public void setProductId(final Integer productId)
	{
		this.productId = productId;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return this.description;
	}

	public void setDescription(final String description)
	{
		this.description = description;
	}

	public Integer getTestSuiteStatusId()
	{
		return this.testSuiteStatusId;
	}

	public void setTestSuiteStatusId(final Integer testSuiteStatusId)
	{
		this.testSuiteStatusId = testSuiteStatusId;
	}

	public Integer getEnvironmentProfileId()
	{
		return this.environmentProfileId;
	}

	public void setEnvironmentProfileId(final Integer environmentProfileId)
	{
		this.environmentProfileId = environmentProfileId;
	}

	public boolean isUseLatestVersions()
	{
		return this.useLatestVersions;
	}

	public void setUseLatestVersions(final boolean useLatestVersions)
	{
		this.useLatestVersions = useLatestVersions;
	}

	public void setCompanyId(Integer companyId)
	{
		this.companyId = companyId;
	}

	public Integer getCompanyId()
	{
		return companyId;
	}

}
