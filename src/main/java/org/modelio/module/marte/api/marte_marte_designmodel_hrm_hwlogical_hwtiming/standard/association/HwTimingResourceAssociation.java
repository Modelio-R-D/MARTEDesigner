/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.association;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.TimingResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwTimingResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwTimingResourceAssociation extends TimingResourceAssociation {
    public static final String STEREOTYPE_NAME = "HwTimingResource_Association";

    public static final String HWTIMINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE = "HwTimingResource_Association_description";

    public static final String HWTIMINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE = "HwTimingResource_Association_endPoints";

    public static final String HWTIMINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE = "HwTimingResource_Association_frequency";

    public static final String HWTIMINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE = "HwTimingResource_Association_ownedHW";

    public static final String HWTIMINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE = "HwTimingResource_Association_p_HW_Services";

    public static final String HWTIMINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE = "HwTimingResource_Association_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwTimingResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwTimingResource_Association >> then instantiate a {@link HwTimingResourceAssociation} proxy.
     * 
     * @return a {@link HwTimingResourceAssociation} proxy on the created {@link Association}.
     */
    public static HwTimingResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceAssociation.STEREOTYPE_NAME);
        return HwTimingResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceAssociation} proxy from a {@link Association} stereotyped << HwTimingResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwTimingResourceAssociation} proxy or <i>null</i>.
     */
    public static HwTimingResourceAssociation instantiate(final Association obj) {
        return HwTimingResourceAssociation.canInstantiate(obj) ? new HwTimingResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceAssociation} proxy from a {@link Association} stereotyped << HwTimingResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwTimingResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwTimingResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwTimingResourceAssociation.canInstantiate(obj))
        	return new HwTimingResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwTimingResourceAssociation other = (HwTimingResourceAssociation) obj;
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
     * Getter for string property 'HwTimingResource_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwTimingResource_Association_description() {
        return this.elt.getTagValue(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Association_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_Association_endPoints() {
        return this.elt.getTagValues(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwTimingResource_Association_frequency() {
        return this.elt.getTagValue(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Association_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_Association_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Association_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_Association_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Association_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwTimingResource_Association_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Association_description(final String value) {
        this.elt.putTagValue(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Association_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Association_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Association_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Association_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Association_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Association_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Association_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Association_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwTimingResource_Association_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAssociation.MdaTypes.HWTIMINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwTimingResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT;

        public static TagType HWTIMINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8a62fde0-10ae-11df-81d9-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48367478-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48367479-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4836747a-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4836747b-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "be22d2d6-1709-11df-b92a-0014222a9f79");
            HWTIMINGRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "57d5ae52-8dfb-11e0-8741-0027103f347c");
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
