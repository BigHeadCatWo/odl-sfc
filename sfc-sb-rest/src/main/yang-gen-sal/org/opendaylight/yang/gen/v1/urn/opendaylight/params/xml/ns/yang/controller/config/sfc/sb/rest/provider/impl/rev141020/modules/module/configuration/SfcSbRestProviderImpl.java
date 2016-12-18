package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.sb.rest.provider.impl.rev141020.modules.module.configuration;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.sb.rest.provider.impl.rev141020.modules.module.configuration.sfc.sb.rest.provider.impl.DataBroker;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>sfc-sb-rest-provider-impl</b>
 * <br>(Source path: <i>META-INF/yang/sfc-sb-rest-provider-impl.yang</i>):
 * <pre>
 * case sfc-sb-rest-provider-impl {
 *     container data-broker {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:sfc-sb-rest-provider:impl?revision=2014-10-20)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>sfc-sb-rest-provider-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:sfc-sb-rest-provider:impl?revision=2014-10-20)sfc-sb-rest-provider-impl</i>
 *
 */
public interface SfcSbRestProviderImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.sb.rest.provider.impl.rev141020.modules.module.configuration.SfcSbRestProviderImpl>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sfc-sb-rest-provider:impl",
        "2014-10-20", "sfc-sb-rest-provider-impl").intern();

    DataBroker getDataBroker();

}

