package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.sfc.netconf.impl;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>sfc-netconf-impl</b>
 * <br>(Source path: <i>META-INF/yang/sfc-netconf-impl.yang</i>):
 * <pre>
 * container binding-registry {
 *     leaf type {
 *         type leafref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:opendaylight:params:xml:ns:yang:controller:config:sfc-netconf:impl?revision=2014-10-20)type {
 *             leaf type {
 *                 type leafref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>sfc-netconf-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:sfc-netconf:impl?revision=2014-10-20)sfc-netconf-impl/binding-registry</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.sfc.netconf.impl.BindingRegistryBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.sfc.netconf.impl.BindingRegistryBuilder
 *
 */
public interface BindingRegistry
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.sfc.netconf.impl.BindingRegistry>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sfc-netconf:impl",
        "2014-10-20", "binding-registry").intern();


}

