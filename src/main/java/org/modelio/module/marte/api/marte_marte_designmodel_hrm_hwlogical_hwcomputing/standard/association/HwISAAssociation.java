/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.association.HwResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwISA_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4a911dae-96f1-4c2f-ae48-3a4bb2bf8bf6")
public class HwISAAssociation extends HwResourceAssociation {
    @objid ("249304e3-8bc6-4a7e-94a6-eae6d3659a8c")
    public static final String STEREOTYPE_NAME = "HwISA_Association";

    @objid ("7ddba373-4903-4ae8-bb9d-906d1671d89e")
    public static final String HWISA_ASSOCIATION_FAMILY_TAGTYPE = "HwISA_Association_family";

    @objid ("0a397697-3cee-45da-9b9c-637d2fff5591")
    public static final String HWISA_ASSOCIATION_INST_WIDTH_TAGTYPE = "HwISA_Association_inst_Width";

    @objid ("2a6a2d8a-d3fa-4a2f-9749-71cd13f9b6d0")
    public static final String HWISA_ASSOCIATION_TYPE_TAGTYPE = "HwISA_Association_type";

    /**
     * Tells whether a {@link HwISAAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwISA_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b22dd345-5885-40fd-b9d8-b5eeb7be219c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwISAAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwISA_Association >> then instantiate a {@link HwISAAssociation} proxy.
     * 
     * @return a {@link HwISAAssociation} proxy on the created {@link Association}.
     */
    @objid ("9f268cde-34bd-4ccc-a7f0-ee1042c66d44")
    public static HwISAAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwISAAssociation.STEREOTYPE_NAME);
        return HwISAAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwISAAssociation} proxy from a {@link Association} stereotyped << HwISA_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwISAAssociation} proxy or <i>null</i>.
     */
    @objid ("88ef09d7-028d-4801-8c07-c3a40955f370")
    public static HwISAAssociation instantiate(final Association obj) {
        return HwISAAssociation.canInstantiate(obj) ? new HwISAAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwISAAssociation} proxy from a {@link Association} stereotyped << HwISA_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwISAAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0023de3e-1a20-4c43-a3a1-d275c7b0d7cc")
    public static HwISAAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwISAAssociation.canInstantiate(obj))
        	return new HwISAAssociation(obj);
        else
        	throw new IllegalArgumentException("HwISAAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8e527e28-1964-4ac4-af43-b19d44bc2231")
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
        HwISAAssociation other = (HwISAAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("6cca9e42-3d57-4992-ad14-457275f80df2")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwISA_Association_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0521d9ea-5a7e-4e19-a73e-fb017b463578")
    public String getHwISA_Association_family() {
        return this.elt.getTagValue(HwISAAssociation.MdaTypes.HWISA_ASSOCIATION_FAMILY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Association_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3a14ded4-6c9e-4db8-a7ed-2e6a382e1a8f")
    public String getHwISA_Association_inst_Width() {
        return this.elt.getTagValue(HwISAAssociation.MdaTypes.HWISA_ASSOCIATION_INST_WIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("557504f3-51dc-4033-a421-5489ec4269fb")
    public String getHwISA_Association_type() {
        return this.elt.getTagValue(HwISAAssociation.MdaTypes.HWISA_ASSOCIATION_TYPE_TAGTYPE_ELT);
    }

    @objid ("83ddfae5-f2b8-45ce-a464-baa5d5ff4280")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwISA_Association_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45b095f4-4883-4013-af9f-518a99e6b800")
    public void setHwISA_Association_family(final String value) {
        this.elt.putTagValue(HwISAAssociation.MdaTypes.HWISA_ASSOCIATION_FAMILY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Association_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6e16f107-a731-46a3-b356-9a03cdf4b2d3")
    public void setHwISA_Association_inst_Width(final String value) {
        this.elt.putTagValue(HwISAAssociation.MdaTypes.HWISA_ASSOCIATION_INST_WIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a107a8af-d934-4adc-9c60-d5a5e27a3be1")
    public void setHwISA_Association_type(final String value) {
        this.elt.putTagValue(HwISAAssociation.MdaTypes.HWISA_ASSOCIATION_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("eabbbff8-b59e-42a2-aad6-e5ec499e9f43")
    protected HwISAAssociation(final Association elt) {
        super(elt);
    }

    @objid ("bd12621b-e1d5-4087-a59c-256d3869fade")
    public static final class MdaTypes {
        @objid ("8c5c90c1-2b8c-40c6-a3f2-80b6b286855e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d499f9cc-df0d-4138-97d8-6df703ed0ebe")
        public static TagType HWISA_ASSOCIATION_FAMILY_TAGTYPE_ELT;

        @objid ("14a50564-e7f1-4fca-a9d5-0669e1367d64")
        public static TagType HWISA_ASSOCIATION_INST_WIDTH_TAGTYPE_ELT;

        @objid ("f6bd04ec-bb8e-4365-bfa2-ea45715898ae")
        public static TagType HWISA_ASSOCIATION_TYPE_TAGTYPE_ELT;

        @objid ("da9c2931-490a-4195-a31d-390612e5f55a")
        private static Stereotype MDAASSOCDEP;

        @objid ("339e3eb1-1bca-45c3-80f7-9658fc4563b5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5c486e0f-9595-4814-b422-e97418e5fcf2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "39ef8fa9-10a7-11df-81d9-0014222a9f79");
            HWISA_ASSOCIATION_FAMILY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "39ef8faa-10a7-11df-81d9-0014222a9f79");
            HWISA_ASSOCIATION_INST_WIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "39ef8fab-10a7-11df-81d9-0014222a9f79");
            HWISA_ASSOCIATION_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "39ef8fac-10a7-11df-81d9-0014222a9f79");
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
