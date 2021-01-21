/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fa443193-5fe3-44a2-97be-bbce81f512b3")
public class HwResourceAssociationEnd extends ResourceAssociationEnd {
    @objid ("fbe5f0c7-bcb1-4e77-ba6f-652386da064a")
    public static final String STEREOTYPE_NAME = "HwResource_AssociationEnd";

    @objid ("68222257-5849-48fc-8c1f-f4a99a9703b3")
    public static final String HWRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE = "HwResource_AssociationEnd_description";

    @objid ("88080d87-856d-4b0e-ab0d-4879b8a732d9")
    public static final String HWRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE = "HwResource_AssociationEnd_endPoints";

    @objid ("a94e7798-7b35-47c2-99b8-2e4d3a6da070")
    public static final String HWRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE = "HwResource_AssociationEnd_frequency";

    @objid ("bb64bbae-90b7-4074-966c-64c3e61697ef")
    public static final String HWRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE = "HwResource_AssociationEnd_ownedHW";

    @objid ("bdbd2e21-dac3-4ebf-857a-e06cd804ff3f")
    public static final String HWRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE = "HwResource_AssociationEnd_p_HW_Services";

    @objid ("92ec693a-5aa7-46a5-99be-137cb2af4063")
    public static final String HWRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE = "HwResource_AssociationEnd_r_HW_Services";

    /**
     * Tells whether a {@link HwResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("cdeb32b4-44cf-4567-aa65-7ce314715bfe")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwResource_AssociationEnd >> then instantiate a {@link HwResourceAssociationEnd} proxy.
     * 
     * @return a {@link HwResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("f2f8a939-0bad-4c0c-87b5-599ff3b2b910")
    public static HwResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceAssociationEnd.STEREOTYPE_NAME);
        return HwResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("50b7adf8-c702-4caf-9eda-8a801ec8c6d5")
    public static HwResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return HwResourceAssociationEnd.canInstantiate(obj) ? new HwResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("74f9c99d-5d9e-49b4-a554-6eb8c7dc95af")
    public static HwResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwResourceAssociationEnd.canInstantiate(obj))
        	return new HwResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d3ef3555-3dfb-4479-ba06-a3c3e84b387f")
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
        HwResourceAssociationEnd other = (HwResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("0480f144-f910-4d6e-92ca-f082f69745d3")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwResource_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bd784cf6-6888-44c5-84a4-f9213e14f8d0")
    public String getHwResource_AssociationEnd_description() {
        return this.elt.getTagValue(HwResourceAssociationEnd.MdaTypes.HWRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_AssociationEnd_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1a92ca54-313f-41b7-8555-67d70148dab2")
    public List<String> getHwResource_AssociationEnd_endPoints() {
        return this.elt.getTagValues(HwResourceAssociationEnd.MdaTypes.HWRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResource_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69e1b3da-de93-43a9-938e-85d43ccb0fbb")
    public String getHwResource_AssociationEnd_frequency() {
        return this.elt.getTagValue(HwResourceAssociationEnd.MdaTypes.HWRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_AssociationEnd_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b9e8a1df-81ca-4e27-b10e-7cf0c2e0ec72")
    public List<String> getHwResource_AssociationEnd_ownedHW() {
        return this.elt.getTagValues(HwResourceAssociationEnd.MdaTypes.HWRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_AssociationEnd_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("03721d44-4934-4990-ac70-7ba99e3d7ba2")
    public List<String> getHwResource_AssociationEnd_p_HW_Services() {
        return this.elt.getTagValues(HwResourceAssociationEnd.MdaTypes.HWRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_AssociationEnd_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0ea9066a-e74e-458b-96c3-da52cbc08cac")
    public List<String> getHwResource_AssociationEnd_r_HW_Services() {
        return this.elt.getTagValues(HwResourceAssociationEnd.MdaTypes.HWRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("b22a82ef-7e81-41b9-9994-2413ab710d32")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResource_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bef83351-70c8-4ae9-8fbb-bd84102bd421")
    public void setHwResource_AssociationEnd_description(final String value) {
        this.elt.putTagValue(HwResourceAssociationEnd.MdaTypes.HWRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_AssociationEnd_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bfa8a68f-e039-451d-8a6c-f0b2033fd4f7")
    public void setHwResource_AssociationEnd_endPoints(final List<String> values) {
        this.elt.putTagValues(HwResourceAssociationEnd.MdaTypes.HWRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwResource_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("05a93409-dcbf-4494-83d8-a0679ac66864")
    public void setHwResource_AssociationEnd_frequency(final String value) {
        this.elt.putTagValue(HwResourceAssociationEnd.MdaTypes.HWRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_AssociationEnd_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("edd48fd5-8d53-47c6-a15d-d6a094d5cdf2")
    public void setHwResource_AssociationEnd_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwResourceAssociationEnd.MdaTypes.HWRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_AssociationEnd_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a6050ff-5891-45a6-bbad-c05ce62498c5")
    public void setHwResource_AssociationEnd_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceAssociationEnd.MdaTypes.HWRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_AssociationEnd_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("42bc9d05-641c-4cf9-9dca-b47808c00402")
    public void setHwResource_AssociationEnd_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceAssociationEnd.MdaTypes.HWRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("12855544-89bd-42f8-aba0-3af8797fe1bc")
    protected HwResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("1997d0a6-e91a-4305-970c-73fe3d782d2a")
    public static final class MdaTypes {
        @objid ("bd003eb8-938e-40be-9f66-2e49b5dccdff")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9dcbf8d5-876b-4c08-8be4-22eca01eb88b")
        public static TagType HWRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT;

        @objid ("abdb93b1-5225-4ce2-8942-7e4ebac30326")
        public static TagType HWRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("bdeb8260-efd3-4073-aa86-8e7c2b8238c3")
        public static TagType HWRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("4abc3b32-e201-43d8-aa23-3d689f8f8040")
        public static TagType HWRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT;

        @objid ("e0135c44-1ab4-4204-80ee-cbbbf52126ce")
        public static TagType HWRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT;

        @objid ("3dd425f8-6085-440c-b224-ed888e8edb7b")
        public static TagType HWRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT;

        @objid ("360eaaeb-0c8c-46fd-8a99-72e926b40cb5")
        private static Stereotype MDAASSOCDEP;

        @objid ("2de65005-216c-41d2-bb76-1ace877be806")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("550e610d-241d-4b65-a792-f9b9f16c6b15")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00dae374-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01999d15-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff6b-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff72-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff79-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c8b40351-1013-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c8b40350-1013-11df-86fe-0014222a9f79");
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
