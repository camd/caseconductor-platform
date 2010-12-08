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
package com.utest.webservice.model.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testcase")
public class TestCaseInfo extends BaseInfo
{
	@XmlElement(required = true)
	private Integer	productId;
	@XmlElement(required = false)
	private Integer	maxAttachmentSizeInMbytes;
	@XmlElement(required = false)
	private Integer	maxNumberOfAttachments;
	@XmlElement(required = false)
	private Integer	testCycleId;
	@XmlElement(required = true)
	private String	name;

	public Integer getProductId()
	{
		return productId;
	}

	public void setProductId(Integer productId)
	{
		this.productId = productId;
	}

	public Integer getMaxAttachmentSizeInMbytes()
	{
		return maxAttachmentSizeInMbytes;
	}

	public void setMaxAttachmentSizeInMbytes(Integer maxAttachmentSizeInMbytes)
	{
		this.maxAttachmentSizeInMbytes = maxAttachmentSizeInMbytes;
	}

	public Integer getMaxNumberOfAttachments()
	{
		return maxNumberOfAttachments;
	}

	public void setMaxNumberOfAttachments(Integer maxNumberOfAttachments)
	{
		this.maxNumberOfAttachments = maxNumberOfAttachments;
	}

	public Integer getTestCycleId()
	{
		return testCycleId;
	}

	public void setTestCycleId(Integer testCycleId)
	{
		this.testCycleId = testCycleId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
