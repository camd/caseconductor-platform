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
 * CountryStateLocale generated by hbm2java
 */
public class CountryStateLocale implements LocaleDescriptable, ParentDependable
{

	private CountryStateLocaleId	id;
	private String					name;
	private Integer					countryId;
	private Integer					sortOrder;

	public CountryStateLocale()
	{
	}

	public CountryStateLocale(final CountryStateLocaleId id, final String name, final Integer countryId, final Integer sortOrder)
	{
		this.id = id;
		this.name = name;
		this.countryId = countryId;
		this.sortOrder = sortOrder;
	}

	public CountryStateLocaleId getId()
	{
		return this.id;
	}

	public void setId(final CountryStateLocaleId id)
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

	public Integer getCountryId()
	{
		return this.countryId;
	}

	public void setCountryId(final Integer countryId)
	{
		this.countryId = countryId;
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
		return getId().getCountryStateId();
	}

	@Override
	public Integer getParentId()
	{
		return getCountryId();
	}

	@Override
	public void setParentId(final Integer parentId)
	{
		setCountryId(parentId);
	}

	@Override
	public Integer getChildId()
	{
		return getId().getCountryStateId();
	}

	@Override
	public String getLocaleCode()
	{
		return getId().getLocaleCode();
	}
}
