/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ComputingResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwComputingResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwComputingResourceLink extends ComputingResourceLink {
    public static final String STEREOTYPE_NAME = "HwComputingResource_Link";

    public static final String HWCOMPUTINGRESOURCE_LINK_DESCRIPTION_TAGTYPE = "HwComputingResource_Link_description";

    public static final String HWCOMPUTINGRESOURCE_LINK_ENDPOINTS_TAGTYPE = "HwComputingResource_Link_endPoints";

    public static final String HWCOMPUTINGRESOURCE_LINK_FREQUENCY_TAGTYPE = "HwComputingResource_Link_frequency";

    public static final String HWCOMPUTINGRESOURCE_LINK_OP_FREQUENCIES_TAGTYPE = "HwComputingResource_Link_op_Frequencies";

    public static final String HWCOMPUTINGRESOURCE_LINK_OWNEDHW_TAGTYPE = "HwComputingResource_Link_ownedHW";

    public static final String HWCOMPUTINGRESOURCE_LINK_P_HW_SERVICES_TAGTYPE = "HwComputingResource_Link_p_HW_Services";

    public static final String HWCOMPUTINGRESOURCE_LINK_R_HW_SERVICES_TAGTYPE = "HwComputingResource_Link_r_HW_Services";

    /**
     * Tells whether a {@link HwComputingResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwComputingResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwComputingResource_Link >> then instantiate a {@link HwComputingResourceLink} proxy.
     * 
     * @return a {@link HwComputingResourceLink} proxy on the created {@link Link}.
     */
    public static HwComputingResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceLink.STEREOTYPE_NAME);
        return HwComputingResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceLink} proxy from a {@link Link} stereotyped << HwComputingResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwComputingResourceLink} proxy or <i>null</i>.
     */
    public static HwComputingResourceLink instantiate(final Link obj) {
        return HwComputingResourceLink.canInstantiate(obj) ? new HwComputingResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceLink} proxy from a {@link Link} stereotyped << HwComputingResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwComputingResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwComputingResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwComputingResourceLink.canInstantiate(obj))
        	return new HwComputingResourceLink(obj);
        else
        	throw new IllegalArgumentException("HwComputingResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwComputingResourceLink other = (HwComputingResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwComputingResource_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComputingResource_Link_description() {
        return this.elt.getTagValue(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Link_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_Link_endPoints() {
        return this.elt.getTagValues(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComputingResource_Link_frequency() {
        return this.elt.getTagValue(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Link_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComputingResource_Link_op_Frequencies() {
        return this.elt.getTagValue(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_OP_FREQUENCIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Link_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_Link_ownedHW() {
        return this.elt.getTagValues(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Link_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_Link_p_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Link_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComputingResource_Link_r_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComputingResource_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Link_description(final String value) {
        this.elt.putTagValue(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Link_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Link_endPoints(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComputingResource_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Link_frequency(final String value) {
        this.elt.putTagValue(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComputingResource_Link_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Link_op_Frequencies(final String value) {
        this.elt.putTagValue(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_OP_FREQUENCIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Link_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Link_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Link_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Link_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Link_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComputingResource_Link_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwComputingResourceLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_LINK_OP_FREQUENCIES_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWCOMPUTINGRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00d61ed5-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_LINK_OP_FREQUENCIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00e46cc1-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4b0462dc-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4b0462dd-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4b0462de-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4b0462df-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4b0462e0-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4b0462e1-1623-11df-b9be-0014222a9f79");
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
