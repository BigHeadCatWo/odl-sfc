package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.ovs.impl.rev141020.modules.module.configuration.sfc.ovs.impl;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>sfc-ovs-impl</b>
 * <br>(Source path: <i>META-INF/yang/sfc-ovs-impl.yang</i>):
 * <pre>
 * container rpc-registry {
 *     leaf type {
 *         type leafref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:opendaylight:params:xml:ns:yang:controller:config:sfc-ovs:impl?revision=2014-10-20)type {
 *             leaf type {
 *                 type leafref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>sfc-ovs-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:sfc-ovs:impl?revision=2014-10-20)sfc-ovs-impl/rpc-registry</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.ovs.impl.rev141020.modules.module.configuration.sfc.ovs.impl.RpcRegistryBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.ovs.impl.rev141020.modules.module.configuration.sfc.ovs.impl.RpcRegistryBuilder
 *
 */
public interface RpcRegistry
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.ovs.impl.rev141020.modules.module.configuration.sfc.ovs.impl.RpcRegistry>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sfc-ovs:impl",
        "2014-10-20", "rpc-registry").intern();


}

