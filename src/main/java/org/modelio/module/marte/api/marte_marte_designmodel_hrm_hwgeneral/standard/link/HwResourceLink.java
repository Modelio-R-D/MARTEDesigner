/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.link;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwResourceLink extends ResourceLink {
    public static final String STEREOTYPE_NAME = "HwResource_Link";

    public static final String HWRESOURCE_LINK_DESCRIPTION_TAGTYPE = "HwResource_Link_description";

    public static final String HWRESOURCE_LINK_ENDPOINTS_TAGTYPE = "HwResource_Link_endPoints";

    public static final String HWRESOURCE_LINK_FREQUENCY_TAGTYPE = "HwResource_Link_frequency";

    public static final String HWRESOURCE_LINK_OWNEDHW_TAGTYPE = "HwResource_Link_ownedHW";

    public static final String HWRESOURCE_LINK_P_HW_SERVICES_TAGTYPE = "HwResource_Link_p_HW_Services";

    public static final String HWRESOURCE_LINK_R_HW_SERVICES_TAGTYPE = "HwResource_Link_r_HW_Services";

    /**
     * Tells whether a {@link HwResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwResource_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwResource_Link >> then instantiate a {@link HwResourceLink} proxy.
     * 
     * @return a {@link HwResourceLink} proxy on the created {@link Link}.
     */
    public static HwResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceLink.STEREOTYPE_NAME);
        return HwResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceLink} proxy from a {@link Link} stereotyped << HwResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwResourceLink} proxy or <i>null</i>.
     */
    public static HwResourceLink instantiate(final Link obj) {
        return HwResourceLink.canInstantiate(obj) ? new HwResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceLink} proxy from a {@link Link} stereotyped << HwResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwResourceLink.canInstantiate(obj))
        	return new HwResourceLink(obj);
        else
        	throw new IllegalArgumentException("HwResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwResourceLink other = (HwResourceLink) obj;
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
     * Getter for string property 'HwResource_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwResource_Link_description() {
        return this.elt.getTagValue(HwResourceLink.MdaTypes.HWRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Link_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwResource_Link_endPoints() {
        return this.elt.getTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResource_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwResource_Link_frequency() {
        return this.elt.getTagValue(HwResourceLink.MdaTypes.HWRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Link_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwResource_Link_ownedHW() {
        return this.elt.getTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Link_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwResource_Link_p_HW_Services() {
        return this.elt.getTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Link_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwResource_Link_r_HW_Services() {
        return this.elt.getTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResource_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Link_description(final String value) {
        this.elt.putTagValue(HwResourceLink.MdaTypes.HWRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Link_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Link_endPoints(final List<String> values) {
        this.elt.putTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwResource_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Link_frequency(final String value) {
        this.elt.putTagValue(HwResourceLink.MdaTypes.HWRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Link_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Link_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Link_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Link_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Link_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Link_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceLink.MdaTypes.HWRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwResourceLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00dae378-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff68-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff6f-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff76-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff7d-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfa443f6-1013-11df-86fe-0014222a9f79");
            HWRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2e52d5bb-1709-11df-b92a-0014222a9f79");
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
