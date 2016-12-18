package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.scf.openflow.provider.impl.rev140901.modules.module.configuration.sfc.scf.openflow.provider.impl;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>sfc-scf-openflow-provider-impl</b>
 * <br>(Source path: <i>META-INF/yang/sfc-scf-openflow-provider-impl.yang</i>):
 * <pre>
 * container rpc-registry {
 *     leaf type {
 *         type leafref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:opendaylight:params:xml:ns:yang:controller:config:sfc-scf-openflow-provider:impl?revision=2014-09-01)type {
 *             leaf type {
 *                 type leafref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>sfc-scf-openflow-provider-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:sfc-scf-openflow-provider:impl?revision=2014-09-01)sfc-scf-openflow-provider-impl/rpc-registry</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.scf.openflow.provider.impl.rev140901.modules.module.configuration.sfc.scf.openflow.provider.impl.RpcRegistryBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.scf.openflow.provider.impl.rev140901.modules.module.configuration.sfc.scf.openflow.provider.impl.RpcRegistryBuilder
 *
 */
public interface RpcRegistry
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.scf.openflow.provider.impl.rev140901.modules.module.configuration.sfc.scf.openflow.provider.impl.RpcRegistry>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sfc-scf-openflow-provider:impl",
        "2014-09-01", "rpc-registry").intern();


}

