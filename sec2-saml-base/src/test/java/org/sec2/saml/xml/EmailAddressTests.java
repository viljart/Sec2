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

/**
 * Tests for the EmailAddress element.
 *
 * @author  Dennis Felsch - dennis.felsch@rub.de
 * @version 0.1
 *
 * August 09, 2012
 */
public final class EmailAddressTests
                    extends AbstractXMLElementTests<EmailAddress> {
    /** {@inheritDoc }. */
    @Override
    protected QName getElementQName() {
        return EmailAddress.DEFAULT_ELEMENT_NAME;
    }

    /** {@inheritDoc }. */
    @Override
    protected EmailAddress getElementForUnmarshalling() {
        EmailAddress xml = this.getBuilder().
                buildObject(this.getElementQName());
        return xml;
    }
}
