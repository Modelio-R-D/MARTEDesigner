/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ComputingResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwComputingResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwComputingResourceAssociation extends ComputingResourceAssociation {
    public static final String STEREOTYPE_NAME = "HwComputingResource_Association";

    public static final String HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE = "HwComputingResource_Association_description";

    public static final String HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE = "HwComputingResource_Association_endPoints";

    public static final String HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE = "HwComputingResource_Association_frequency";

    public static final String HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES_TAGTYPE = "HwComputingResource_Association_op_Frequencies";

    public static final String HWCOMPUTINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE = "HwComputingResource_Association_ownedHW";

    public static final String HWCOMPUTINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE = "HwComputingResource_Association_p_HW_Services";

    public static final String HWCOMPUTINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE = "HwComputingResource_Association_r_HW_Services";

    /**
     * Tells whether a {@link HwComputingResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwComputingResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwComputingResource_Association >> then instantiate a {@link HwComputingResourceAssociation} proxy.
     * 
     * @return a {@link HwComputingResourceAssociation} proxy on the created {@link Association}.
     */
    public static HwComputingResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceAssociation.STEREOTYPE_NAME);
        return HwComputingResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceAssociation} proxy from a {@link Association} stereotyped << HwComputingResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwComputingResourceAssociation} proxy or <i>null</i>.
     */
    public static HwComputingResourceAssociation instantiate(final Association obj) {
        return HwComputingResourceAssociation.canInstantiate(obj) ? new HwComputingResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceAssociation} proxy from a {@link Association} stereotyped << HwComputingResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwComputingResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwComputingResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwComputingResourceAssociation.canInstantiate(obj))
        	return new HwComputingResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("HwComputingResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwComputingResourceAssociation other = (HwComputingResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwComputingResource_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComputingResource_Association_description() {
        return this.elt.getTagValue(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Association_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_Association_endPoints() {
        return this.elt.getTagValues(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComputingResource_Association_frequency() {
        return this.elt.getTagValue(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Association_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComputingResource_Association_op_Frequencies() {
        return this.elt.getTagValue(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Association_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_Association_ownedHW() {
        return this.elt.getTagValues(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Association_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_Association_p_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Association_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_Association_r_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComputingResource_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Association_description(final String value) {
        this.elt.putTagValue(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Association_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Association_endPoints(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComputingResource_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Association_frequency(final String value) {
        this.elt.putTagValue(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComputingResource_Association_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Association_op_Frequencies(final String value) {
        this.elt.putTagValue(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Association_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Association_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Association_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Association_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Association_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Association_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceAssociation.MdaTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwComputingResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6e135f18-10a4-11df-81d9-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6e135f19-10a4-11df-81d9-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ae4b2f9-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ae4b2fa-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ae4b2fb-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ae4b2fc-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ae4b2fd-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ae4b2fe-1623-11df-b9be-0014222a9f79");
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
