/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ComputingResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwComputingResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwComputingResourceAssociationEnd extends ComputingResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "HwComputingResource_AssociationEnd";

    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE = "HwComputingResource_AssociationEnd_description";

    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE = "HwComputingResource_AssociationEnd_endPoints";

    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE = "HwComputingResource_AssociationEnd_frequency";

    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES_TAGTYPE = "HwComputingResource_AssociationEnd_op_Frequencies";

    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE = "HwComputingResource_AssociationEnd_ownedHW";

    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE = "HwComputingResource_AssociationEnd_p_HW_Services";

    public static final String HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE = "HwComputingResource_AssociationEnd_r_HW_Services";

    /**
     * Tells whether a {@link HwComputingResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwComputingResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwComputingResource_AssociationEnd >> then instantiate a {@link HwComputingResourceAssociationEnd} proxy.
     * 
     * @return a {@link HwComputingResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static HwComputingResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceAssociationEnd.STEREOTYPE_NAME);
        return HwComputingResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwComputingResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwComputingResourceAssociationEnd} proxy or <i>null</i>.
     */
    public static HwComputingResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return HwComputingResourceAssociationEnd.canInstantiate(obj) ? new HwComputingResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwComputingResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwComputingResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwComputingResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwComputingResourceAssociationEnd.canInstantiate(obj))
        	return new HwComputingResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwComputingResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwComputingResourceAssociationEnd other = (HwComputingResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwComputingResource_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComputingResource_AssociationEnd_description() {
        return this.elt.getTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_AssociationEnd_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_AssociationEnd_endPoints() {
        return this.elt.getTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComputingResource_AssociationEnd_frequency() {
        return this.elt.getTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_AssociationEnd_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComputingResource_AssociationEnd_op_Frequencies() {
        return this.elt.getTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_AssociationEnd_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_AssociationEnd_ownedHW() {
        return this.elt.getTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_AssociationEnd_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_AssociationEnd_p_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_AssociationEnd_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_AssociationEnd_r_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComputingResource_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_AssociationEnd_description(final String value) {
        this.elt.putTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_AssociationEnd_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_AssociationEnd_endPoints(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComputingResource_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_AssociationEnd_frequency(final String value) {
        this.elt.putTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComputingResource_AssociationEnd_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_AssociationEnd_op_Frequencies(final String value) {
        this.elt.putTagValue(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_AssociationEnd_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_AssociationEnd_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_AssociationEnd_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_AssociationEnd_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_AssociationEnd_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_AssociationEnd_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociationEnd.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwComputingResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00d61ed1-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00e46cbd-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b7a0b09-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b7a0b0a-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b7a0b0b-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b7a0b0c-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b7a0b0d-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b7a0b0e-1623-11df-b9be-0014222a9f79");
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
