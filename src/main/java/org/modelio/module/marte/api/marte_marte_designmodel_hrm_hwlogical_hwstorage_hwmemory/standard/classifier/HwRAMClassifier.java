/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Classifier} with << HwRAM_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6f24ab79-9145-492b-bc93-793ecc6458e5")
public class HwRAMClassifier extends HwMemoryClassifier {
    @objid ("871a197f-c2dd-4fac-8147-cea9092badab")
    public static final String STEREOTYPE_NAME = "HwRAM_Classifier";

    @objid ("8c32c62c-f8d9-47cd-9195-fa5cdfccf89e")
    public static final String HWRAM_CLASSIFIER_ISNONVOLATILE_TAGTYPE = "HwRAM_Classifier_isNonVolatile";

    @objid ("dc7e38c2-5317-4894-8ef6-b076b93c9e1a")
    public static final String HWRAM_CLASSIFIER_ISSTATIC_TAGTYPE = "HwRAM_Classifier_isStatic";

    @objid ("8e387c9d-68d7-42ca-aa72-25895af124c8")
    public static final String HWRAM_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE = "HwRAM_Classifier_isSynchronous";

    @objid ("4f4d71e3-850d-454d-a5b9-fe56960d89de")
    public static final String HWRAM_CLASSIFIER_ORGANIZATION_TAGTYPE = "HwRAM_Classifier_organization";

    @objid ("82eac3aa-9686-4035-870b-8901557038a5")
    public static final String HWRAM_CLASSIFIER_REPL_POLICY_TAGTYPE = "HwRAM_Classifier_repl_Policy";

    @objid ("ff21b1c3-8e18-420e-95c3-07f6b11403e5")
    public static final String HWRAM_CLASSIFIER_WRITEPOLICY_TAGTYPE = "HwRAM_Classifier_writePolicy";

    /**
     * Tells whether a {@link HwRAMClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwRAM_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7e54a0ad-81cb-4c44-9521-ff193120259c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwRAM_Classifier >> then instantiate a {@link HwRAMClassifier} proxy.
     * 
     * @return a {@link HwRAMClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("f70a67ae-fff3-4f27-81d5-3d70f0ca8544")
    public static HwRAMClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMClassifier.STEREOTYPE_NAME);
        return HwRAMClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwRAMClassifier} proxy from a {@link Classifier} stereotyped << HwRAM_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwRAMClassifier} proxy or <i>null</i>.
     */
    @objid ("f4f726d7-b6cf-4f4e-a3dd-b4a653b7c66d")
    public static HwRAMClassifier instantiate(final Classifier obj) {
        return HwRAMClassifier.canInstantiate(obj) ? new HwRAMClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwRAMClassifier} proxy from a {@link Classifier} stereotyped << HwRAM_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwRAMClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2415e6b9-4708-4b8f-b40f-930f86e5e4d8")
    public static HwRAMClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwRAMClassifier.canInstantiate(obj))
        	return new HwRAMClassifier(obj);
        else
        	throw new IllegalArgumentException("HwRAMClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dd6d6a80-3549-464e-a410-7e9eec8f5218")
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
        HwRAMClassifier other = (HwRAMClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("47dd3570-fed4-49a8-ac73-6e34409a341a")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwRAM_Classifier_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("40921b2b-8410-4d9a-96f2-93a88a2f9090")
    public String getHwRAM_Classifier_organization() {
        return this.elt.getTagValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Classifier_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bace37c1-4e4e-4359-8c69-44c9bf6564d3")
    public String getHwRAM_Classifier_repl_Policy() {
        return this.elt.getTagValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Classifier_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("46d960a6-894c-4bc9-b1e3-c1ac79a597df")
    public String getHwRAM_Classifier_writePolicy() {
        return this.elt.getTagValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("0360bf12-ca89-4d0b-8837-e8d546ebf39a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_Classifier_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8dba2db5-7edb-4ef6-ad2a-b02b9eb815c3")
    public boolean isHwRAM_Classifier_isNonVolatile() {
        return this.elt.isTagged(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Classifier_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a390828a-6ffa-4e1d-bb29-97cfcb6ff1c7")
    public boolean isHwRAM_Classifier_isStatic() {
        return this.elt.isTagged(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Classifier_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d706d992-2413-46fc-b535-d0c362706396")
    public boolean isHwRAM_Classifier_isSynchronous() {
        return this.elt.isTagged(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Classifier_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90c1f119-4c56-442e-929b-8db163c0c376")
    public void setHwRAM_Classifier_isNonVolatile(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISNONVOLATILE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Classifier_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("810e6bc6-bdef-4d43-a257-c9fb01f8c856")
    public void setHwRAM_Classifier_isStatic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISSTATIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Classifier_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b053f705-e2c1-41fa-868c-0a4918784e95")
    public void setHwRAM_Classifier_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwRAM_Classifier_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("80a43291-0a0f-4e7a-aa15-f15561dd5ba9")
    public void setHwRAM_Classifier_organization(final String value) {
        this.elt.putTagValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Classifier_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("df1a0f73-4aa8-49e2-948a-f6d00bafc83c")
    public void setHwRAM_Classifier_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Classifier_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("403e3958-a359-45f2-bd4b-dd72d7e20f19")
    public void setHwRAM_Classifier_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMClassifier.MdaTypes.HWRAM_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("7f2d6306-638b-4ebb-8ee7-6e79ee856092")
    protected HwRAMClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("c637469f-1cfc-4095-91bc-f71338b37350")
    public static final class MdaTypes {
        @objid ("43ce648c-ab44-4b40-96f5-e33e5a8bb7e9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5dd8b4dd-3690-4afe-a12d-25633af2030f")
        public static TagType HWRAM_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT;

        @objid ("3b4af5ac-1546-4ef3-a328-5231ae58d11f")
        public static TagType HWRAM_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT;

        @objid ("fae82e07-a056-4930-ac4c-20c2f24f8c11")
        public static TagType HWRAM_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("31ef05e3-f830-40aa-a5ff-ff753a4478ad")
        public static TagType HWRAM_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("fa06ad0a-2dd1-49f9-8f3e-094c731cacd4")
        public static TagType HWRAM_CLASSIFIER_ISSTATIC_TAGTYPE_ELT;

        @objid ("8859e4b8-e00d-4c2c-a186-8aa72b874b9f")
        public static TagType HWRAM_CLASSIFIER_ISNONVOLATILE_TAGTYPE_ELT;

        @objid ("67a1d9af-578b-4df6-90aa-eb076d965aab")
        private static Stereotype MDAASSOCDEP;

        @objid ("fd5c99fc-36f9-4ad4-9090-0e0b3c9a7785")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4f6dd076-1757-4b17-9b71-8bb428503a51")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "264b462f-1007-11df-86fe-0014222a9f79");
            HWRAM_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "334ba953-1007-11df-86fe-0014222a9f79");
            HWRAM_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "334ba957-1007-11df-86fe-0014222a9f79");
            HWRAM_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "334ba958-1007-11df-86fe-0014222a9f79");
            HWRAM_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c6027159-170f-11df-b92a-0014222a9f79");
            HWRAM_CLASSIFIER_ISSTATIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c604d3b5-170f-11df-b92a-0014222a9f79");
            HWRAM_CLASSIFIER_ISNONVOLATILE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c604d3b6-170f-11df-b92a-0014222a9f79");
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
