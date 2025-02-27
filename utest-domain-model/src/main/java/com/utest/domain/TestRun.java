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

import java.util.Date;

/**
 * TestRun generated by hbm2java
 */
public class TestRun extends TimelineEntity implements ProductDependable, EnvironmentDependable, TeamDependable, Named
{

	private String	name;
	private String	description;
	private Integer	testRunStatusId;
	private Integer	testCycleId;
	private Integer	productId;
	private Integer	companyId;
	private Date	startDate;
	private Date	endDate;
	private boolean	featured;
	private boolean	useLatestVersions;
	private boolean	autoAssignToTeam;
	private boolean	selfAssignAllowed;
	private Integer	selfAssignLimit;
	private boolean	selfAssignPerEnvironment;
	private Integer	teamId;

	private Integer	environmentProfileId;

	public TestRun()
	{
		super();
	}

	public TestRun(final String name, final Integer testRunStatusId, final Integer testCycleId, final Integer productId, final boolean useLatestVesrions,
			final boolean selfAssignAllowed)
	{
		super();
		this.name = name;
		this.testRunStatusId = testRunStatusId;
		this.testCycleId = testCycleId;
		this.productId = productId;
		this.useLatestVersions = useLatestVesrions;
		this.selfAssignAllowed = selfAssignAllowed;
	}

	public TestRun(final String name, final String description, final Integer testRunStatusId, final Integer testCycleId, final Integer productId, final Date startDate,
			final Date endDate, final boolean useLatestVesrions, final boolean selfAssignAllowed, final Integer environmentProfileId)
	{
		super();
		this.name = name;
		this.description = description;
		this.testRunStatusId = testRunStatusId;
		this.testCycleId = testCycleId;
		this.productId = productId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.useLatestVersions = useLatestVesrions;
		this.selfAssignAllowed = selfAssignAllowed;
		this.environmentProfileId = environmentProfileId;
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

	public Integer getTestRunStatusId()
	{
		return this.testRunStatusId;
	}

	public void setTestRunStatusId(final Integer testRunStatusId)
	{
		this.testRunStatusId = testRunStatusId;
	}

	public Integer getTestCycleId()
	{
		return this.testCycleId;
	}

	public void setTestCycleId(final Integer testCycleId)
	{
		this.testCycleId = testCycleId;
	}

	public Integer getProductId()
	{
		return this.productId;
	}

	public void setProductId(final Integer productId)
	{
		this.productId = productId;
	}

	public Date getStartDate()
	{
		return this.startDate;
	}

	public void setStartDate(final Date startDate)
	{
		this.startDate = startDate;
	}

	public Date getEndDate()
	{
		return this.endDate;
	}

	public void setEndDate(final Date endDate)
	{
		this.endDate = endDate;
	}

	public boolean isUseLatestVersions()
	{
		return this.useLatestVersions;
	}

	public void setUseLatestVersions(final boolean useLatestVersions)
	{
		this.useLatestVersions = useLatestVersions;
	}

	public boolean isSelfAssignAllowed()
	{
		return this.selfAssignAllowed;
	}

	public void setSelfAssignAllowed(final boolean selfAssignAllowed)
	{
		this.selfAssignAllowed = selfAssignAllowed;
	}

	public void setFeatured(boolean featured)
	{
		this.featured = featured;
	}

	public boolean isFeatured()
	{
		return featured;
	}

	public Integer getEnvironmentProfileId()
	{
		return this.environmentProfileId;
	}

	public void setEnvironmentProfileId(final Integer environmentProfileId)
	{
		this.environmentProfileId = environmentProfileId;
	}

	public Integer getSelfAssignLimit()
	{
		return selfAssignLimit;
	}

	public void setSelfAssignLimit(final Integer selfAssignLimit)
	{
		this.selfAssignLimit = selfAssignLimit;
	}

	public boolean isSelfAssignPerEnvironment()
	{
		return selfAssignPerEnvironment;
	}

	public void setSelfAssignPerEnvironment(final boolean selfAssignPerEnvironment)
	{
		this.selfAssignPerEnvironment = selfAssignPerEnvironment;
	}

	public void setTeamId(Integer teamId)
	{
		this.teamId = teamId;
	}

	public Integer getTeamId()
	{
		return teamId;
	}

	public void setAutoAssignToTeam(boolean autoAssignToTeam)
	{
		this.autoAssignToTeam = autoAssignToTeam;
	}

	public boolean isAutoAssignToTeam()
	{
		return autoAssignToTeam;
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
