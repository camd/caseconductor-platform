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
import java.util.List;

/**
 * TestCaseVersion generated by hbm2java
 */
public class TestCaseVersion extends TimelineEntity implements EnvironmentDependable, Versioned
{

	private TestCase			testCase;
	private Integer				testCaseId;
	private Integer				productId;
	// private String name;
	private Integer				testCaseStatusId;
	private String				description;
	private Integer				majorVersion;
	private Integer				minorVersion;
	private boolean				latestVersion;
	private Integer				approvalStatusId;
	private Integer				approvedBy;
	private Date				approveDate;
	private Integer				environmentProfileId;
	private List<TestCaseStep>	steps;

	public TestCaseVersion()
	{
	}

	public TestCaseVersion(final Integer testCaseId, final Integer testCaseStatusId, final String description, final Integer majorVersion, final Integer minorVersion,
			final boolean latestVersion, final Integer approvalStatusId, final Integer createdBy, final Date createDate, final Integer lastChangedBy, final Date lastChangeDate)
	{
		super(createdBy, createDate, lastChangedBy, lastChangeDate);
		this.testCaseId = testCaseId;
		// this.name = name;
		this.testCaseStatusId = testCaseStatusId;
		this.description = description;
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;
		this.latestVersion = latestVersion;
		this.approvalStatusId = approvalStatusId;
	}

	public TestCaseVersion(final Integer testCaseId, final Integer testCaseStatusId, final String description, final Integer majorVersion, final Integer minorVersion,
			final boolean latestVersion, final Integer approvalStatusId, final Integer approvedBy, final Date approveDate, final Integer environmentProfileId,
			final Integer createdBy, final Date createDate, final Integer lastChangedBy, final Date lastChangeDate)
	{
		super(createdBy, createDate, lastChangedBy, lastChangeDate);
		this.testCaseId = testCaseId;
		// this.name = name;
		this.testCaseStatusId = testCaseStatusId;
		this.description = description;
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;
		this.latestVersion = latestVersion;
		this.approvalStatusId = approvalStatusId;
		this.approvedBy = approvedBy;
		this.approveDate = approveDate;
		this.environmentProfileId = environmentProfileId;
	}

	public Integer getTestCaseId()
	{
		return this.testCaseId;
	}

	public void setTestCaseId(final Integer testCaseId)
	{
		this.testCaseId = testCaseId;
	}

	// public String getName()
	// {
	// return this.name;
	// }
	//
	// public void setName(final String name)
	// {
	// this.name = name;
	// }

	public Integer getTestCaseStatusId()
	{
		return this.testCaseStatusId;
	}

	public void setTestCaseStatusId(final Integer testCaseStatusId)
	{
		this.testCaseStatusId = testCaseStatusId;
	}

	public String getDescription()
	{
		return this.description;
	}

	public void setDescription(final String description)
	{
		this.description = description;
	}

	public Integer getMajorVersion()
	{
		return this.majorVersion;
	}

	public void setMajorVersion(final Integer majorVersion)
	{
		this.majorVersion = majorVersion;
	}

	public Integer getMinorVersion()
	{
		return this.minorVersion;
	}

	public void setMinorVersion(final Integer minorVersion)
	{
		this.minorVersion = minorVersion;
	}

	public boolean isLatestVersion()
	{
		return this.latestVersion;
	}

	public void setLatestVersion(final boolean latestVersion)
	{
		this.latestVersion = latestVersion;
	}

	public Integer getApprovalStatusId()
	{
		return this.approvalStatusId;
	}

	public void setApprovalStatusId(final Integer approvalStatusId)
	{
		this.approvalStatusId = approvalStatusId;
	}

	public Integer getApprovedBy()
	{
		return this.approvedBy;
	}

	public void setApprovedBy(final Integer approvedBy)
	{
		this.approvedBy = approvedBy;
	}

	public Date getApproveDate()
	{
		return this.approveDate;
	}

	public void setApproveDate(final Date approveDate)
	{
		this.approveDate = approveDate;
	}

	public Integer getEnvironmentProfileId()
	{
		return this.environmentProfileId;
	}

	public void setEnvironmentProfileId(final Integer environmentProfileId)
	{
		this.environmentProfileId = environmentProfileId;
	}

	public void setSteps(final List<TestCaseStep> steps)
	{
		this.steps = steps;
	}

	public List<TestCaseStep> getSteps()
	{
		return steps;
	}

	public void setProductId(final Integer productId)
	{
		this.productId = productId;
	}

	public Integer getProductId()
	{
		return productId;
	}

	@Override
	public Integer getMainEntityIdentifier()
	{
		return testCaseId;
	}

	@Override
	public String getMainEntityIdentifierName()
	{
		return "testCaseId";
	}

	public void setTestCase(TestCase testCase)
	{
		this.testCase = testCase;
	}

	public TestCase getTestCase()
	{
		return testCase;
	}

}
