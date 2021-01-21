/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwRAM_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9dea6c13-2fa0-4a1c-8a4e-2679b08d0490")
public class HwRAMAssociationEnd extends HwMemoryAssociationEnd {
    @objid ("97314a95-d0ff-4a1b-aca8-a2e915f6c2db")
    public static final String STEREOTYPE_NAME = "HwRAM_AssociationEnd";

    @objid ("6d10be93-f0f2-4a86-8f82-0e43f5578ff3")
    public static final String HWRAM_ASSOCIATIONEND_ISNONVOLATILE_TAGTYPE = "HwRAM_AssociationEnd_isNonVolatile";

    @objid ("9b704b90-3168-4ebe-a0c8-d2ff632ffc68")
    public static final String HWRAM_ASSOCIATIONEND_ISSTATIC_TAGTYPE = "HwRAM_AssociationEnd_isStatic";

    @objid ("bb52272b-4f0a-4607-804a-b57995f87148")
    public static final String HWRAM_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE = "HwRAM_AssociationEnd_isSynchronous";

    @objid ("531751ec-1d40-47ab-9ea2-c7d127e4c2cd")
    public static final String HWRAM_ASSOCIATIONEND_ORGANIZATION_TAGTYPE = "HwRAM_AssociationEnd_organization";

    @objid ("92590a3d-b070-4a1b-965c-642a9ce4226b")
    public static final String HWRAM_ASSOCIATIONEND_REPL_POLICY_TAGTYPE = "HwRAM_AssociationEnd_repl_Policy";

    @objid ("aa27b9a7-002c-426d-a3b7-6bacbd0b7a43")
    public static final String HWRAM_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE = "HwRAM_AssociationEnd_writePolicy";

    /**
     * Tells whether a {@link HwRAMAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwRAM_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("af1655e4-9e64-4151-869c-a97527e834aa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwRAM_AssociationEnd >> then instantiate a {@link HwRAMAssociationEnd} proxy.
     * 
     * @return a {@link HwRAMAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("f00c4169-ea1e-408d-a1da-374b5d8e76af")
    public static HwRAMAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMAssociationEnd.STEREOTYPE_NAME);
        return HwRAMAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwRAMAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwRAM_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwRAMAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("23342865-39e5-4a23-947f-0c03bb32f72d")
    public static HwRAMAssociationEnd instantiate(final AssociationEnd obj) {
        return HwRAMAssociationEnd.canInstantiate(obj) ? new HwRAMAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwRAMAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwRAM_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwRAMAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e8d13e41-a7d9-4eb9-aad1-19244309421e")
    public static HwRAMAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwRAMAssociationEnd.canInstantiate(obj))
        	return new HwRAMAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwRAMAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("94484d78-9328-406a-b669-3afbc82c8bfc")
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
        HwRAMAssociationEnd other = (HwRAMAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("266c173f-9fff-49bb-bd1a-a13186fd66c5")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwRAM_AssociationEnd_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ffff804f-bb9f-4731-be51-e4e5e3d2c5b7")
    public String getHwRAM_AssociationEnd_organization() {
        return this.elt.getTagValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_AssociationEnd_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2b346c52-3d45-405f-b00b-1939ff9ba422")
    public String getHwRAM_AssociationEnd_repl_Policy() {
        return this.elt.getTagValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_AssociationEnd_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c8cf597b-ef53-4421-9499-2e958d5cc303")
    public String getHwRAM_AssociationEnd_writePolicy() {
        return this.elt.getTagValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("79264a28-c3b3-49e3-ac88-d4ef368d285b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_AssociationEnd_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c8064fe-281e-486e-bc33-dc22dae9788b")
    public boolean isHwRAM_AssociationEnd_isNonVolatile() {
        return this.elt.isTagged(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_AssociationEnd_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a190d4ca-2a5a-42ed-87de-6a9afd9190c8")
    public boolean isHwRAM_AssociationEnd_isStatic() {
        return this.elt.isTagged(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_AssociationEnd_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3edb3be8-041d-4190-8ae3-48a88d6e17d8")
    public boolean isHwRAM_AssociationEnd_isSynchronous() {
        return this.elt.isTagged(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_AssociationEnd_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("75fa8435-4b2a-47cd-aade-2bce56c86ce5")
    public void setHwRAM_AssociationEnd_isNonVolatile(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISNONVOLATILE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_AssociationEnd_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ffa0bb21-efdf-4dd0-9bd9-c61ea45a5de4")
    public void setHwRAM_AssociationEnd_isStatic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISSTATIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_AssociationEnd_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e398a3db-f1e5-4311-be94-50514acbfee1")
    public void setHwRAM_AssociationEnd_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwRAM_AssociationEnd_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8f000b70-05f4-43c5-ae4e-56f11fac2c1e")
    public void setHwRAM_AssociationEnd_organization(final String value) {
        this.elt.putTagValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_AssociationEnd_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5e4d4e36-161f-4464-8e26-fa22f6893908")
    public void setHwRAM_AssociationEnd_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_AssociationEnd_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c520a76b-93c0-4586-a412-8c0e53b9532c")
    public void setHwRAM_AssociationEnd_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMAssociationEnd.MdaTypes.HWRAM_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("7a00ee1a-6cc7-47c2-aace-10cc811bcf1b")
    protected HwRAMAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("c863769d-726b-4b87-a361-7847e9d7465b")
    public static final class MdaTypes {
        @objid ("7ebfe891-70a2-4936-aed0-081855ae60cd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("61b78b50-03dc-4ad8-b064-d8a0d0088073")
        public static TagType HWRAM_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT;

        @objid ("bb57a82f-3129-4930-8f7d-5a1df6a79576")
        public static TagType HWRAM_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT;

        @objid ("a0fb86ce-b5a6-44d0-94d2-f69edcdb858d")
        public static TagType HWRAM_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("41cf85e0-caad-426a-9865-a67651f21c70")
        public static TagType HWRAM_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("d5767573-b2d6-4805-bc26-21d0fe182bc3")
        public static TagType HWRAM_ASSOCIATIONEND_ISSTATIC_TAGTYPE_ELT;

        @objid ("6c93c191-38a0-4783-857c-932f95a63b23")
        public static TagType HWRAM_ASSOCIATIONEND_ISNONVOLATILE_TAGTYPE_ELT;

        @objid ("1549e5a4-ca78-4f22-8470-a9cb22b83ff9")
        private static Stereotype MDAASSOCDEP;

        @objid ("8c221098-8040-4e97-b3a6-e1d182b15f70")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6304154a-af1e-4e1a-b506-36fcac3d70f0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01593e6e-0ccf-11df-8525-001302895b2b");
            HWRAM_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015ba0c0-0ccf-11df-8525-001302895b2b");
            HWRAM_ASSOCIATIONEND_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015ba0dc-0ccf-11df-8525-001302895b2b");
            HWRAM_ASSOCIATIONEND_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015ba0e3-0ccf-11df-8525-001302895b2b");
            HWRAM_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ed528140-1bd9-11df-bc0b-0014222a9f79");
            HWRAM_ASSOCIATIONEND_ISSTATIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ed528141-1bd9-11df-bc0b-0014222a9f79");
            HWRAM_ASSOCIATIONEND_ISNONVOLATILE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ed528142-1bd9-11df-bc0b-0014222a9f79");
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
