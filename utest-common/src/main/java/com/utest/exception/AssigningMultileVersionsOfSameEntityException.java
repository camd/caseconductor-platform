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
package com.utest.exception;

public class AssigningMultileVersionsOfSameEntityException extends DomainException
{

	public AssigningMultileVersionsOfSameEntityException()
	{
		super(DomainErrorMessage.assigningSameTestCaseVersionsToTester);
	}

	public AssigningMultileVersionsOfSameEntityException(final String message_)
	{
		super(DomainErrorMessage.assigningSameTestCaseVersionsToTester, message_);
	}
}
