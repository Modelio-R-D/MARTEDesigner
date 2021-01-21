/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("2186b0c9-e995-4e8a-83c6-f41b2b062c78")
public class HwMMUClassifier extends HwStorageManagerClassifier {
    @objid ("3d2a93b8-935b-4df2-adb5-1527db3b0542")
    public static final String STEREOTYPE_NAME = "HwMMU_Classifier";

    @objid ("d7effd2e-84b9-4168-840e-4fcf3d9d437b")
    public static final String HWMMU_CLASSIFIER_MEMORYPROTECTION_TAGTYPE = "HwMMU_Classifier_memoryProtection";

    @objid ("68692150-b598-46c1-bf6d-1d34cced33b9")
    public static final String HWMMU_CLASSIFIER_NBENTRIES_TAGTYPE = "HwMMU_Classifier_nbEntries";

    @objid ("1faabb5f-76d0-4ae1-b5d1-096b9cf44b7e")
    public static final String HWMMU_CLASSIFIER_OWNEDTLBS_TAGTYPE = "HwMMU_Classifier_ownedTLBs";

    @objid ("41fb10a9-c61f-4f95-b47a-59dc54fd6888")
    public static final String HWMMU_CLASSIFIER_PHYSICALADDRSPACE_TAGTYPE = "HwMMU_Classifier_physicalAddrSpace";

    @objid ("c8b74667-02b1-4e45-b574-a199bd186e76")
    public static final String HWMMU_CLASSIFIER_VIRTUALADDRSPACE_TAGTYPE = "HwMMU_Classifier_virtualAddrSpace";

    /**
     * Tells whether a {@link HwMMUClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwMMU_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ac7516a2-c4b7-403b-8a48-51ae750b42d7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwMMU_Classifier >> then instantiate a {@link HwMMUClassifier} proxy.
     * 
     * @return a {@link HwMMUClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("c481702f-ce51-4aad-8b9b-6162b8d3a605")
    public static HwMMUClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMMUClassifier.STEREOTYPE_NAME);
        return HwMMUClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwMMUClassifier} proxy from a {@link Classifier} stereotyped << HwMMU_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwMMUClassifier} proxy or <i>null</i>.
     */
    @objid ("5a08a28a-f7ad-4cf1-9e38-074b01856285")
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
    @objid ("21ee34e2-eae8-4dac-a924-da1a5e0b0fbe")
    public static HwMMUClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwMMUClassifier.canInstantiate(obj))
        	return new HwMMUClassifier(obj);
        else
        	throw new IllegalArgumentException("HwMMUClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1e2e7ca7-610c-4c30-ad37-a01e7c9e07c5")
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
    @objid ("9944227f-778c-424e-9f66-794833711e4a")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwMMU_Classifier_nbEntries'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("966e5c18-5bab-4204-a906-9a9f5bfc8457")
    public String getHwMMU_Classifier_nbEntries() {
        return this.elt.getTagValue(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_NBENTRIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMMU_Classifier_ownedTLBs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e5a2cb7d-96a0-40d5-8132-4467c2fcb9bd")
    public List<String> getHwMMU_Classifier_ownedTLBs() {
        return this.elt.getTagValues(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_OWNEDTLBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Classifier_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c07c6e9f-00b2-4a31-8f00-4234a4167d20")
    public String getHwMMU_Classifier_physicalAddrSpace() {
        return this.elt.getTagValue(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_PHYSICALADDRSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMMU_Classifier_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0c96006-d988-4be0-b226-c64b434a5854")
    public String getHwMMU_Classifier_virtualAddrSpace() {
        return this.elt.getTagValue(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_VIRTUALADDRSPACE_TAGTYPE_ELT);
    }

    @objid ("528f52c5-c9ab-495b-bed1-9b8479848fa2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwMMU_Classifier_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a8c5fc75-78e5-4a7f-be0b-490c6cf63c5a")
    public boolean isHwMMU_Classifier_memoryProtection() {
        return this.elt.isTagged(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_MEMORYPROTECTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwMMU_Classifier_memoryProtection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("159741ac-3ca3-43fd-b553-3a5c0e205c8e")
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
    @objid ("b0f5d77d-ca6b-4720-a749-80fc883098b6")
    public void setHwMMU_Classifier_nbEntries(final String value) {
        this.elt.putTagValue(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_NBENTRIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMMU_Classifier_ownedTLBs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a1045aa4-7199-43d1-a9c4-9b3e8ae066ca")
    public void setHwMMU_Classifier_ownedTLBs(final List<String> values) {
        this.elt.putTagValues(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_OWNEDTLBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMMU_Classifier_physicalAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("05178564-4c19-47a7-b4b3-df9bfa69dcd9")
    public void setHwMMU_Classifier_physicalAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_PHYSICALADDRSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMMU_Classifier_virtualAddrSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("852fd090-40ad-49a3-b5d4-62ac02093568")
    public void setHwMMU_Classifier_virtualAddrSpace(final String value) {
        this.elt.putTagValue(HwMMUClassifier.MdaTypes.HWMMU_CLASSIFIER_VIRTUALADDRSPACE_TAGTYPE_ELT, value);
    }

    @objid ("6fdc00f4-30d4-4ef8-af8b-366e3ced9407")
    protected HwMMUClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("db807fa3-bbce-449d-ac30-8346e1aabea2")
    public static final class MdaTypes {
        @objid ("dfe1da32-7a30-4fcb-bcdc-f8a6f35b16f4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("343aff6f-2d7e-458c-bbaf-501d56cb6f55")
        public static TagType HWMMU_CLASSIFIER_VIRTUALADDRSPACE_TAGTYPE_ELT;

        @objid ("88c97d16-130b-46a7-8864-41b9cf883885")
        public static TagType HWMMU_CLASSIFIER_PHYSICALADDRSPACE_TAGTYPE_ELT;

        @objid ("b281c399-cf14-4249-9c67-d76a6b36988b")
        public static TagType HWMMU_CLASSIFIER_NBENTRIES_TAGTYPE_ELT;

        @objid ("abb9339f-ed72-4dcf-869d-af77b1753285")
        public static TagType HWMMU_CLASSIFIER_OWNEDTLBS_TAGTYPE_ELT;

        @objid ("0a518f18-324e-43c7-a0fc-59ca8a61f156")
        public static TagType HWMMU_CLASSIFIER_MEMORYPROTECTION_TAGTYPE_ELT;

        @objid ("1c26aeb1-d858-44bf-9ea3-0b30c91b0fc9")
        private static Stereotype MDAASSOCDEP;

        @objid ("322d155f-125e-4f96-a6dd-e80b4934c7b8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("68616cd1-5f7f-493c-ad72-2f09d5706695")
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
