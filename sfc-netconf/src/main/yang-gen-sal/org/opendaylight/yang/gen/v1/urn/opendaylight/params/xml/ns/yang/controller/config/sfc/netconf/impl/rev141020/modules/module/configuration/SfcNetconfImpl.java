package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.sfc.netconf.impl.BindingRegistry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.sfc.netconf.impl.DataBroker;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>sfc-netconf-impl</b>
 * <br>(Source path: <i>META-INF/yang/sfc-netconf-impl.yang</i>):
 * <pre>
 * case sfc-netconf-impl {
 *     container data-broker {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:sfc-netconf:impl?revision=2014-10-20)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container binding-registry {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:sfc-netconf:impl?revision=2014-10-20)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>sfc-netconf-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:sfc-netconf:impl?revision=2014-10-20)sfc-netconf-impl</i>
 *
 */
public interface SfcNetconfImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sfc-netconf:impl",
        "2014-10-20", "sfc-netconf-impl").intern();

    DataBroker getDataBroker();
    
    BindingRegistry getBindingRegistry();

}

