/*
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 *  Copyrights:
 *
 *  Copyright - 1999 Sun Microsystems, Inc. All rights reserved.
 *  901 San Antonio Road, Palo Alto, California 94043, U.S.A.
 *
 *  This product and related documentation are protected by copyright and
 *  distributed under licenses restricting its use, copying, distribution, and
 *  decompilation. No part of this product or related documentation may be
 *  reproduced in any form by any means without prior written authorization of
 *  Sun and its licensors, if any.
 *
 *  RESTRICTED RIGHTS LEGEND: Use, duplication, or disclosure by the United
 *  States Government is subject to the restrictions set forth in DFARS
 *  252.227-7013 (c)(1)(ii) and FAR 52.227-19.
 *
 *  The product described in this manual may be protected by one or more U.S.
 *  patents, foreign patents, or pending applications.
 *
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 *  Author:
 *
 *  Mahindra British Telecom
 *  155 , Bombay - Pune Road 
 *  Pimpri ,
 *  Pune - 411 018.
 *
 *  Module Name   : JAIN INAP API
 *  File Name     : MidCallControlInformation.java
 *  Approver      : Jain Inap Edit Group
 *  Version       : 1.0
 *
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package javax.jain.ss7.inap.datatype;


import java.io.*;
import java.util.*;
import javax.jain.ss7.inap.constants.*;


/**
This class defines the MidCallControlInformation Datatype
*/

public class MidCallControlInformation implements java.io.Serializable
{

    private MidCallInfoType midCallInfoType ;
    private MidCallReportType midCallReportType = MidCallReportType.IN_MONITORING_STATE;

/**
Constructor For MidCallControlInformation
*/
	public MidCallControlInformation(MidCallInfoType midCallInfoType, MidCallReportType midCallReportType) 
	{
		setMidCallInfoType(midCallInfoType);
		setMidCallReportType(midCallReportType);
	}
	
//------------------------------------------	

/**<P>
Gets Mid Call Info Type.
<DT> This parameter returns one of the following:
<LI>IN_MONITORING_STATE
<LI>IN_ANY_STATE	
<P>
*/

    public MidCallInfoType getMidCallInfoType()
    {
        return midCallInfoType;
    }

/**
Sets Mid Call Info Type
*/

    public void  setMidCallInfoType(MidCallInfoType midCallInfoType)
    {
        this.midCallInfoType = midCallInfoType;
    }
//------------------------------------------	

/**
Gets Mid Call Report Type
*/

    public MidCallReportType getMidCallReportType()
    {
        return midCallReportType;
    }

/**
Sets Mid Call Report Type
*/

    public void  setMidCallReportType(MidCallReportType midCallReportType)

         {
         	this.midCallReportType	= midCallReportType;
//    		Runtime.getRuntime().gc();
    }


//------------------------------------------	


}