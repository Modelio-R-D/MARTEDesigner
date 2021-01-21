/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.associationend.HwResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwISA_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("eb4bc5c8-65ea-4086-bc92-9f7b961ff239")
public class HwISAAssociationEnd extends HwResourceAssociationEnd {
    @objid ("a9036f28-7c5b-447d-80a8-977bf18fe18a")
    public static final String STEREOTYPE_NAME = "HwISA_AssociationEnd";

    @objid ("712abd75-4ad0-44ff-a08d-c96362213ba1")
    public static final String HWISA_ASSOCIATIONEND_FAMILY_TAGTYPE = "HwISA_AssociationEnd_family";

    @objid ("7f6ed377-d7db-4099-a338-d9c6fd1744fb")
    public static final String HWISA_ASSOCIATIONEND_INST_WIDTH_TAGTYPE = "HwISA_AssociationEnd_inst_Width";

    @objid ("3f7d85e5-5f48-4630-aec4-b1b023a555d6")
    public static final String HWISA_ASSOCIATIONEND_TYPE_TAGTYPE = "HwISA_AssociationEnd_type";

    /**
     * Tells whether a {@link HwISAAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwISA_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0df826b4-e55d-4f0d-8809-182c15961d81")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwISAAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwISA_AssociationEnd >> then instantiate a {@link HwISAAssociationEnd} proxy.
     * 
     * @return a {@link HwISAAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("6d1104d4-232f-4e09-aa8c-d63d6b6053a5")
    public static HwISAAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwISAAssociationEnd.STEREOTYPE_NAME);
        return HwISAAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwISAAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwISA_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwISAAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("5ab912d8-1b34-4b07-87ea-dbd0a1ac765c")
    public static HwISAAssociationEnd instantiate(final AssociationEnd obj) {
        return HwISAAssociationEnd.canInstantiate(obj) ? new HwISAAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwISAAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwISA_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwISAAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5c3bc79d-f8a2-4834-96ff-99c3403dda44")
    public static HwISAAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwISAAssociationEnd.canInstantiate(obj))
        	return new HwISAAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwISAAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1638776f-1ba2-4656-9023-8404be777fc8")
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
        HwISAAssociationEnd other = (HwISAAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("5135b2a0-f26b-444f-87e3-ff8d9ddf9ee8")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwISA_AssociationEnd_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3b080068-6c67-4d38-b353-d10eed9d8139")
    public String getHwISA_AssociationEnd_family() {
        return this.elt.getTagValue(HwISAAssociationEnd.MdaTypes.HWISA_ASSOCIATIONEND_FAMILY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_AssociationEnd_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("23f48e97-0ae4-4245-9274-b9c8a801568a")
    public String getHwISA_AssociationEnd_inst_Width() {
        return this.elt.getTagValue(HwISAAssociationEnd.MdaTypes.HWISA_ASSOCIATIONEND_INST_WIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("531c8b2b-5d07-4f28-aa4f-fcf4fa55d318")
    public String getHwISA_AssociationEnd_type() {
        return this.elt.getTagValue(HwISAAssociationEnd.MdaTypes.HWISA_ASSOCIATIONEND_TYPE_TAGTYPE_ELT);
    }

    @objid ("98a62b6a-de23-4a44-91e8-5cbfc7ee8e84")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwISA_AssociationEnd_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("efbc8d16-7980-47fe-b8de-6a568224111f")
    public void setHwISA_AssociationEnd_family(final String value) {
        this.elt.putTagValue(HwISAAssociationEnd.MdaTypes.HWISA_ASSOCIATIONEND_FAMILY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_AssociationEnd_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c323e7e4-7762-45b0-96ae-f5c93115e725")
    public void setHwISA_AssociationEnd_inst_Width(final String value) {
        this.elt.putTagValue(HwISAAssociationEnd.MdaTypes.HWISA_ASSOCIATIONEND_INST_WIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("03a82e32-ef5d-49c2-bba0-8c0058b7a3ac")
    public void setHwISA_AssociationEnd_type(final String value) {
        this.elt.putTagValue(HwISAAssociationEnd.MdaTypes.HWISA_ASSOCIATIONEND_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("e16be5b7-d063-4c64-a12b-657fcf1dc9df")
    protected HwISAAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("ec3ca7fe-c82f-40bd-b2f3-12e892d7ebda")
    public static final class MdaTypes {
        @objid ("6d9bd567-cdc0-4f3f-9497-a5a44024a401")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("054d1c94-aefa-4c08-9359-d1613aff5b9f")
        public static TagType HWISA_ASSOCIATIONEND_FAMILY_TAGTYPE_ELT;

        @objid ("b5ab324e-3965-467f-966d-b71aee151944")
        public static TagType HWISA_ASSOCIATIONEND_INST_WIDTH_TAGTYPE_ELT;

        @objid ("7bfda8ef-b897-43ae-a55e-480c64b2ae3b")
        public static TagType HWISA_ASSOCIATIONEND_TYPE_TAGTYPE_ELT;

        @objid ("225fa3a7-d0e6-4d2c-b993-7e2665286a2e")
        private static Stereotype MDAASSOCDEP;

        @objid ("9d91d88c-74fa-4e36-ac45-ee6e355241c7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("85ceebc8-144b-43ae-81e9-ce44474fcf3d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00f77f4d-0ccf-11df-8525-001302895b2b");
            HWISA_ASSOCIATIONEND_FAMILY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f54-0ccf-11df-8525-001302895b2b");
            HWISA_ASSOCIATIONEND_INST_WIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f5b-0ccf-11df-8525-001302895b2b");
            HWISA_ASSOCIATIONEND_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f62-0ccf-11df-8525-001302895b2b");
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
