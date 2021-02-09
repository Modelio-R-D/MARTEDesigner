/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.association;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwResourceAssociation extends ResourceAssociation {
    public static final String STEREOTYPE_NAME = "HwResource_Association";

    public static final String HWRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE = "HwResource_Association_description";

    public static final String HWRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE = "HwResource_Association_endPoints";

    public static final String HWRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE = "HwResource_Association_frequency";

    public static final String HWRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE = "HwResource_Association_ownedHW";

    public static final String HWRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE = "HwResource_Association_p_HW_Services";

    public static final String HWRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE = "HwResource_Association_r_HW_Services";

    /**
     * Tells whether a {@link HwResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwResource_Association >> then instantiate a {@link HwResourceAssociation} proxy.
     * 
     * @return a {@link HwResourceAssociation} proxy on the created {@link Association}.
     */
    public static HwResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceAssociation.STEREOTYPE_NAME);
        return HwResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceAssociation} proxy from a {@link Association} stereotyped << HwResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwResourceAssociation} proxy or <i>null</i>.
     */
    public static HwResourceAssociation instantiate(final Association obj) {
        return HwResourceAssociation.canInstantiate(obj) ? new HwResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceAssociation} proxy from a {@link Association} stereotyped << HwResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwResourceAssociation.canInstantiate(obj))
        	return new HwResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("HwResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwResourceAssociation other = (HwResourceAssociation) obj;
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
     * Getter for string property 'HwResource_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwResource_Association_description() {
        return this.elt.getTagValue(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Association_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwResource_Association_endPoints() {
        return this.elt.getTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResource_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwResource_Association_frequency() {
        return this.elt.getTagValue(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Association_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwResource_Association_ownedHW() {
        return this.elt.getTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Association_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwResource_Association_p_HW_Services() {
        return this.elt.getTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Association_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwResource_Association_r_HW_Services() {
        return this.elt.getTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResource_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Association_description(final String value) {
        this.elt.putTagValue(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Association_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Association_endPoints(final List<String> values) {
        this.elt.putTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwResource_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Association_frequency(final String value) {
        this.elt.putTagValue(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Association_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Association_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Association_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Association_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Association_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwResource_Association_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "495b5f8b-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "70448062-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "70448063-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "70448064-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7044805f-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "70448061-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3186f94b-1709-11df-b92a-0014222a9f79");
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
