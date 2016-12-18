package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider
 *
 */
public class SfcVnfTackerProviderBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider> {

    private java.lang.Integer _sfcVnfmKeystonePort;
    private java.lang.String _sfcVnfmTackerName;
    private java.lang.String _sfcVnfmTackerPassword;
    private java.lang.Integer _sfcVnfmTackerPort;
    private java.lang.String _sfcVnfmTackerTenant;
    private java.lang.String _sfcVnfmUri;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider>> augmentation = Collections.emptyMap();

    public SfcVnfTackerProviderBuilder() {
    }
    public SfcVnfTackerProviderBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.InitialValues arg) {
        this._sfcVnfmTackerName = arg.getSfcVnfmTackerName();
        this._sfcVnfmTackerPassword = arg.getSfcVnfmTackerPassword();
        this._sfcVnfmUri = arg.getSfcVnfmUri();
        this._sfcVnfmTackerPort = arg.getSfcVnfmTackerPort();
        this._sfcVnfmKeystonePort = arg.getSfcVnfmKeystonePort();
        this._sfcVnfmTackerTenant = arg.getSfcVnfmTackerTenant();
    }

    public SfcVnfTackerProviderBuilder(SfcVnfTackerProvider base) {
        this._sfcVnfmKeystonePort = base.getSfcVnfmKeystonePort();
        this._sfcVnfmTackerName = base.getSfcVnfmTackerName();
        this._sfcVnfmTackerPassword = base.getSfcVnfmTackerPassword();
        this._sfcVnfmTackerPort = base.getSfcVnfmTackerPort();
        this._sfcVnfmTackerTenant = base.getSfcVnfmTackerTenant();
        this._sfcVnfmUri = base.getSfcVnfmUri();
        if (base instanceof SfcVnfTackerProviderImpl) {
            SfcVnfTackerProviderImpl impl = (SfcVnfTackerProviderImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.InitialValues</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.InitialValues) {
            this._sfcVnfmTackerName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.InitialValues)arg).getSfcVnfmTackerName();
            this._sfcVnfmTackerPassword = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.InitialValues)arg).getSfcVnfmTackerPassword();
            this._sfcVnfmUri = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.InitialValues)arg).getSfcVnfmUri();
            this._sfcVnfmTackerPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.InitialValues)arg).getSfcVnfmTackerPort();
            this._sfcVnfmKeystonePort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.InitialValues)arg).getSfcVnfmKeystonePort();
            this._sfcVnfmTackerTenant = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.InitialValues)arg).getSfcVnfmTackerTenant();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.InitialValues] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getSfcVnfmKeystonePort() {
        return _sfcVnfmKeystonePort;
    }
    
    public java.lang.String getSfcVnfmTackerName() {
        return _sfcVnfmTackerName;
    }
    
    public java.lang.String getSfcVnfmTackerPassword() {
        return _sfcVnfmTackerPassword;
    }
    
    public java.lang.Integer getSfcVnfmTackerPort() {
        return _sfcVnfmTackerPort;
    }
    
    public java.lang.String getSfcVnfmTackerTenant() {
        return _sfcVnfmTackerTenant;
    }
    
    public java.lang.String getSfcVnfmUri() {
        return _sfcVnfmUri;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SfcVnfTackerProviderBuilder setSfcVnfmKeystonePort(final java.lang.Integer value) {
        this._sfcVnfmKeystonePort = value;
        return this;
    }
    
     
    public SfcVnfTackerProviderBuilder setSfcVnfmTackerName(final java.lang.String value) {
        this._sfcVnfmTackerName = value;
        return this;
    }
    
     
    public SfcVnfTackerProviderBuilder setSfcVnfmTackerPassword(final java.lang.String value) {
        this._sfcVnfmTackerPassword = value;
        return this;
    }
    
     
    public SfcVnfTackerProviderBuilder setSfcVnfmTackerPort(final java.lang.Integer value) {
        this._sfcVnfmTackerPort = value;
        return this;
    }
    
     
    public SfcVnfTackerProviderBuilder setSfcVnfmTackerTenant(final java.lang.String value) {
        this._sfcVnfmTackerTenant = value;
        return this;
    }
    
     
    public SfcVnfTackerProviderBuilder setSfcVnfmUri(final java.lang.String value) {
        this._sfcVnfmUri = value;
        return this;
    }
    
    public SfcVnfTackerProviderBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public SfcVnfTackerProviderBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public SfcVnfTackerProvider build() {
        return new SfcVnfTackerProviderImpl(this);
    }

    private static final class SfcVnfTackerProviderImpl implements SfcVnfTackerProvider {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider.class;
        }

        private final java.lang.Integer _sfcVnfmKeystonePort;
        private final java.lang.String _sfcVnfmTackerName;
        private final java.lang.String _sfcVnfmTackerPassword;
        private final java.lang.Integer _sfcVnfmTackerPort;
        private final java.lang.String _sfcVnfmTackerTenant;
        private final java.lang.String _sfcVnfmUri;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider>> augmentation = Collections.emptyMap();

        private SfcVnfTackerProviderImpl(SfcVnfTackerProviderBuilder base) {
            this._sfcVnfmKeystonePort = base.getSfcVnfmKeystonePort();
            this._sfcVnfmTackerName = base.getSfcVnfmTackerName();
            this._sfcVnfmTackerPassword = base.getSfcVnfmTackerPassword();
            this._sfcVnfmTackerPort = base.getSfcVnfmTackerPort();
            this._sfcVnfmTackerTenant = base.getSfcVnfmTackerTenant();
            this._sfcVnfmUri = base.getSfcVnfmUri();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getSfcVnfmKeystonePort() {
            return _sfcVnfmKeystonePort;
        }
        
        @Override
        public java.lang.String getSfcVnfmTackerName() {
            return _sfcVnfmTackerName;
        }
        
        @Override
        public java.lang.String getSfcVnfmTackerPassword() {
            return _sfcVnfmTackerPassword;
        }
        
        @Override
        public java.lang.Integer getSfcVnfmTackerPort() {
            return _sfcVnfmTackerPort;
        }
        
        @Override
        public java.lang.String getSfcVnfmTackerTenant() {
            return _sfcVnfmTackerTenant;
        }
        
        @Override
        public java.lang.String getSfcVnfmUri() {
            return _sfcVnfmUri;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_sfcVnfmKeystonePort);
            result = prime * result + Objects.hashCode(_sfcVnfmTackerName);
            result = prime * result + Objects.hashCode(_sfcVnfmTackerPassword);
            result = prime * result + Objects.hashCode(_sfcVnfmTackerPort);
            result = prime * result + Objects.hashCode(_sfcVnfmTackerTenant);
            result = prime * result + Objects.hashCode(_sfcVnfmUri);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider other = (org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider)obj;
            if (!Objects.equals(_sfcVnfmKeystonePort, other.getSfcVnfmKeystonePort())) {
                return false;
            }
            if (!Objects.equals(_sfcVnfmTackerName, other.getSfcVnfmTackerName())) {
                return false;
            }
            if (!Objects.equals(_sfcVnfmTackerPassword, other.getSfcVnfmTackerPassword())) {
                return false;
            }
            if (!Objects.equals(_sfcVnfmTackerPort, other.getSfcVnfmTackerPort())) {
                return false;
            }
            if (!Objects.equals(_sfcVnfmTackerTenant, other.getSfcVnfmTackerTenant())) {
                return false;
            }
            if (!Objects.equals(_sfcVnfmUri, other.getSfcVnfmUri())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SfcVnfTackerProviderImpl otherImpl = (SfcVnfTackerProviderImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("SfcVnfTackerProvider [");
            boolean first = true;
        
            if (_sfcVnfmKeystonePort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sfcVnfmKeystonePort=");
                builder.append(_sfcVnfmKeystonePort);
             }
            if (_sfcVnfmTackerName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sfcVnfmTackerName=");
                builder.append(_sfcVnfmTackerName);
             }
            if (_sfcVnfmTackerPassword != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sfcVnfmTackerPassword=");
                builder.append(_sfcVnfmTackerPassword);
             }
            if (_sfcVnfmTackerPort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sfcVnfmTackerPort=");
                builder.append(_sfcVnfmTackerPort);
             }
            if (_sfcVnfmTackerTenant != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sfcVnfmTackerTenant=");
                builder.append(_sfcVnfmTackerTenant);
             }
            if (_sfcVnfmUri != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sfcVnfmUri=");
                builder.append(_sfcVnfmUri);
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
