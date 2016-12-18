package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.test.consumer.impl.rev140701.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.test.consumer.impl.rev140701.modules.module.configuration.sfc.test.consumer.impl.RpcRegistry;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>sfc-test-consumer-impl</b>
 * <br>(Source path: <i>META-INF/yang/sfc-test-consumer-impl@2014-06-12.yang</i>):
 * <pre>
 * case sfc-test-consumer-impl {
 *     container rpc-registry {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:sfc-test-consumer:impl?revision=2014-07-01)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>sfc-test-consumer-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:sfc-test-consumer:impl?revision=2014-07-01)sfc-test-consumer-impl</i>
 *
 */
public interface SfcTestConsumerImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.test.consumer.impl.rev140701.modules.module.configuration.SfcTestConsumerImpl>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sfc-test-consumer:impl",
        "2014-07-01", "sfc-test-consumer-impl").intern();

    RpcRegistry getRpcRegistry();

}

