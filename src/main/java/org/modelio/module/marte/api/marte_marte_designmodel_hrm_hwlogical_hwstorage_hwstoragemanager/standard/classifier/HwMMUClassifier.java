/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwMMU_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwMMUClassifier extends HwStorageManagerClassifier {
    public static final String STEREOTYPE_NAME = "HwMMU_Classifier";

    public static final String HWMMU_CLASSIFIER_MEMORYPROTECTION_TAGTYPE = "HwMMU_Classifier_memoryProtection";

    public static final String HWMMU_CLASSIFIER_NBENTRIES_TAGTYPE = "HwMMU_Classifier_nbEntries";

    public static final String HWMMU_CLASSIFIER_OWNEDTLBS_TAGTYPE = "HwMMU_Classifier_ownedTLBs";

    public static final String HWMMU_CLASSIFIER_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_Classifier_physicalAddrSpace";

    public static final String HWMMU_CLASSIFIER_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_Classifier_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMUClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwMMU_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwMMU_Classifier >> then instantiate a {@link HwMMUClassifier} proxy.
     * 
     * @return a {@link HwMMUClassifier} proxy on the created {@link Classifier}.
     */
    public static HwMMUClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUClassifier.STEREOTYPE_NAME);
        return HwMMUClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwMMUClassifier} proxy from a {@link Classifier} stereotyped << HwMMU_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwMMUClassifier} proxy or <i>null</i>.
     */
    public static HwMMUClassifier instantiate(final Classifier obj) {
        return HwMMUClassifier.canInstantiate(obj) ? new HwMMUClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMMUClassifier} proxy from a {@link Classifier} stereotyped << HwMMU_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwMMUClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwMMUClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwMMUClassifier.canInstantiate(obj))
        	return new HwMMUClassifier(obj);
        else
        	throw new IllegalArgumentException("HwMMUClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        HwMMUClassifier other = (HwMMUClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_Classifier_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Classifier_nbEntries() {
        return this.elt.getTagValue(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_Classifier_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMMU_Classifier_ownedTLBs() {
        return this.elt.getTagValues(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Classifier_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Classifier_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Classifier_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMMU_Classifier_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_Classifier_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwMMU_Classifier_memoryProtection() {
        return this.elt.isTagged(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_Classifier_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Classifier_memoryProtection(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_MEMORYPROTECTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwMMU_Classifier_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Classifier_nbEntries(final String value) {
        this.elt.putTagValue(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_Classifier_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Classifier_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_Classifier_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Classifier_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_Classifier_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMMU_Classifier_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    protected HwMMUClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMMU_CLASSIFIER_VIRTUALADDRSPACE_TAGTYPE_ELT;

        public static TagType HWMMU_CLASSIFIER_PHYSICALADDRSPACE_TAGTYPE_ELT;

        public static TagType HWMMU_CLASSIFIER_NBENTRIES_TAGTYPE_ELT;

        public static TagType HWMMU_CLASSIFIER_OWNEDTLBS_TAGTYPE_ELT;

        public static TagType HWMMU_CLASSIFIER_MEMORYPROTECTION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4802dc84-10b3-11df-81d9-0014222a9f79");
            HWMMU_CLASSIFIER_VIRTUALADDRSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4802dc85-10b3-11df-81d9-0014222a9f79");
            HWMMU_CLASSIFIER_PHYSICALADDRSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4802dc86-10b3-11df-81d9-0014222a9f79");
            HWMMU_CLASSIFIER_NBENTRIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4802dc88-10b3-11df-81d9-0014222a9f79");
            HWMMU_CLASSIFIER_OWNEDTLBS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4802dc89-10b3-11df-81d9-0014222a9f79");
            HWMMU_CLASSIFIER_MEMORYPROTECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d320c1d9-1710-11df-b92a-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
