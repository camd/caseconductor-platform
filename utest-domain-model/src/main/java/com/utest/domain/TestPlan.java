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

import java.util.List;

import com.utest.domain.TestPlanStatus;

/**
 * TestPlan generated by hbm2java
 */
public class TestPlan extends TimelineEntity implements ProductDependable, EnvironmentDependable, Named
{

	private Integer			productId;
	private Integer			companyId;
	private String			name;
	private String			description;
	private Integer			testPlanStatusId;
	private Integer			environmentProfileId;
	private List<TestSuite>	suites;

	public TestPlan()
	{
		super();
	}

	public TestPlan(final Integer productId, final Integer companyId, final String name)
	{
		super();
		this.productId = productId;
		this.companyId = companyId;
		this.name = name;
		this.testPlanStatusId = TestPlanStatus.PENDING;
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

	public Integer getTestPlanStatusId()
	{
		return this.testPlanStatusId;
	}

	public void setTestPlanStatusId(final Integer testPlanStatusId)
	{
		this.testPlanStatusId = testPlanStatusId;
	}

	public Integer getEnvironmentProfileId()
	{
		return this.environmentProfileId;
	}

	public void setEnvironmentProfileId(final Integer environmentProfileId)
	{
		this.environmentProfileId = environmentProfileId;
	}

	public void setSuites(final List<TestSuite> suites)
	{
		this.suites = suites;
	}

	public List<TestSuite> getSuites()
	{
		return suites;
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
