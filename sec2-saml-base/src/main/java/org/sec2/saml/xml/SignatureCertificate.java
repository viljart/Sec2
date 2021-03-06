/*
 * Copyright 2012 Ruhr-University Bochum, Chair for Network and Data Security
 *
 * This source code is part of the "Sec2" project and as this remains property
 * of the project partners. Content and concepts have to be treated as
 * CONFIDENTIAL. Publication or partly disclosure without explicit
 * written permission is prohibited.
 * For details on "Sec2" and its contributors visit
 *
 *        http://nds.rub.de/research/projects/sec2/
 */
package org.sec2.saml.xml;

import javax.xml.namespace.QName;
import org.opensaml.xml.schema.XSBase64Binary;
import org.sec2.saml.SAMLBaseConfig;

/**
 * An interface for an XML element containing a signature certificate.
 *
 * @author  Dennis Felsch - dennis.felsch@rub.de
 * @version 0.1
 *
 * February 04, 2013
 */
//CHECKSTYLE.OFF: InterfaceIsType - OpenSAML software design convention
public interface SignatureCertificate extends XSBase64Binary {
    /** Local name of the SignatureCertificate element. */
    String DEFAULT_ELEMENT_LOCAL_NAME = "signatureCertificate";

    /** Default element name. */
    QName DEFAULT_ELEMENT_NAME = new QName(SAMLBaseConfig.SEC2_SAML_NS,
            DEFAULT_ELEMENT_LOCAL_NAME, SAMLBaseConfig.SEC2_SAML_PREFIX);
}
//CHECKSTYLE.ON: InterfaceIsType
