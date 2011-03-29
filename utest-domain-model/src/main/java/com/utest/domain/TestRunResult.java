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
 * TestRunResult generated by hbm2java
 */
public class TestRunResult extends TimelineEntity implements ProductDependable
{

	private Integer	testRunAssignmentId;
	private Integer	testRunId;
	private Integer	productId;
	private Integer	testCycleId;
	private Integer	companyId;
	private Integer	testCaseId;
	private Integer	testCaseVersionId;
	private Integer	testerId;
	private Integer	testRunResultStatusId;
	private Date	runDate;
	private String	actualResult;
	private Integer	failedStepNumber;
	private Integer	actualTimeInMin;
	private String	comment;
	private Integer	approvalStatusId;
	private Integer	approvedBy;
	private Date	approveDate;
	private Integer	environmentGroupId;
	private Integer	testSuiteId;

	public TestRunResult()
	{
	}

	public TestRunResult(final Integer testRunAssignmentId, final Integer testRunId, final Integer productId, final Integer testCaseId, final Integer testCaseVersionId,
			final Integer testerId, final Integer testRunResultStatusId, final Integer approvalStatusId)
	{
		this.testRunAssignmentId = testRunAssignmentId;
		this.testRunId = testRunId;
		this.productId = productId;
		this.testCaseId = testCaseId;
		this.testCaseVersionId = testCaseVersionId;
		this.testerId = testerId;
		this.testRunResultStatusId = testRunResultStatusId;
		this.approvalStatusId = approvalStatusId;
	}

	public TestRunResult(final Integer testRunAssignmentId, final Integer testRunId, final Integer productId, final Integer testCaseId, final Integer testCaseVersionId,
			final Integer testerId, final Integer testRunResultStatusId, final Date runDate, final String actualResult, final Integer failedStepNumber,
			final Integer actualTimeInMin, final String comment, final Integer approvalStatusId, final Integer approvedBy, final Date approveDate,
			final Integer environmentGroupId, final Integer testSuiteId)
	{
		this.testRunAssignmentId = testRunAssignmentId;
		this.testRunId = testRunId;
		this.productId = productId;
		this.testCaseId = testCaseId;
		this.testCaseVersionId = testCaseVersionId;
		this.testerId = testerId;
		this.testRunResultStatusId = testRunResultStatusId;
		this.runDate = runDate;
		this.actualResult = actualResult;
		this.failedStepNumber = failedStepNumber;
		this.actualTimeInMin = actualTimeInMin;
		this.comment = comment;
		this.approvalStatusId = approvalStatusId;
		this.approvedBy = approvedBy;
		this.approveDate = approveDate;
		this.environmentGroupId = environmentGroupId;
		this.testSuiteId = testSuiteId;
	}

	public Integer getTestRunAssignmentId()
	{
		return this.testRunAssignmentId;
	}

	public void setTestRunAssignmentId(final Integer testRunAssignmentId)
	{
		this.testRunAssignmentId = testRunAssignmentId;
	}

	public Integer getTestCycleId()
	{
		return testCycleId;
	}

	public void setTestCycleId(Integer testCycleId)
	{
		this.testCycleId = testCycleId;
	}

	public Integer getCompanyId()
	{
		return companyId;
	}

	public void setCompanyId(Integer companyId)
	{
		this.companyId = companyId;
	}

	public Integer getTestRunId()
	{
		return this.testRunId;
	}

	public void setTestRunId(final Integer testRunId)
	{
		this.testRunId = testRunId;
	}

	public Integer getProductId()
	{
		return this.productId;
	}

	public void setProductId(final Integer productId)
	{
		this.productId = productId;
	}

	public Integer getTestCaseId()
	{
		return this.testCaseId;
	}

	public void setTestCaseId(final Integer testCaseId)
	{
		this.testCaseId = testCaseId;
	}

	public Integer getTestCaseVersionId()
	{
		return this.testCaseVersionId;
	}

	public void setTestCaseVersionId(final Integer testCaseVersionId)
	{
		this.testCaseVersionId = testCaseVersionId;
	}

	public Integer getTesterId()
	{
		return this.testerId;
	}

	public void setTesterId(final Integer testerId)
	{
		this.testerId = testerId;
	}

	public Integer getTestRunResultStatusId()
	{
		return this.testRunResultStatusId;
	}

	public void setTestRunResultStatusId(final Integer testRunResultStatusId)
	{
		this.testRunResultStatusId = testRunResultStatusId;
	}

	public Date getRunDate()
	{
		return this.runDate;
	}

	public void setRunDate(final Date runDate)
	{
		this.runDate = runDate;
	}

	public String getActualResult()
	{
		return this.actualResult;
	}

	public void setActualResult(final String actualResult)
	{
		this.actualResult = actualResult;
	}

	public Integer getFailedStepNumber()
	{
		return this.failedStepNumber;
	}

	public void setFailedStepNumber(final Integer failedStepNumber)
	{
		this.failedStepNumber = failedStepNumber;
	}

	public Integer getActualTimeInMin()
	{
		return this.actualTimeInMin;
	}

	public void setActualTimeInMin(final Integer actualTimeInMin)
	{
		this.actualTimeInMin = actualTimeInMin;
	}

	public String getComment()
	{
		return this.comment;
	}

	public void setComment(final String comment)
	{
		this.comment = comment;
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

	public Integer getEnvironmentGroupId()
	{
		return this.environmentGroupId;
	}

	public void setEnvironmentGroupId(final Integer environmentGroupId)
	{
		this.environmentGroupId = environmentGroupId;
	}

	public void setTestSuiteId(Integer testSuiteId)
	{
		this.testSuiteId = testSuiteId;
	}

	public Integer getTestSuiteId()
	{
		return testSuiteId;
	}

}
