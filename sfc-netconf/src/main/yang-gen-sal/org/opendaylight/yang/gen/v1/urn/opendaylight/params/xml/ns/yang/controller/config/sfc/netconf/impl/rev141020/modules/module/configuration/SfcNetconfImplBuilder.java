package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.sfc.netconf.impl.BindingRegistry;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.sfc.netconf.impl.DataBroker;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl
 *
 */
public class SfcNetconfImplBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl> {

    private BindingRegistry _bindingRegistry;
    private DataBroker _dataBroker;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl>> augmentation = Collections.emptyMap();

    public SfcNetconfImplBuilder() {
    }

    public SfcNetconfImplBuilder(SfcNetconfImpl base) {
        this._bindingRegistry = base.getBindingRegistry();
        this._dataBroker = base.getDataBroker();
        if (base instanceof SfcNetconfImplImpl) {
            SfcNetconfImplImpl impl = (SfcNetconfImplImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public BindingRegistry getBindingRegistry() {
        return _bindingRegistry;
    }
    
    public DataBroker getDataBroker() {
        return _dataBroker;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SfcNetconfImplBuilder setBindingRegistry(final BindingRegistry value) {
        this._bindingRegistry = value;
        return this;
    }
    
     
    public SfcNetconfImplBuilder setDataBroker(final DataBroker value) {
        this._dataBroker = value;
        return this;
    }
    
    public SfcNetconfImplBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public SfcNetconfImplBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public SfcNetconfImpl build() {
        return new SfcNetconfImplImpl(this);
    }

    private static final class SfcNetconfImplImpl implements SfcNetconfImpl {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl.class;
        }

        private final BindingRegistry _bindingRegistry;
        private final DataBroker _dataBroker;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl>> augmentation = Collections.emptyMap();

        private SfcNetconfImplImpl(SfcNetconfImplBuilder base) {
            this._bindingRegistry = base.getBindingRegistry();
            this._dataBroker = base.getDataBroker();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BindingRegistry getBindingRegistry() {
            return _bindingRegistry;
        }
        
        @Override
        public DataBroker getDataBroker() {
            return _dataBroker;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_bindingRegistry);
            result = prime * result + Objects.hashCode(_dataBroker);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl)obj;
            if (!Objects.equals(_bindingRegistry, other.getBindingRegistry())) {
                return false;
            }
            if (!Objects.equals(_dataBroker, other.getDataBroker())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SfcNetconfImplImpl otherImpl = (SfcNetconfImplImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.netconf.impl.rev141020.modules.module.configuration.SfcNetconfImpl>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("SfcNetconfImpl [");
            boolean first = true;
        
            if (_bindingRegistry != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bindingRegistry=");
                builder.append(_bindingRegistry);
             }
            if (_dataBroker != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dataBroker=");
                builder.append(_dataBroker);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
