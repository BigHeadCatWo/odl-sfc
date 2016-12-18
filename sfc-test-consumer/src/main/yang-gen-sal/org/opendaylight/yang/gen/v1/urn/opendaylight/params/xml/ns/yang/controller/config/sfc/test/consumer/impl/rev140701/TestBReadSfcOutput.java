package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.test.consumer.impl.rev140701;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>sfc-test-consumer-impl</b>
 * <br>(Source path: <i>META-INF/yang/sfc-test-consumer-impl@2014-06-12.yang</i>):
 * <pre>
 * container output {
 *     leaf result {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>sfc-test-consumer-impl/test-b-read-sfc/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.test.consumer.impl.rev140701.TestBReadSfcOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.test.consumer.impl.rev140701.TestBReadSfcOutputBuilder
 *
 */
public interface TestBReadSfcOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.test.consumer.impl.rev140701.TestBReadSfcOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sfc-test-consumer:impl",
        "2014-07-01", "output").intern();

    java.lang.Boolean isResult();

}

