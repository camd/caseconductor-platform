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

// Generated Oct 7, 2009 11:18:35 AM by Hibernate Tools 3.2.4.GA

/**
 * UserStatusLocale generated by hbm2java
 */
public class ApprovalStatusLocale implements LocaleDescriptable
{

	private ApprovalStatusLocaleId	id;
	private String					name;
	private Integer					sortOrder;

	public ApprovalStatusLocale()
	{
	}

	public ApprovalStatusLocale(final ApprovalStatusLocaleId id, final String name, final Integer sortOrder)
	{
		this.id = id;
		this.name = name;
		this.sortOrder = sortOrder;
	}

	public ApprovalStatusLocaleId getId()
	{
		return this.id;
	}

	public void setId(final ApprovalStatusLocaleId id)
	{
		this.id = id;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public Integer getSortOrder()
	{
		return this.sortOrder;
	}

	public void setSortOrder(final Integer sortOrder)
	{
		this.sortOrder = sortOrder;
	}

	@Override
	public Integer getEntityId()
	{
		return getId().getApprovalStatusId();
	}

	@Override
	public String getLocaleCode()
	{
		return getId().getLocaleCode();
	}
}
